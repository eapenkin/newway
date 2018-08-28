package com.rbkmoney.newway.poller.handler.impl.party_mngmnt.shop;

import com.rbkmoney.damsel.domain.Shop;
import com.rbkmoney.damsel.payment_processing.Event;
import com.rbkmoney.damsel.payment_processing.PartyChange;
import com.rbkmoney.damsel.payment_processing.ShopEffectUnit;
import com.rbkmoney.geck.common.util.TypeUtil;
import com.rbkmoney.geck.filter.Filter;
import com.rbkmoney.geck.filter.PathConditionFilter;
import com.rbkmoney.geck.filter.condition.IsNullCondition;
import com.rbkmoney.geck.filter.rule.PathConditionRule;
import com.rbkmoney.newway.dao.party.iface.ShopDao;
import com.rbkmoney.newway.poller.handler.impl.party_mngmnt.AbstractPartyManagementHandler;
import com.rbkmoney.newway.util.ShopUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class ShopCreatedHandler extends AbstractPartyManagementHandler {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final ShopDao shopDao;

    private final Filter filter;

    public ShopCreatedHandler(ShopDao shopDao) {
        this.shopDao = shopDao;
        this.filter = new PathConditionFilter(new PathConditionRule(
                "claim_created.status.accepted",
                new IsNullCondition().not()));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void handle(PartyChange change, Event event) {
        long eventId = event.getId();
        change.getClaimCreated().getStatus().getAccepted().getEffects().stream()
                .filter(e -> e.isSetShopEffect() && e.getShopEffect().getEffect().isSetCreated()).forEach(e -> {
            ShopEffectUnit shopEffect = e.getShopEffect();
            Shop shopCreated = shopEffect.getEffect().getCreated();
            String shopId = shopEffect.getShopId();
            String partyId = event.getSource().getPartyId();
            log.info("Start shop created handling, eventId={}, partyId={}, shopId={}", eventId, shopId);
            com.rbkmoney.newway.domain.tables.pojos.Shop shop = new com.rbkmoney.newway.domain.tables.pojos.Shop();
            shop.setEventId(eventId);
            shop.setEventCreatedAt(TypeUtil.stringToLocalDateTime(event.getCreatedAt()));
            shop.setShopId(shopId);
            shop.setPartyId(partyId);
            shop.setCreatedAt(TypeUtil.stringToLocalDateTime(shopCreated.getCreatedAt()));
            com.rbkmoney.newway.domain.enums.Blocking blocking = TypeUtil.toEnumField(shopCreated.getBlocking().getSetField().getFieldName(), com.rbkmoney.newway.domain.enums.Blocking.class);
            if (blocking == null) {
                throw new IllegalArgumentException("Illegal shop blocking: " + shopCreated.getBlocking());
            }
            shop.setBlocking(blocking);
            if (shopCreated.getBlocking().isSetUnblocked()) {
                shop.setBlockingUnblockedReason(shopCreated.getBlocking().getUnblocked().getReason());
                shop.setBlockingUnblockedSince(TypeUtil.stringToLocalDateTime(shopCreated.getBlocking().getUnblocked().getSince()));
            } else if (shopCreated.getBlocking().isSetBlocked()) {
                shop.setBlockingBlockedReason(shopCreated.getBlocking().getBlocked().getReason());
                shop.setBlockingBlockedSince(TypeUtil.stringToLocalDateTime(shopCreated.getBlocking().getBlocked().getSince()));
            }
            com.rbkmoney.newway.domain.enums.Suspension suspension = TypeUtil.toEnumField(shopCreated.getSuspension().getSetField().getFieldName(), com.rbkmoney.newway.domain.enums.Suspension.class);
            if (suspension == null) {
                throw new IllegalArgumentException("Illegal shop suspension: " + shopCreated.getSuspension());
            }
            shop.setSuspension(suspension);
            if (shopCreated.getSuspension().isSetActive()) {
                shop.setSuspensionActiveSince(TypeUtil.stringToLocalDateTime(shopCreated.getSuspension().getActive().getSince()));
            } else if (shopCreated.getSuspension().isSetSuspended()) {
                shop.setSuspensionSuspendedSince(TypeUtil.stringToLocalDateTime(shopCreated.getSuspension().getSuspended().getSince()));
            }
            if (shopCreated.getLocation().isSetUrl()) {
                shop.setLocationUrl(shopCreated.getLocation().getUrl());
            } else {
                throw new IllegalArgumentException("Illegal shop location " + shopCreated.getLocation());
            }
            shop.setCategoryId(shopCreated.getCategory().getId());
            if (shopCreated.isSetAccount()) {
                ShopUtil.fillShopAccount(shop, shopCreated.getAccount());
            }
            shop.setContractId(shopCreated.getContractId());
            shop.setPayoutToolId(shopCreated.getPayoutToolId());
            if (shopCreated.isSetPayoutSchedule()) {
                shop.setPayoutScheduleId(shopCreated.getPayoutSchedule().getId());
            }
            shopDao.save(shop);
            log.info("Shop has been saved, eventId={}, shopId={}", eventId, shopId);
        });
    }


    @Override
    public Filter<PartyChange> getFilter() {
        return filter;
    }
}
