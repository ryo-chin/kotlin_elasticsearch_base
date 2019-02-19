/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.information_schema.tables.ReferentialConstraints;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class ReferentialConstraintsRecord extends TableRecordImpl<ReferentialConstraintsRecord> implements Record11<String, String, String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -1213683293;

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG</code>.
     */
    public void setUniqueConstraintCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG</code>.
     */
    public String getUniqueConstraintCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA</code>.
     */
    public void setUniqueConstraintSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA</code>.
     */
    public String getUniqueConstraintSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME</code>.
     */
    public void setUniqueConstraintName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME</code>.
     */
    public String getUniqueConstraintName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.MATCH_OPTION</code>.
     */
    public void setMatchOption(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.MATCH_OPTION</code>.
     */
    public String getMatchOption() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.UPDATE_RULE</code>.
     */
    public void setUpdateRule(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.UPDATE_RULE</code>.
     */
    public String getUpdateRule() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.DELETE_RULE</code>.
     */
    public void setDeleteRule(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.DELETE_RULE</code>.
     */
    public String getDeleteRule() {
        return (String) get(8);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>information_schema.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME</code>.
     */
    public void setReferencedTableName(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>information_schema.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME</code>.
     */
    public String getReferencedTableName() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<String, String, String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.MATCH_OPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UPDATE_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.DELETE_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME;
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
        return getUniqueConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUniqueConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUniqueConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMatchOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUpdateRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDeleteRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getTableName();
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
        return getUniqueConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUniqueConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUniqueConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMatchOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUpdateRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDeleteRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTableName();
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
    public ReferentialConstraintsRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value4(String value) {
        setUniqueConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value5(String value) {
        setUniqueConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value6(String value) {
        setUniqueConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value7(String value) {
        setMatchOption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value8(String value) {
        setUpdateRule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value9(String value) {
        setDeleteRule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value10(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value11(String value) {
        setReferencedTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReferentialConstraintsRecord
     */
    public ReferentialConstraintsRecord() {
        super(ReferentialConstraints.REFERENTIAL_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised ReferentialConstraintsRecord
     */
    public ReferentialConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String uniqueConstraintCatalog, String uniqueConstraintSchema, String uniqueConstraintName, String matchOption, String updateRule, String deleteRule, String tableName, String referencedTableName) {
        super(ReferentialConstraints.REFERENTIAL_CONSTRAINTS);

        set(0, constraintCatalog);
        set(1, constraintSchema);
        set(2, constraintName);
        set(3, uniqueConstraintCatalog);
        set(4, uniqueConstraintSchema);
        set(5, uniqueConstraintName);
        set(6, matchOption);
        set(7, updateRule);
        set(8, deleteRule);
        set(9, tableName);
        set(10, referencedTableName);
    }
}
