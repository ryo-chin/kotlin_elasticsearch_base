/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.information_schema.tables.GlobalStatus;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class GlobalStatusRecord extends TableRecordImpl<GlobalStatusRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -1000535110;

    /**
     * Setter for <code>information_schema.GLOBAL_STATUS.VARIABLE_NAME</code>.
     */
    public void setVariableName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.GLOBAL_STATUS.VARIABLE_NAME</code>.
     */
    public String getVariableName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.GLOBAL_STATUS.VARIABLE_VALUE</code>.
     */
    public void setVariableValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.GLOBAL_STATUS.VARIABLE_VALUE</code>.
     */
    public String getVariableValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return GlobalStatus.GLOBAL_STATUS.VARIABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return GlobalStatus.GLOBAL_STATUS.VARIABLE_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getVariableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getVariableValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getVariableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getVariableValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalStatusRecord value1(String value) {
        setVariableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalStatusRecord value2(String value) {
        setVariableValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GlobalStatusRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GlobalStatusRecord
     */
    public GlobalStatusRecord() {
        super(GlobalStatus.GLOBAL_STATUS);
    }

    /**
     * Create a detached, initialised GlobalStatusRecord
     */
    public GlobalStatusRecord(String variableName, String variableValue) {
        super(GlobalStatus.GLOBAL_STATUS);

        set(0, variableName);
        set(1, variableValue);
    }
}
