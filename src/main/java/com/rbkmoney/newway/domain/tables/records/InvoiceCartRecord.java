/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.records;


import com.rbkmoney.newway.domain.tables.InvoiceCart;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class InvoiceCartRecord extends UpdatableRecordImpl<InvoiceCartRecord> implements Record7<Long, Long, String, Integer, Long, String, String> {

    private static final long serialVersionUID = 269927068;

    /**
     * Setter for <code>nw.invoice_cart.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>nw.invoice_cart.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>nw.invoice_cart.inv_id</code>.
     */
    public void setInvId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>nw.invoice_cart.inv_id</code>.
     */
    public Long getInvId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>nw.invoice_cart.product</code>.
     */
    public void setProduct(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>nw.invoice_cart.product</code>.
     */
    public String getProduct() {
        return (String) get(2);
    }

    /**
     * Setter for <code>nw.invoice_cart.quantity</code>.
     */
    public void setQuantity(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>nw.invoice_cart.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>nw.invoice_cart.amount</code>.
     */
    public void setAmount(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>nw.invoice_cart.amount</code>.
     */
    public Long getAmount() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>nw.invoice_cart.currency_code</code>.
     */
    public void setCurrencyCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>nw.invoice_cart.currency_code</code>.
     */
    public String getCurrencyCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>nw.invoice_cart.metadata_json</code>.
     */
    public void setMetadataJson(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>nw.invoice_cart.metadata_json</code>.
     */
    public String getMetadataJson() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, Integer, Long, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, String, Integer, Long, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return InvoiceCart.INVOICE_CART.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return InvoiceCart.INVOICE_CART.INV_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InvoiceCart.INVOICE_CART.PRODUCT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return InvoiceCart.INVOICE_CART.QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return InvoiceCart.INVOICE_CART.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InvoiceCart.INVOICE_CART.CURRENCY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InvoiceCart.INVOICE_CART.METADATA_JSON;
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
        return getInvId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProduct();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMetadataJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCartRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCartRecord value2(Long value) {
        setInvId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCartRecord value3(String value) {
        setProduct(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCartRecord value4(Integer value) {
        setQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCartRecord value5(Long value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCartRecord value6(String value) {
        setCurrencyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCartRecord value7(String value) {
        setMetadataJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InvoiceCartRecord values(Long value1, Long value2, String value3, Integer value4, Long value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvoiceCartRecord
     */
    public InvoiceCartRecord() {
        super(InvoiceCart.INVOICE_CART);
    }

    /**
     * Create a detached, initialised InvoiceCartRecord
     */
    public InvoiceCartRecord(Long id, Long invId, String product, Integer quantity, Long amount, String currencyCode, String metadataJson) {
        super(InvoiceCart.INVOICE_CART);

        set(0, id);
        set(1, invId);
        set(2, product);
        set(3, quantity);
        set(4, amount);
        set(5, currencyCode);
        set(6, metadataJson);
    }
}