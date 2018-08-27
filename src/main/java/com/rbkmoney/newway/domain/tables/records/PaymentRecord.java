/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.records;


import com.rbkmoney.newway.domain.enums.Payertype;
import com.rbkmoney.newway.domain.enums.Paymentflowtype;
import com.rbkmoney.newway.domain.enums.Paymentstatus;
import com.rbkmoney.newway.domain.enums.Paymenttooltype;
import com.rbkmoney.newway.domain.enums.Riskscore;
import com.rbkmoney.newway.domain.tables.Payment;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> {

    private static final long serialVersionUID = 1887313670;

    /**
     * Setter for <code>nw.payment.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>nw.payment.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>nw.payment.event_id</code>.
     */
    public void setEventId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>nw.payment.event_id</code>.
     */
    public Long getEventId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>nw.payment.event_created_at</code>.
     */
    public void setEventCreatedAt(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>nw.payment.event_created_at</code>.
     */
    public LocalDateTime getEventCreatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>nw.payment.payment_id</code>.
     */
    public void setPaymentId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>nw.payment.payment_id</code>.
     */
    public String getPaymentId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>nw.payment.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>nw.payment.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>nw.payment.invoice_id</code>.
     */
    public void setInvoiceId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>nw.payment.invoice_id</code>.
     */
    public String getInvoiceId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>nw.payment.party_id</code>.
     */
    public void setPartyId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>nw.payment.party_id</code>.
     */
    public String getPartyId() {
        return (String) get(6);
    }

    /**
     * Setter for <code>nw.payment.shop_id</code>.
     */
    public void setShopId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>nw.payment.shop_id</code>.
     */
    public String getShopId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>nw.payment.domain_revision</code>.
     */
    public void setDomainRevision(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>nw.payment.domain_revision</code>.
     */
    public Long getDomainRevision() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>nw.payment.party_revision</code>.
     */
    public void setPartyRevision(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>nw.payment.party_revision</code>.
     */
    public Long getPartyRevision() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>nw.payment.status</code>.
     */
    public void setStatus(Paymentstatus value) {
        set(10, value);
    }

    /**
     * Getter for <code>nw.payment.status</code>.
     */
    public Paymentstatus getStatus() {
        return (Paymentstatus) get(10);
    }

    /**
     * Setter for <code>nw.payment.status_cancelled_reason</code>.
     */
    public void setStatusCancelledReason(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>nw.payment.status_cancelled_reason</code>.
     */
    public String getStatusCancelledReason() {
        return (String) get(11);
    }

    /**
     * Setter for <code>nw.payment.status_captured_reason</code>.
     */
    public void setStatusCapturedReason(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>nw.payment.status_captured_reason</code>.
     */
    public String getStatusCapturedReason() {
        return (String) get(12);
    }

    /**
     * Setter for <code>nw.payment.status_failed_failure</code>.
     */
    public void setStatusFailedFailure(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>nw.payment.status_failed_failure</code>.
     */
    public String getStatusFailedFailure() {
        return (String) get(13);
    }

    /**
     * Setter for <code>nw.payment.amount</code>.
     */
    public void setAmount(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>nw.payment.amount</code>.
     */
    public Long getAmount() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>nw.payment.currency_code</code>.
     */
    public void setCurrencyCode(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>nw.payment.currency_code</code>.
     */
    public String getCurrencyCode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>nw.payment.payer_type</code>.
     */
    public void setPayerType(Payertype value) {
        set(16, value);
    }

    /**
     * Getter for <code>nw.payment.payer_type</code>.
     */
    public Payertype getPayerType() {
        return (Payertype) get(16);
    }

    /**
     * Setter for <code>nw.payment.payer_payment_tool_type</code>.
     */
    public void setPayerPaymentToolType(Paymenttooltype value) {
        set(17, value);
    }

    /**
     * Getter for <code>nw.payment.payer_payment_tool_type</code>.
     */
    public Paymenttooltype getPayerPaymentToolType() {
        return (Paymenttooltype) get(17);
    }

    /**
     * Setter for <code>nw.payment.payer_bank_card_token</code>.
     */
    public void setPayerBankCardToken(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>nw.payment.payer_bank_card_token</code>.
     */
    public String getPayerBankCardToken() {
        return (String) get(18);
    }

    /**
     * Setter for <code>nw.payment.payer_bank_card_payment_system</code>.
     */
    public void setPayerBankCardPaymentSystem(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>nw.payment.payer_bank_card_payment_system</code>.
     */
    public String getPayerBankCardPaymentSystem() {
        return (String) get(19);
    }

    /**
     * Setter for <code>nw.payment.payer_bank_card_bin</code>.
     */
    public void setPayerBankCardBin(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>nw.payment.payer_bank_card_bin</code>.
     */
    public String getPayerBankCardBin() {
        return (String) get(20);
    }

    /**
     * Setter for <code>nw.payment.payer_bank_card_masked_pan</code>.
     */
    public void setPayerBankCardMaskedPan(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>nw.payment.payer_bank_card_masked_pan</code>.
     */
    public String getPayerBankCardMaskedPan() {
        return (String) get(21);
    }

    /**
     * Setter for <code>nw.payment.payer_bank_card_token_provider</code>.
     */
    public void setPayerBankCardTokenProvider(String value) {
        set(22, value);
    }

    /**
     * Getter for <code>nw.payment.payer_bank_card_token_provider</code>.
     */
    public String getPayerBankCardTokenProvider() {
        return (String) get(22);
    }

    /**
     * Setter for <code>nw.payment.payer_payment_terminal_type</code>.
     */
    public void setPayerPaymentTerminalType(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>nw.payment.payer_payment_terminal_type</code>.
     */
    public String getPayerPaymentTerminalType() {
        return (String) get(23);
    }

    /**
     * Setter for <code>nw.payment.payer_digital_wallet_provider</code>.
     */
    public void setPayerDigitalWalletProvider(String value) {
        set(24, value);
    }

    /**
     * Getter for <code>nw.payment.payer_digital_wallet_provider</code>.
     */
    public String getPayerDigitalWalletProvider() {
        return (String) get(24);
    }

    /**
     * Setter for <code>nw.payment.payer_digital_wallet_id</code>.
     */
    public void setPayerDigitalWalletId(String value) {
        set(25, value);
    }

    /**
     * Getter for <code>nw.payment.payer_digital_wallet_id</code>.
     */
    public String getPayerDigitalWalletId() {
        return (String) get(25);
    }

    /**
     * Setter for <code>nw.payment.payer_payment_session_id</code>.
     */
    public void setPayerPaymentSessionId(String value) {
        set(26, value);
    }

    /**
     * Getter for <code>nw.payment.payer_payment_session_id</code>.
     */
    public String getPayerPaymentSessionId() {
        return (String) get(26);
    }

    /**
     * Setter for <code>nw.payment.payer_ip_address</code>.
     */
    public void setPayerIpAddress(String value) {
        set(27, value);
    }

    /**
     * Getter for <code>nw.payment.payer_ip_address</code>.
     */
    public String getPayerIpAddress() {
        return (String) get(27);
    }

    /**
     * Setter for <code>nw.payment.payer_fingerprint</code>.
     */
    public void setPayerFingerprint(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>nw.payment.payer_fingerprint</code>.
     */
    public String getPayerFingerprint() {
        return (String) get(28);
    }

    /**
     * Setter for <code>nw.payment.payer_phone_number</code>.
     */
    public void setPayerPhoneNumber(String value) {
        set(29, value);
    }

    /**
     * Getter for <code>nw.payment.payer_phone_number</code>.
     */
    public String getPayerPhoneNumber() {
        return (String) get(29);
    }

    /**
     * Setter for <code>nw.payment.payer_email</code>.
     */
    public void setPayerEmail(String value) {
        set(30, value);
    }

    /**
     * Getter for <code>nw.payment.payer_email</code>.
     */
    public String getPayerEmail() {
        return (String) get(30);
    }

    /**
     * Setter for <code>nw.payment.payer_customer_id</code>.
     */
    public void setPayerCustomerId(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>nw.payment.payer_customer_id</code>.
     */
    public String getPayerCustomerId() {
        return (String) get(31);
    }

    /**
     * Setter for <code>nw.payment.payer_customer_binding_id</code>.
     */
    public void setPayerCustomerBindingId(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>nw.payment.payer_customer_binding_id</code>.
     */
    public String getPayerCustomerBindingId() {
        return (String) get(32);
    }

    /**
     * Setter for <code>nw.payment.payer_customer_rec_payment_tool_id</code>.
     */
    public void setPayerCustomerRecPaymentToolId(String value) {
        set(33, value);
    }

    /**
     * Getter for <code>nw.payment.payer_customer_rec_payment_tool_id</code>.
     */
    public String getPayerCustomerRecPaymentToolId() {
        return (String) get(33);
    }

    /**
     * Setter for <code>nw.payment.context</code>.
     */
    public void setContext(byte... value) {
        set(34, value);
    }

    /**
     * Getter for <code>nw.payment.context</code>.
     */
    public byte[] getContext() {
        return (byte[]) get(34);
    }

    /**
     * Setter for <code>nw.payment.payment_flow_type</code>.
     */
    public void setPaymentFlowType(Paymentflowtype value) {
        set(35, value);
    }

    /**
     * Getter for <code>nw.payment.payment_flow_type</code>.
     */
    public Paymentflowtype getPaymentFlowType() {
        return (Paymentflowtype) get(35);
    }

    /**
     * Setter for <code>nw.payment.payment_flow_on_hold_expiration</code>.
     */
    public void setPaymentFlowOnHoldExpiration(String value) {
        set(36, value);
    }

    /**
     * Getter for <code>nw.payment.payment_flow_on_hold_expiration</code>.
     */
    public String getPaymentFlowOnHoldExpiration() {
        return (String) get(36);
    }

    /**
     * Setter for <code>nw.payment.payment_flow_held_until</code>.
     */
    public void setPaymentFlowHeldUntil(LocalDateTime value) {
        set(37, value);
    }

    /**
     * Getter for <code>nw.payment.payment_flow_held_until</code>.
     */
    public LocalDateTime getPaymentFlowHeldUntil() {
        return (LocalDateTime) get(37);
    }

    /**
     * Setter for <code>nw.payment.risk_score</code>.
     */
    public void setRiskScore(Riskscore value) {
        set(38, value);
    }

    /**
     * Getter for <code>nw.payment.risk_score</code>.
     */
    public Riskscore getRiskScore() {
        return (Riskscore) get(38);
    }

    /**
     * Setter for <code>nw.payment.route_provider_id</code>.
     */
    public void setRouteProviderId(Integer value) {
        set(39, value);
    }

    /**
     * Getter for <code>nw.payment.route_provider_id</code>.
     */
    public Integer getRouteProviderId() {
        return (Integer) get(39);
    }

    /**
     * Setter for <code>nw.payment.route_terminal_id</code>.
     */
    public void setRouteTerminalId(Integer value) {
        set(40, value);
    }

    /**
     * Getter for <code>nw.payment.route_terminal_id</code>.
     */
    public Integer getRouteTerminalId() {
        return (Integer) get(40);
    }

    /**
     * Setter for <code>nw.payment.wtime</code>.
     */
    public void setWtime(LocalDateTime value) {
        set(41, value);
    }

    /**
     * Getter for <code>nw.payment.wtime</code>.
     */
    public LocalDateTime getWtime() {
        return (LocalDateTime) get(41);
    }

    /**
     * Setter for <code>nw.payment.current</code>.
     */
    public void setCurrent(Boolean value) {
        set(42, value);
    }

    /**
     * Getter for <code>nw.payment.current</code>.
     */
    public Boolean getCurrent() {
        return (Boolean) get(42);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(Payment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(Long id, Long eventId, LocalDateTime eventCreatedAt, String paymentId, LocalDateTime createdAt, String invoiceId, String partyId, String shopId, Long domainRevision, Long partyRevision, Paymentstatus status, String statusCancelledReason, String statusCapturedReason, String statusFailedFailure, Long amount, String currencyCode, Payertype payerType, Paymenttooltype payerPaymentToolType, String payerBankCardToken, String payerBankCardPaymentSystem, String payerBankCardBin, String payerBankCardMaskedPan, String payerBankCardTokenProvider, String payerPaymentTerminalType, String payerDigitalWalletProvider, String payerDigitalWalletId, String payerPaymentSessionId, String payerIpAddress, String payerFingerprint, String payerPhoneNumber, String payerEmail, String payerCustomerId, String payerCustomerBindingId, String payerCustomerRecPaymentToolId, byte[] context, Paymentflowtype paymentFlowType, String paymentFlowOnHoldExpiration, LocalDateTime paymentFlowHeldUntil, Riskscore riskScore, Integer routeProviderId, Integer routeTerminalId, LocalDateTime wtime, Boolean current) {
        super(Payment.PAYMENT);

        set(0, id);
        set(1, eventId);
        set(2, eventCreatedAt);
        set(3, paymentId);
        set(4, createdAt);
        set(5, invoiceId);
        set(6, partyId);
        set(7, shopId);
        set(8, domainRevision);
        set(9, partyRevision);
        set(10, status);
        set(11, statusCancelledReason);
        set(12, statusCapturedReason);
        set(13, statusFailedFailure);
        set(14, amount);
        set(15, currencyCode);
        set(16, payerType);
        set(17, payerPaymentToolType);
        set(18, payerBankCardToken);
        set(19, payerBankCardPaymentSystem);
        set(20, payerBankCardBin);
        set(21, payerBankCardMaskedPan);
        set(22, payerBankCardTokenProvider);
        set(23, payerPaymentTerminalType);
        set(24, payerDigitalWalletProvider);
        set(25, payerDigitalWalletId);
        set(26, payerPaymentSessionId);
        set(27, payerIpAddress);
        set(28, payerFingerprint);
        set(29, payerPhoneNumber);
        set(30, payerEmail);
        set(31, payerCustomerId);
        set(32, payerCustomerBindingId);
        set(33, payerCustomerRecPaymentToolId);
        set(34, context);
        set(35, paymentFlowType);
        set(36, paymentFlowOnHoldExpiration);
        set(37, paymentFlowHeldUntil);
        set(38, riskScore);
        set(39, routeProviderId);
        set(40, routeTerminalId);
        set(41, wtime);
        set(42, current);
    }
}
