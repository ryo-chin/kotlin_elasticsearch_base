/*
 * This file is generated by jOOQ.
 */
package jooq.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.information_schema.tables.InnodbSysDatafiles;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UInteger;


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
public class InnodbSysDatafilesRecord extends TableRecordImpl<InnodbSysDatafilesRecord> implements Record2<UInteger, String> {

    private static final long serialVersionUID = -1806123353;

    /**
     * Setter for <code>information_schema.INNODB_SYS_DATAFILES.SPACE</code>.
     */
    public void setSpace(UInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_DATAFILES.SPACE</code>.
     */
    public UInteger getSpace() {
        return (UInteger) get(0);
    }

    /**
     * Setter for <code>information_schema.INNODB_SYS_DATAFILES.PATH</code>.
     */
    public void setPath(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.INNODB_SYS_DATAFILES.PATH</code>.
     */
    public String getPath() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UInteger, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<UInteger, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UInteger> field1() {
        return InnodbSysDatafiles.INNODB_SYS_DATAFILES.SPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InnodbSysDatafiles.INNODB_SYS_DATAFILES.PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger component1() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UInteger value1() {
        return getSpace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysDatafilesRecord value1(UInteger value) {
        setSpace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysDatafilesRecord value2(String value) {
        setPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InnodbSysDatafilesRecord values(UInteger value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InnodbSysDatafilesRecord
     */
    public InnodbSysDatafilesRecord() {
        super(InnodbSysDatafiles.INNODB_SYS_DATAFILES);
    }

    /**
     * Create a detached, initialised InnodbSysDatafilesRecord
     */
    public InnodbSysDatafilesRecord(UInteger space, String path) {
        super(InnodbSysDatafiles.INNODB_SYS_DATAFILES);

        set(0, space);
        set(1, path);
    }
}
