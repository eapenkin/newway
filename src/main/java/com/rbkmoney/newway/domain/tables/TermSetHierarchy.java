/*
 * This file is generated by jOOQ.
*/
package com.rbkmoney.newway.domain.tables;


import com.rbkmoney.newway.domain.Keys;
import com.rbkmoney.newway.domain.Nw;
import com.rbkmoney.newway.domain.tables.records.TermSetHierarchyRecord;

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
public class TermSetHierarchy extends TableImpl<TermSetHierarchyRecord> {

    private static final long serialVersionUID = -1332091628;

    /**
     * The reference instance of <code>nw.term_set_hierarchy</code>
     */
    public static final TermSetHierarchy TERM_SET_HIERARCHY = new TermSetHierarchy();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TermSetHierarchyRecord> getRecordType() {
        return TermSetHierarchyRecord.class;
    }

    /**
     * The column <code>nw.term_set_hierarchy.id</code>.
     */
    public final TableField<TermSetHierarchyRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('nw.term_set_hierarchy_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>nw.term_set_hierarchy.version_id</code>.
     */
    public final TableField<TermSetHierarchyRecord, Long> VERSION_ID = createField("version_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>nw.term_set_hierarchy.term_set_hierarchy_ref_id</code>.
     */
    public final TableField<TermSetHierarchyRecord, Integer> TERM_SET_HIERARCHY_REF_ID = createField("term_set_hierarchy_ref_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>nw.term_set_hierarchy.name</code>.
     */
    public final TableField<TermSetHierarchyRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.term_set_hierarchy.description</code>.
     */
    public final TableField<TermSetHierarchyRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>nw.term_set_hierarchy.parent_terms_ref_id</code>.
     */
    public final TableField<TermSetHierarchyRecord, Integer> PARENT_TERMS_REF_ID = createField("parent_terms_ref_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>nw.term_set_hierarchy.term_sets_json</code>.
     */
    public final TableField<TermSetHierarchyRecord, String> TERM_SETS_JSON = createField("term_sets_json", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>nw.term_set_hierarchy.wtime</code>.
     */
    public final TableField<TermSetHierarchyRecord, LocalDateTime> WTIME = createField("wtime", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("timezone('utc'::text, now())", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>nw.term_set_hierarchy.current</code>.
     */
    public final TableField<TermSetHierarchyRecord, Boolean> CURRENT = createField("current", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.field("true", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>nw.term_set_hierarchy</code> table reference
     */
    public TermSetHierarchy() {
        this("term_set_hierarchy", null);
    }

    /**
     * Create an aliased <code>nw.term_set_hierarchy</code> table reference
     */
    public TermSetHierarchy(String alias) {
        this(alias, TERM_SET_HIERARCHY);
    }

    private TermSetHierarchy(String alias, Table<TermSetHierarchyRecord> aliased) {
        this(alias, aliased, null);
    }

    private TermSetHierarchy(String alias, Table<TermSetHierarchyRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TermSetHierarchyRecord, Long> getIdentity() {
        return Keys.IDENTITY_TERM_SET_HIERARCHY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TermSetHierarchyRecord> getPrimaryKey() {
        return Keys.TERM_SET_HIERARCHY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TermSetHierarchyRecord>> getKeys() {
        return Arrays.<UniqueKey<TermSetHierarchyRecord>>asList(Keys.TERM_SET_HIERARCHY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TermSetHierarchy as(String alias) {
        return new TermSetHierarchy(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TermSetHierarchy rename(String name) {
        return new TermSetHierarchy(name, null);
    }
}
