/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables;


import com.rbkmoney.newway.domain.Keys;
import com.rbkmoney.newway.domain.Nw;
import com.rbkmoney.newway.domain.enums.ContractorType;
import com.rbkmoney.newway.domain.enums.LegalEntity;
import com.rbkmoney.newway.domain.enums.PrivateEntity;
import com.rbkmoney.newway.domain.tables.records.ContractorRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


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
public class Contractor extends TableImpl<ContractorRecord> {

    private static final long serialVersionUID = 1923765556;

    /**
     * The reference instance of <code>nw.contractor</code>
     */
    public static final Contractor CONTRACTOR = new Contractor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractorRecord> getRecordType() {
        return ContractorRecord.class;
    }

    /**
     * The column <code>nw.contractor.id</code>.
     */
    public final TableField<ContractorRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('nw.contractor_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>nw.contractor.event_id</code>.
     */
    public final TableField<ContractorRecord, Long> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>nw.contractor.event_created_at</code>.
     */
    public final TableField<ContractorRecord, LocalDateTime> EVENT_CREATED_AT = createField("event_created_at", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>nw.contractor.party_id</code>.
     */
    public final TableField<ContractorRecord, String> PARTY_ID = createField("party_id", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>nw.contractor.contractor_id</code>.
     */
    public final TableField<ContractorRecord, String> CONTRACTOR_ID = createField("contractor_id", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>nw.contractor.type</code>.
     */
    public final TableField<ContractorRecord, ContractorType> TYPE = createField("type", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.rbkmoney.newway.domain.enums.ContractorType.class), this, "");

    /**
     * The column <code>nw.contractor.identificational_level</code>.
     */
    public final TableField<ContractorRecord, String> IDENTIFICATIONAL_LEVEL = createField("identificational_level", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.registered_user_email</code>.
     */
    public final TableField<ContractorRecord, String> REGISTERED_USER_EMAIL = createField("registered_user_email", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.legal_entity</code>.
     */
    public final TableField<ContractorRecord, LegalEntity> LEGAL_ENTITY = createField("legal_entity", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.rbkmoney.newway.domain.enums.LegalEntity.class), this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_registered_name</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_REGISTERED_NAME = createField("russian_legal_entity_registered_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_registered_number</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_REGISTERED_NUMBER = createField("russian_legal_entity_registered_number", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_inn</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_INN = createField("russian_legal_entity_inn", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_actual_address</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_ACTUAL_ADDRESS = createField("russian_legal_entity_actual_address", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_post_address</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_POST_ADDRESS = createField("russian_legal_entity_post_address", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_representative_position</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_REPRESENTATIVE_POSITION = createField("russian_legal_entity_representative_position", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_representative_full_name</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_REPRESENTATIVE_FULL_NAME = createField("russian_legal_entity_representative_full_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_representative_document</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_REPRESENTATIVE_DOCUMENT = createField("russian_legal_entity_representative_document", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_russian_bank_account</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_RUSSIAN_BANK_ACCOUNT = createField("russian_legal_entity_russian_bank_account", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_russian_bank_name</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_RUSSIAN_BANK_NAME = createField("russian_legal_entity_russian_bank_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_russian_bank_post_account</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_RUSSIAN_BANK_POST_ACCOUNT = createField("russian_legal_entity_russian_bank_post_account", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_legal_entity_russian_bank_bik</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_LEGAL_ENTITY_RUSSIAN_BANK_BIK = createField("russian_legal_entity_russian_bank_bik", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.international_legal_entity_legal_name</code>.
     */
    public final TableField<ContractorRecord, String> INTERNATIONAL_LEGAL_ENTITY_LEGAL_NAME = createField("international_legal_entity_legal_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.international_legal_entity_trading_name</code>.
     */
    public final TableField<ContractorRecord, String> INTERNATIONAL_LEGAL_ENTITY_TRADING_NAME = createField("international_legal_entity_trading_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.international_legal_entity_registered_address</code>.
     */
    public final TableField<ContractorRecord, String> INTERNATIONAL_LEGAL_ENTITY_REGISTERED_ADDRESS = createField("international_legal_entity_registered_address", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.international_legal_entity_actual_address</code>.
     */
    public final TableField<ContractorRecord, String> INTERNATIONAL_LEGAL_ENTITY_ACTUAL_ADDRESS = createField("international_legal_entity_actual_address", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.international_legal_entity_registered_number</code>.
     */
    public final TableField<ContractorRecord, String> INTERNATIONAL_LEGAL_ENTITY_REGISTERED_NUMBER = createField("international_legal_entity_registered_number", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.private_entity</code>.
     */
    public final TableField<ContractorRecord, PrivateEntity> PRIVATE_ENTITY = createField("private_entity", org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.rbkmoney.newway.domain.enums.PrivateEntity.class), this, "");

    /**
     * The column <code>nw.contractor.russian_private_entity_first_name</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_PRIVATE_ENTITY_FIRST_NAME = createField("russian_private_entity_first_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_private_entity_second_name</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_PRIVATE_ENTITY_SECOND_NAME = createField("russian_private_entity_second_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_private_entity_middle_name</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_PRIVATE_ENTITY_MIDDLE_NAME = createField("russian_private_entity_middle_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_private_entity_phone_number</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_PRIVATE_ENTITY_PHONE_NUMBER = createField("russian_private_entity_phone_number", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.russian_private_entity_email</code>.
     */
    public final TableField<ContractorRecord, String> RUSSIAN_PRIVATE_ENTITY_EMAIL = createField("russian_private_entity_email", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.contractor.wtime</code>.
     */
    public final TableField<ContractorRecord, LocalDateTime> WTIME = createField("wtime", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("timezone('utc'::text, now())", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>nw.contractor.current</code>.
     */
    public final TableField<ContractorRecord, Boolean> CURRENT = createField("current", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>nw.contractor</code> table reference
     */
    public Contractor() {
        this("contractor", null);
    }

    /**
     * Create an aliased <code>nw.contractor</code> table reference
     */
    public Contractor(String alias) {
        this(alias, CONTRACTOR);
    }

    private Contractor(String alias, Table<ContractorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Contractor(String alias, Table<ContractorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Nw.NW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ContractorRecord, Long> getIdentity() {
        return Keys.IDENTITY_CONTRACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractorRecord> getPrimaryKey() {
        return Keys.CONTRACTOR_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractorRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractorRecord>>asList(Keys.CONTRACTOR_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Contractor as(String alias) {
        return new Contractor(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Contractor rename(String name) {
        return new Contractor(name, null);
    }
}
