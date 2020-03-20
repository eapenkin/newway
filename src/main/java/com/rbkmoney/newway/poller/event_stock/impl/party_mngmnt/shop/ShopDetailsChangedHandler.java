package com.rbkmoney.newway.poller.event_stock.impl.party_mngmnt.shop;

import com.rbkmoney.damsel.domain.ShopDetails;
import com.rbkmoney.damsel.payment_processing.PartyChange;
import com.rbkmoney.damsel.payment_processing.ShopEffectUnit;
import com.rbkmoney.geck.common.util.TypeUtil;
import com.rbkmoney.machinegun.eventsink.MachineEvent;
import com.rbkmoney.newway.dao.party.iface.ShopDao;
import com.rbkmoney.newway.domain.tables.pojos.Shop;
import com.rbkmoney.newway.exception.NotFoundException;
import com.rbkmoney.newway.poller.event_stock.impl.party_mngmnt.AbstractClaimChangedHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Component
@RequiredArgsConstructor
public class ShopDetailsChangedHandler extends AbstractClaimChangedHandler {

    private final ShopDao shopDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void handle(PartyChange change, MachineEvent event, Integer changeId) {
        long sequenceId = event.getEventId();
        getClaimStatus(change).getAccepted().getEffects().stream()
                .filter(e -> e.isSetShopEffect() && e.getShopEffect().getEffect().isSetDetailsChanged()).forEach(e -> {
            ShopEffectUnit shopEffect = e.getShopEffect();
            ShopDetails detailsChanged = shopEffect.getEffect().getDetailsChanged();
            String shopId = shopEffect.getShopId();
            String partyId = event.getSourceId();
            log.info("Start shop detailsChanged handling, sequenceId={}, partyId={}, shopId={}, changeId={}",
                    sequenceId, partyId, shopId, changeId);
            Shop shopSource = shopDao.get(partyId, shopId);
            if (shopSource == null) {
                throw new NotFoundException(String.format("Shop not found, shopId='%s'", shopId));
            }
            shopSource.setId(null);
            shopSource.setRevision(null);
            shopSource.setWtime(null);
            shopSource.setSequenceId(sequenceId);
            shopSource.setChangeId(changeId);
            shopSource.setEventCreatedAt(TypeUtil.stringToLocalDateTime(event.getCreatedAt()));
            shopSource.setDetailsName(detailsChanged.getName());
            shopSource.setDetailsDescription(detailsChanged.getDescription());
            shopDao.save(shopSource);
            shopDao.switchCurrent(partyId, shopId);
            log.info("Shop detailsChanged has been saved, sequenceId={}, partyId={}, shopId={}, changeId={}",
                    sequenceId, partyId, shopId, changeId);
        });
    }
}
