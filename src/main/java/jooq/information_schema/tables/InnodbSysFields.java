/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables;


import javax.annotation.Generated;

import jooq.information_schema.InformationSchema;
import jooq.information_schema.tables.records.InnodbSysFieldsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InnodbSysFields extends TableImpl<InnodbSysFieldsRecord> {

    private static final long serialVersionUID = 2082490359;

    /**
     * The reference instance of <code>information_schema.INNODB_SYS_FIELDS</code>
     */
    public static final InnodbSysFields INNODB_SYS_FIELDS = new InnodbSysFields();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InnodbSysFieldsRecord> getRecordType() {
        return InnodbSysFieldsRecord.class;
    }

    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.INDEX_ID</code>.
     */
    public final TableField<InnodbSysFieldsRecord, ULong> INDEX_ID = createField("INDEX_ID", org.jooq.impl.SQLDataType.BIGINTUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINTUNSIGNED)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.NAME</code>.
     */
    public final TableField<InnodbSysFieldsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(193).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.INNODB_SYS_FIELDS.POS</code>.
     */
    public final TableField<InnodbSysFieldsRecord, UInteger> POS = createField("POS", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * Create a <code>information_schema.INNODB_SYS_FIELDS</code> table reference
     */
    public InnodbSysFields() {
        this(DSL.name("INNODB_SYS_FIELDS"), null);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FIELDS</code> table reference
     */
    public InnodbSysFields(String alias) {
        this(DSL.name(alias), INNODB_SYS_FIELDS);
    }

    /**
     * Create an aliased <code>information_schema.INNODB_SYS_FIELDS</code> table reference
     */
    public InnodbSysFields(Name alias) {
        this(alias, INNODB_SYS_FIELDS);
    }

    private InnodbSysFields(Name alias, Table<InnodbSysFieldsRecord> aliased) {
        this(alias, aliased, null);
    }

    private InnodbSysFields(Name alias, Table<InnodbSysFieldsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> InnodbSysFields(Table<O> child, ForeignKey<O, InnodbSysFieldsRecord> key) {
        super(child, key, INNODB_SYS_FIELDS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysFields as(String alias) {
        return new InnodbSysFields(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysFields as(Name alias) {
        return new InnodbSysFields(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysFields rename(String name) {
        return new InnodbSysFields(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public InnodbSysFields rename(Name name) {
        return new InnodbSysFields(name, null);
    }
}
