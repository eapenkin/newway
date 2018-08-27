package com.rbkmoney.newway.poller.handler.impl.payout;

import com.rbkmoney.damsel.domain.BankCard;
import com.rbkmoney.damsel.domain.InternationalBankAccount;
import com.rbkmoney.damsel.domain.RussianBankAccount;
import com.rbkmoney.damsel.payout_processing.*;
import com.rbkmoney.geck.common.util.TypeUtil;
import com.rbkmoney.geck.filter.Filter;
import com.rbkmoney.geck.filter.PathConditionFilter;
import com.rbkmoney.geck.filter.condition.IsNullCondition;
import com.rbkmoney.geck.filter.rule.PathConditionRule;
import com.rbkmoney.newway.dao.payout.iface.PayoutDao;
import com.rbkmoney.newway.dao.payout.iface.PayoutSummaryDao;
import com.rbkmoney.newway.domain.enums.*;
import com.rbkmoney.newway.domain.tables.pojos.Payout;
import com.rbkmoney.newway.domain.tables.pojos.PayoutSummary;
import com.rbkmoney.newway.util.PayoutUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class PayoutCreatedHandler extends AbstractPayoutHandler {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final PayoutDao payoutDao;
    private final PayoutSummaryDao payoutSummaryDao;

    private final Filter filter;

    public PayoutCreatedHandler(PayoutDao payoutDao, PayoutSummaryDao payoutSummaryDao) {
        this.payoutDao = payoutDao;
        this.payoutSummaryDao = payoutSummaryDao;
        this.filter = new PathConditionFilter(new PathConditionRule(
                "payout_created",
                new IsNullCondition().not()));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void handle(PayoutChange change, Event event) {
        long eventId = event.getId();
        com.rbkmoney.damsel.payout_processing.Payout payoutCreated = change.getPayoutCreated().getPayout();
        String payoutId = payoutCreated.getId();
        String partyId = payoutCreated.getPartyId();
        log.info("Start payout created handling, eventId={}, partyId={}, payoutId={}", eventId, partyId, payoutId);
        Payout payout = new Payout();
        payout.setEventId(eventId);
        payout.setEventCreatedAt(TypeUtil.stringToLocalDateTime(event.getCreatedAt()));
        payout.setPayoutId(payoutCreated.getId());
        payout.setPartyId(partyId);
        payout.setShopId(payoutCreated.getShopId());
        payout.setContractId(payoutCreated.getContractId());
        payout.setCreatedAt(TypeUtil.stringToLocalDateTime(payoutCreated.getCreatedAt()));
        Payoutstatus payoutstatus = TypeUtil.toEnumField(payoutCreated.getStatus().getSetField().getFieldName(), Payoutstatus.class);
        if (payoutstatus == null) {
            throw new IllegalArgumentException("Illegal payout status: " + payoutCreated.getStatus());
        }
        payout.setStatus(payoutstatus);
        if (payoutCreated.getStatus().isSetPaid()) {
            PaidDetails details = payoutCreated.getStatus().getPaid().getDetails();
            Payoutpaidstatusdetails paidDetails = TypeUtil.toEnumField(details.getSetField().getFieldName(), Payoutpaidstatusdetails.class);
            if (paidDetails == null) {
                throw new IllegalArgumentException("Illegal paid details: " + details);
            }
            payout.setStatusPaidDetails(paidDetails);
            if (details.isSetCardDetails()) {
                payout.setStatusPaidDetailsCardProviderName(details.getCardDetails().getProviderDetails().getName());
                payout.setStatusPaidDetailsCardProviderTransactionId(details.getCardDetails().getProviderDetails().getTransactionId());
            }
        } else if (payoutCreated.getStatus().isSetCancelled()) {
            PayoutCancelled cancelled = payoutCreated.getStatus().getCancelled();
            payout.setStatusCancelledUserInfoId(cancelled.getUserInfo().getId());
            Usertype statusCancelledUserInfoType = TypeUtil.toEnumField(cancelled.getUserInfo().getType().getSetField().getFieldName(), Usertype.class);
            if (statusCancelledUserInfoType == null) {
                throw new IllegalArgumentException("Illegal user type: " + cancelled.getUserInfo().getType());
            }
            payout.setStatusCancelledUserInfoType(statusCancelledUserInfoType);
            payout.setStatusCancelledDetails(cancelled.getDetails());
        } if (payoutCreated.getStatus().isSetConfirmed()) {
            UserInfo confirmedUserInfo = payoutCreated.getStatus().getConfirmed().getUserInfo();
            Usertype statusCondirmedUserInfoType = TypeUtil.toEnumField(confirmedUserInfo.getType().getSetField().getFieldName(), Usertype.class);
            if (statusCondirmedUserInfoType == null) {
                throw new IllegalArgumentException("Illegal user type: " + confirmedUserInfo.getType());
            }
            payout.setStatusConfirmedUserInfoType(statusCondirmedUserInfoType);
        }
        Payouttype payoutType = TypeUtil.toEnumField(payoutCreated.getType().getSetField().getFieldName(), Payouttype.class);
        if (payoutType == null ) {
            throw new IllegalArgumentException("Illegal payout type: " + payoutCreated.getType());
        }
        payout.setType(payoutType);
        if (payoutCreated.getType().isSetBankCard()) {
            BankCard card = payoutCreated.getType().getBankCard().getCard();
            payout.setTypeCardToken(card.getToken());
            payout.setTypeCardPaymentSystem(card.getPaymentSystem().name());
            payout.setTypeCardBin(card.getBin());
            payout.setTypeCardMaskedPan(card.getMaskedPan());
            payout.setTypeCardTokenProvider(card.getTokenProvider().name());
        } else if (payoutCreated.getType().isSetBankAccount()) {
            PayoutAccount payoutAccount = payoutCreated.getType().getBankAccount();
            Payoutaccounttype payoutaccounttype = TypeUtil.toEnumField(payoutAccount.getSetField().getFieldName(), Payoutaccounttype.class);
            if (payoutaccounttype == null) {
                throw new IllegalArgumentException("Illegal payout account type: " + payoutAccount);
            }
            payout.setTypeAccountType(payoutaccounttype);
            if (payoutAccount.isSetRussianPayoutAccount()) {
                RussianPayoutAccount russianPayoutAccount = payoutAccount.getRussianPayoutAccount();
                RussianBankAccount russianBankAccount = russianPayoutAccount.getBankAccount();
                payout.setTypeAccountRussianAccount(russianBankAccount.getAccount());
                payout.setTypeAccountRussianBankName(russianBankAccount.getBankName());
                payout.setTypeAccountRussianBankPostAccount(russianBankAccount.getBankPostAccount());
                payout.setTypeAccountRussianBankBik(russianBankAccount.getBankBik());
                payout.setTypeAccountRussianInn(russianPayoutAccount.getInn());
                payout.setTypeAccountPurpose(russianPayoutAccount.getPurpose());
                payout.setTypeAccountLegalAgreementSignedAt(TypeUtil.stringToLocalDateTime(russianPayoutAccount.getLegalAgreement().getSignedAt()));
                payout.setTypeAccountLegalAgreementId(russianPayoutAccount.getLegalAgreement().getLegalAgreementId());
                if (russianPayoutAccount.getLegalAgreement().isSetValidUntil()) {
                    payout.setTypeAccountLegalAgreementValidUntil(TypeUtil.stringToLocalDateTime(russianPayoutAccount.getLegalAgreement().getValidUntil()));
                }
            } else if (payoutAccount.isSetInternationalPayoutAccount()) {
                InternationalPayoutAccount internationalPayoutAccount = payoutAccount.getInternationalPayoutAccount();
                InternationalBankAccount bankAccount = internationalPayoutAccount.getBankAccount();
                payout.setTypeAccountInternationalAccountHolder(bankAccount.getAccountHolder());
                payout.setTypeAccountInternationalBankName(bankAccount.getBankName());
                payout.setTypeAccountInternationalBankAddress(bankAccount.getBankAddress());
                payout.setTypeAccountInternationalIban(bankAccount.getIban());
                payout.setTypeAccountInternationalBic(bankAccount.getBic());
                payout.setTypeAccountInternationalLocalBankCode(bankAccount.getLocalBankCode());
                payout.setTypeAccountInternationalLegalEntityLegalName(internationalPayoutAccount.getLegalEntity().getLegalName());
                payout.setTypeAccountInternationalLegalEntityTradingName(internationalPayoutAccount.getLegalEntity().getTradingName());
                payout.setTypeAccountInternationalLegalEntityRegisteredAddress(internationalPayoutAccount.getLegalEntity().getRegisteredAddress());
                payout.setTypeAccountInternationalLegalEntityActualAddress(internationalPayoutAccount.getLegalEntity().getActualAddress());
                payout.setTypeAccountInternationalLegalEntityRegisteredNumber(internationalPayoutAccount.getLegalEntity().getRegisteredNumber());
                payout.setTypeAccountPurpose(internationalPayoutAccount.getPurpose());
                payout.setTypeAccountLegalAgreementSignedAt(TypeUtil.stringToLocalDateTime(internationalPayoutAccount.getLegalAgreement().getSignedAt()));
                payout.setTypeAccountLegalAgreementId(internationalPayoutAccount.getLegalAgreement().getLegalAgreementId());
                if (internationalPayoutAccount.getLegalAgreement().isSetValidUntil()) {
                    payout.setTypeAccountLegalAgreementValidUntil(TypeUtil.stringToLocalDateTime(internationalPayoutAccount.getLegalAgreement().getValidUntil()));
                }
            }
        }
        payout.setInitiatorId(change.getPayoutCreated().getInitiator().getId());
        Usertype usertype = TypeUtil.toEnumField(change.getPayoutCreated().getInitiator().getType().getSetField().getFieldName(), Usertype.class);
        if (usertype == null) {
            throw new IllegalArgumentException("Illegal user type: " + change.getPayoutCreated().getInitiator().getType());
        }
        payout.setInitiatorType(usertype);
        long pytId = payoutDao.save(payout);
        if (payoutCreated.isSetSummary()) {
            List<PayoutSummary> payoutSummaries = PayoutUtil.convertPayoutSummaries(payoutCreated, pytId);
            payoutSummaryDao.save(payoutSummaries);
        }
        log.info("Payout has been saved, eventId={}, partyId={}, payoutId={}", eventId, partyId, payoutId);
    }

    @Override
    public Filter<PayoutChange> getFilter() {
        return filter;
    }
}