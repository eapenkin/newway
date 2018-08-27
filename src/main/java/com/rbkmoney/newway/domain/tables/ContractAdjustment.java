/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables;


import com.rbkmoney.newway.domain.Keys;
import com.rbkmoney.newway.domain.Nw;
import com.rbkmoney.newway.domain.tables.records.ContractAdjustmentRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class ContractAdjustment extends TableImpl<ContractAdjustmentRecord> {

    private static final long serialVersionUID = -2080711086;

    /**
     * The reference instance of <code>nw.contract_adjustment</code>
     */
    public static final ContractAdjustment CONTRACT_ADJUSTMENT = new ContractAdjustment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ContractAdjustmentRecord> getRecordType() {
        return ContractAdjustmentRecord.class;
    }

    /**
     * The column <code>nw.contract_adjustment.id</code>.
     */
    public final TableField<ContractAdjustmentRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('nw.contract_adjustment_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>nw.contract_adjustment.cntrct_id</code>.
     */
    public final TableField<ContractAdjustmentRecord, Long> CNTRCT_ID = createField("cntrct_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>nw.contract_adjustment.contract_adjustment_id</code>.
     */
    public final TableField<ContractAdjustmentRecord, String> CONTRACT_ADJUSTMENT_ID = createField("contract_adjustment_id", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>nw.contract_adjustment.created_at</code>.
     */
    public final TableField<ContractAdjustmentRecord, LocalDateTime> CREATED_AT = createField("created_at", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>nw.contract_adjustment.valid_since</code>.
     */
    public final TableField<ContractAdjustmentRecord, LocalDateTime> VALID_SINCE = createField("valid_since", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>nw.contract_adjustment.valid_until</code>.
     */
    public final TableField<ContractAdjustmentRecord, LocalDateTime> VALID_UNTIL = createField("valid_until", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>nw.contract_adjustment.terms_id</code>.
     */
    public final TableField<ContractAdjustmentRecord, Integer> TERMS_ID = createField("terms_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>nw.contract_adjustment</code> table reference
     */
    public ContractAdjustment() {
        this("contract_adjustment", null);
    }

    /**
     * Create an aliased <code>nw.contract_adjustment</code> table reference
     */
    public ContractAdjustment(String alias) {
        this(alias, CONTRACT_ADJUSTMENT);
    }

    private ContractAdjustment(String alias, Table<ContractAdjustmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private ContractAdjustment(String alias, Table<ContractAdjustmentRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ContractAdjustmentRecord, Long> getIdentity() {
        return Keys.IDENTITY_CONTRACT_ADJUSTMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ContractAdjustmentRecord> getPrimaryKey() {
        return Keys.CONTRACT_ADJUSTMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ContractAdjustmentRecord>> getKeys() {
        return Arrays.<UniqueKey<ContractAdjustmentRecord>>asList(Keys.CONTRACT_ADJUSTMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ContractAdjustmentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ContractAdjustmentRecord, ?>>asList(Keys.CONTRACT_ADJUSTMENT__FK_ADJUSTMENT_TO_CONTRACT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractAdjustment as(String alias) {
        return new ContractAdjustment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ContractAdjustment rename(String name) {
        return new ContractAdjustment(name, null);
    }
}