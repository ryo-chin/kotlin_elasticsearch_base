/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.information_schema.tables.KeyColumnUsage;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


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
public class KeyColumnUsageRecord extends TableRecordImpl<KeyColumnUsageRecord> implements Record12<String, String, String, String, String, String, String, Long, Long, String, String, String> {

    private static final long serialVersionUID = 696413222;

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
     */
    public void setOrdinalPosition(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.ORDINAL_POSITION</code>.
     */
    public Long getOrdinalPosition() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
     */
    public void setPositionInUniqueConstraint(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT</code>.
     */
    public Long getPositionInUniqueConstraint() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
     */
    public void setReferencedTableSchema(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA</code>.
     */
    public String getReferencedTableSchema() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
     */
    public void setReferencedTableName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME</code>.
     */
    public String getReferencedTableName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
     */
    public void setReferencedColumnName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>information_schema.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME</code>.
     */
    public String getReferencedColumnName() {
        return (String) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, String, String, String, Long, Long, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, String, String, String, String, String, String, Long, Long, String, String, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.ORDINAL_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.POSITION_IN_UNIQUE_CONSTRAINT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return KeyColumnUsage.KEY_COLUMN_USAGE.REFERENCED_COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getPositionInUniqueConstraint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getReferencedTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getReferencedTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getReferencedColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getPositionInUniqueConstraint();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getReferencedTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getReferencedTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getReferencedColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value4(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value5(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value6(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value7(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value8(Long value) {
        setOrdinalPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value9(Long value) {
        setPositionInUniqueConstraint(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value10(String value) {
        setReferencedTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value11(String value) {
        setReferencedTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord value12(String value) {
        setReferencedColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KeyColumnUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, Long value8, Long value9, String value10, String value11, String value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KeyColumnUsageRecord
     */
    public KeyColumnUsageRecord() {
        super(KeyColumnUsage.KEY_COLUMN_USAGE);
    }

    /**
     * Create a detached, initialised KeyColumnUsageRecord
     */
    public KeyColumnUsageRecord(String constraintCatalog, String constraintSchema, String constraintName, String tableCatalog, String tableSchema, String tableName, String columnName, Long ordinalPosition, Long positionInUniqueConstraint, String referencedTableSchema, String referencedTableName, String referencedColumnName) {
        super(KeyColumnUsage.KEY_COLUMN_USAGE);

        set(0, constraintCatalog);
        set(1, constraintSchema);
        set(2, constraintName);
        set(3, tableCatalog);
        set(4, tableSchema);
        set(5, tableName);
        set(6, columnName);
        set(7, ordinalPosition);
        set(8, positionInUniqueConstraint);
        set(9, referencedTableSchema);
        set(10, referencedTableName);
        set(11, referencedColumnName);
    }
}
