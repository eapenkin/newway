/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables.records;


import com.rbkmoney.newway.domain.tables.Provider;

import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
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
public class ProviderRecord extends UpdatableRecordImpl<ProviderRecord> implements Record14<Long, Long, Integer, String, String, Integer, String, String, String, String, String, String, LocalDateTime, Boolean> {

    private static final long serialVersionUID = 173529955;

    /**
     * Setter for <code>nw.provider.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>nw.provider.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>nw.provider.version_id</code>.
     */
    public void setVersionId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>nw.provider.version_id</code>.
     */
    public Long getVersionId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>nw.provider.provider_ref_id</code>.
     */
    public void setProviderRefId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>nw.provider.provider_ref_id</code>.
     */
    public Integer getProviderRefId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>nw.provider.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>nw.provider.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>nw.provider.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>nw.provider.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>nw.provider.proxy_ref_id</code>.
     */
    public void setProxyRefId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>nw.provider.proxy_ref_id</code>.
     */
    public Integer getProxyRefId() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>nw.provider.proxy_additional_json</code>.
     */
    public void setProxyAdditionalJson(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>nw.provider.proxy_additional_json</code>.
     */
    public String getProxyAdditionalJson() {
        return (String) get(6);
    }

    /**
     * Setter for <code>nw.provider.terminal_json</code>.
     */
    public void setTerminalJson(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>nw.provider.terminal_json</code>.
     */
    public String getTerminalJson() {
        return (String) get(7);
    }

    /**
     * Setter for <code>nw.provider.abs_account</code>.
     */
    public void setAbsAccount(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>nw.provider.abs_account</code>.
     */
    public String getAbsAccount() {
        return (String) get(8);
    }

    /**
     * Setter for <code>nw.provider.payment_terms_json</code>.
     */
    public void setPaymentTermsJson(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>nw.provider.payment_terms_json</code>.
     */
    public String getPaymentTermsJson() {
        return (String) get(9);
    }

    /**
     * Setter for <code>nw.provider.recurrent_paytool_terms_json</code>.
     */
    public void setRecurrentPaytoolTermsJson(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>nw.provider.recurrent_paytool_terms_json</code>.
     */
    public String getRecurrentPaytoolTermsJson() {
        return (String) get(10);
    }

    /**
     * Setter for <code>nw.provider.accounts_json</code>.
     */
    public void setAccountsJson(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>nw.provider.accounts_json</code>.
     */
    public String getAccountsJson() {
        return (String) get(11);
    }

    /**
     * Setter for <code>nw.provider.wtime</code>.
     */
    public void setWtime(LocalDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>nw.provider.wtime</code>.
     */
    public LocalDateTime getWtime() {
        return (LocalDateTime) get(12);
    }

    /**
     * Setter for <code>nw.provider.current</code>.
     */
    public void setCurrent(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>nw.provider.current</code>.
     */
    public Boolean getCurrent() {
        return (Boolean) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, Long, Integer, String, String, Integer, String, String, String, String, String, String, LocalDateTime, Boolean> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Long, Long, Integer, String, String, Integer, String, String, String, String, String, String, LocalDateTime, Boolean> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Provider.PROVIDER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Provider.PROVIDER.VERSION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Provider.PROVIDER.PROVIDER_REF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Provider.PROVIDER.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Provider.PROVIDER.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Provider.PROVIDER.PROXY_REF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Provider.PROVIDER.PROXY_ADDITIONAL_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Provider.PROVIDER.TERMINAL_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Provider.PROVIDER.ABS_ACCOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Provider.PROVIDER.PAYMENT_TERMS_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Provider.PROVIDER.RECURRENT_PAYTOOL_TERMS_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Provider.PROVIDER.ACCOUNTS_JSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field13() {
        return Provider.PROVIDER.WTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field14() {
        return Provider.PROVIDER.CURRENT;
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
        return getVersionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getProviderRefId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getProxyRefId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getProxyAdditionalJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getTerminalJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getAbsAccount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getPaymentTermsJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRecurrentPaytoolTermsJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getAccountsJson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value13() {
        return getWtime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value14() {
        return getCurrent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value2(Long value) {
        setVersionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value3(Integer value) {
        setProviderRefId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value6(Integer value) {
        setProxyRefId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value7(String value) {
        setProxyAdditionalJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value8(String value) {
        setTerminalJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value9(String value) {
        setAbsAccount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value10(String value) {
        setPaymentTermsJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value11(String value) {
        setRecurrentPaytoolTermsJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value12(String value) {
        setAccountsJson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value13(LocalDateTime value) {
        setWtime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord value14(Boolean value) {
        setCurrent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProviderRecord values(Long value1, Long value2, Integer value3, String value4, String value5, Integer value6, String value7, String value8, String value9, String value10, String value11, String value12, LocalDateTime value13, Boolean value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProviderRecord
     */
    public ProviderRecord() {
        super(Provider.PROVIDER);
    }

    /**
     * Create a detached, initialised ProviderRecord
     */
    public ProviderRecord(Long id, Long versionId, Integer providerRefId, String name, String description, Integer proxyRefId, String proxyAdditionalJson, String terminalJson, String absAccount, String paymentTermsJson, String recurrentPaytoolTermsJson, String accountsJson, LocalDateTime wtime, Boolean current) {
        super(Provider.PROVIDER);

        set(0, id);
        set(1, versionId);
        set(2, providerRefId);
        set(3, name);
        set(4, description);
        set(5, proxyRefId);
        set(6, proxyAdditionalJson);
        set(7, terminalJson);
        set(8, absAccount);
        set(9, paymentTermsJson);
        set(10, recurrentPaytoolTermsJson);
        set(11, accountsJson);
        set(12, wtime);
        set(13, current);
    }
}
