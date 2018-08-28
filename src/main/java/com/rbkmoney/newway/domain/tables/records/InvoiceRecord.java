/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.records;


import com.rbkmoney.newway.domain.enums.InvoiceStatus;
import com.rbkmoney.newway.domain.tables.Invoice;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class InvoiceRecord extends UpdatableRecordImpl<InvoiceRecord> implements Record20<Long, Long, LocalDateTime, String, String, String, Long, LocalDateTime, InvoiceStatus, String, String, String, String, LocalDateTime, Long, String, byte[], String, LocalDateTime, Boolean> {

    private static final long serialVersionUID = -621061419;

    /**
     * Setter for <code>nw.invoice.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>nw.invoice.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>nw.invoice.event_id</code>.
     */
    public void setEventId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>nw.invoice.event_id</code>.
     */
    public Long getEventId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>nw.invoice.event_created_at</code>.
     */
    public void setEventCreatedAt(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>nw.invoice.event_created_at</code>.
     */
    public LocalDateTime getEventCreatedAt() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>nw.invoice.invoice_id</code>.
     */
    public void setInvoiceId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>nw.invoice.invoice_id</code>.
     */
    public String getInvoiceId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>nw.invoice.party_id</code>.
     */
    public void setPartyId(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>nw.invoice.party_id</code>.
     */
    public String getPartyId() {
        return (String) get(4);
    }

    /**
     * Setter for <code>nw.invoice.shop_id</code>.
     */
    public void setShopId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>nw.invoice.shop_id</code>.
     */
    public String getShopId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>nw.invoice.party_revision</code>.
     */
    public void setPartyRevision(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>nw.invoice.party_revision</code>.
     */
    public Long getPartyRevision() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>nw.invoice.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>nw.invoice.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>nw.invoice.status</code>.
     */
    public void setStatus(InvoiceStatus value) {
        set(8, value);
    }

    /**
     * Getter for <code>nw.invoice.status</code>.
     */
    public InvoiceStatus getStatus() {
        return (InvoiceStatus) get(8);
    }

    /**
     * Setter for <code>nw.invoice.status_cancelled_details</code>.
     */
    public void setStatusCancelledDetails(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>nw.invoice.status_cancelled_details</code>.
     */
    public String getStatusCancelledDetails() {
        return (String) get(9);
    }

    /**
     * Setter for <code>nw.invoice.status_fulfilled_details</code>.
     */
    public void setStatusFulfilledDetails(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>nw.invoice.status_fulfilled_details</code>.
     */
    public String getStatusFulfilledDetails() {
        return (String) get(10);
    }

    /**
     * Setter for <code>nw.invoice.details_product</code>.
     */
    public void setDetailsProduct(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>nw.invoice.details_product</code>.
     */
    public String getDetailsProduct() {
        return (String) get(11);
    }

    /**
     * Setter for <code>nw.invoice.details_description</code>.
     */
    public void setDetailsDescription(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>nw.invoice.details_description</code>.
     */
    public String getDetailsDescription() {
        return (String) get(12);
    }

    /**
     * Setter for <code>nw.invoice.due</code>.
     */
    public void setDue(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>nw.invoice.due</code>.
     */
    public LocalDateTime getDue() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>nw.invoice.amount</code>.
     */
    public void setAmount(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>nw.invoice.amount</code>.
     */
    public Long getAmount() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>nw.invoice.currency_code</code>.
     */
    public void setCurrencyCode(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>nw.invoice.currency_code</code>.
     */
    public String getCurrencyCode() {
        return (String) get(15);
    }

    /**
     * Setter for <code>nw.invoice.context</code>.
     */
    public void setContext(byte... value) {
        set(16, value);
    }

    /**
     * Getter for <code>nw.invoice.context</code>.
     */
    public byte[] getContext() {
        return (byte[]) get(16);
    }

    /**
     * Setter for <code>nw.invoice.template_id</code>.
     */
    public void setTemplateId(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>nw.invoice.template_id</code>.
     */
    public String getTemplateId() {
        return (String) get(17);
    }

    /**
     * Setter for <code>nw.invoice.wtime</code>.
     */
    public void setWtime(LocalDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>nw.invoice.wtime</code>.
     */
    public LocalDateTime getWtime() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>nw.invoice.current</code>.
     */
    public void setCurrent(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>nw.invoice.current</code>.
     */
    public Boolean getCurrent() {
        return (Boolean) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, Long, LocalDateTime, String, String, String, Long, LocalDateTime, InvoiceStatus, String, String, String, String, LocalDateTime, Long, String, byte[], String, LocalDateTime, Boolean> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Long, Long, LocalDateTime, String, String, String, Long, LocalDateTime, InvoiceStatus, String, String, String, String, LocalDateTime, Long, String, byte[], String, LocalDateTime, Boolean> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Invoice.INVOICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Invoice.INVOICE.EVENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field3() {
        return Invoice.INVOICE.EVENT_CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Invoice.INVOICE.INVOICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Invoice.INVOICE.PARTY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Invoice.INVOICE.SHOP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Invoice.INVOICE.PARTY_REVISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field8() {
        return Invoice.INVOICE.CREATED_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<InvoiceStatus> field9() {
        return Invoice.INVOICE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Invoice.INVOICE.STATUS_CANCELLED_DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Invoice.INVOICE.STATUS_FULFILLED_DETAILS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Invoice.INVOICE.DETAILS_PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Invoice.INVOICE.DETAILS_DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field14() {
        return Invoice.INVOICE.DUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return Invoice.INVOICE.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Invoice.INVOICE.CURRENCY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field17() {
        return Invoice.INVOICE.CONTEXT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field18() {
        return Invoice.INVOICE.TEMPLATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field19() {
        return Invoice.INVOICE.WTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field20() {
        return Invoice.INVOICE.CURRENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getEventId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value3() {
        return getEventCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInvoiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPartyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getShopId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getPartyRevision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value8() {
        return getCreatedAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceStatus value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getStatusCancelledDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getStatusFulfilledDetails();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getDetailsProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getDetailsDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value14() {
        return getDue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value17() {
        return getContext();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value18() {
        return getTemplateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value19() {
        return getWtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value20() {
        return getCurrent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value2(Long value) {
        setEventId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value3(LocalDateTime value) {
        setEventCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value4(String value) {
        setInvoiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value5(String value) {
        setPartyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value6(String value) {
        setShopId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value7(Long value) {
        setPartyRevision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value8(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value9(InvoiceStatus value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value10(String value) {
        setStatusCancelledDetails(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value11(String value) {
        setStatusFulfilledDetails(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value12(String value) {
        setDetailsProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value13(String value) {
        setDetailsDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value14(LocalDateTime value) {
        setDue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value15(Long value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value16(String value) {
        setCurrencyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value17(byte... value) {
        setContext(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value18(String value) {
        setTemplateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value19(LocalDateTime value) {
        setWtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord value20(Boolean value) {
        setCurrent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceRecord values(Long value1, Long value2, LocalDateTime value3, String value4, String value5, String value6, Long value7, LocalDateTime value8, InvoiceStatus value9, String value10, String value11, String value12, String value13, LocalDateTime value14, Long value15, String value16, byte[] value17, String value18, LocalDateTime value19, Boolean value20) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvoiceRecord
     */
    public InvoiceRecord() {
        super(Invoice.INVOICE);
    }

    /**
     * Create a detached, initialised InvoiceRecord
     */
    public InvoiceRecord(Long id, Long eventId, LocalDateTime eventCreatedAt, String invoiceId, String partyId, String shopId, Long partyRevision, LocalDateTime createdAt, InvoiceStatus status, String statusCancelledDetails, String statusFulfilledDetails, String detailsProduct, String detailsDescription, LocalDateTime due, Long amount, String currencyCode, byte[] context, String templateId, LocalDateTime wtime, Boolean current) {
        super(Invoice.INVOICE);

        set(0, id);
        set(1, eventId);
        set(2, eventCreatedAt);
        set(3, invoiceId);
        set(4, partyId);
        set(5, shopId);
        set(6, partyRevision);
        set(7, createdAt);
        set(8, status);
        set(9, statusCancelledDetails);
        set(10, statusFulfilledDetails);
        set(11, detailsProduct);
        set(12, detailsDescription);
        set(13, due);
        set(14, amount);
        set(15, currencyCode);
        set(16, context);
        set(17, templateId);
        set(18, wtime);
        set(19, current);
    }
}
