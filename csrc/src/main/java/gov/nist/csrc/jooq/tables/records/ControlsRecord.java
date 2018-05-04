/*
 * This file is generated by jOOQ.
*/
package gov.nist.csrc.jooq.tables.records;


import gov.nist.csrc.jooq.tables.Controls;

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
        "jOOQ version:3.10.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ControlsRecord extends UpdatableRecordImpl<ControlsRecord> implements Record7<Integer, String, Integer, Integer, Integer, String, String> {

    private static final long serialVersionUID = 1229854538;

    /**
     * Setter for <code>Controls.Id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Controls.Id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Controls.Name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Controls.Name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Controls.BaselineId</code>.
     */
    public void setBaselineid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Controls.BaselineId</code>.
     */
    public Integer getBaselineid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Controls.FamilyId</code>.
     */
    public void setFamilyid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Controls.FamilyId</code>.
     */
    public Integer getFamilyid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Controls.PriorityId</code>.
     */
    public void setPriorityid(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Controls.PriorityId</code>.
     */
    public Integer getPriorityid() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Controls.Description</code>.
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Controls.Description</code>.
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Controls.Guidance</code>.
     */
    public void setGuidance(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Controls.Guidance</code>.
     */
    public String getGuidance() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Integer, Integer, Integer, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, Integer, Integer, Integer, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Controls.CONTROLS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Controls.CONTROLS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Controls.CONTROLS.BASELINEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Controls.CONTROLS.FAMILYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Controls.CONTROLS.PRIORITYID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Controls.CONTROLS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Controls.CONTROLS.GUIDANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getBaselineid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getFamilyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPriorityid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getGuidance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getBaselineid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFamilyid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPriorityid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getGuidance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlsRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlsRecord value3(Integer value) {
        setBaselineid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlsRecord value4(Integer value) {
        setFamilyid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlsRecord value5(Integer value) {
        setPriorityid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlsRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlsRecord value7(String value) {
        setGuidance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ControlsRecord values(Integer value1, String value2, Integer value3, Integer value4, Integer value5, String value6, String value7) {
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
     * Create a detached ControlsRecord
     */
    public ControlsRecord() {
        super(Controls.CONTROLS);
    }

    /**
     * Create a detached, initialised ControlsRecord
     */
    public ControlsRecord(Integer id, String name, Integer baselineid, Integer familyid, Integer priorityid, String description, String guidance) {
        super(Controls.CONTROLS);

        set(0, id);
        set(1, name);
        set(2, baselineid);
        set(3, familyid);
        set(4, priorityid);
        set(5, description);
        set(6, guidance);
    }
}