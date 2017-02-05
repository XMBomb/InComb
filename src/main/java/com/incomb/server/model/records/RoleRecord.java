/**
 * This class is generated by jOOQ
 */
package com.incomb.server.model.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleRecord extends org.jooq.impl.UpdatableRecordImpl<com.incomb.server.model.records.RoleRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1563558877;

	/**
	 * Setter for <code>incomb.role.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>incomb.role.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>incomb.role.name_key</code>.
	 */
	public void setNameKey(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>incomb.role.name_key</code>.
	 */
	public java.lang.String getNameKey() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return com.incomb.server.model.tables.RoleTable.ROLE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return com.incomb.server.model.tables.RoleTable.ROLE.NAME_KEY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getNameKey();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoleRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoleRecord value2(java.lang.String value) {
		setNameKey(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RoleRecord values(java.lang.Integer value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RoleRecord
	 */
	public RoleRecord() {
		super(com.incomb.server.model.tables.RoleTable.ROLE);
	}

	/**
	 * Create a detached, initialised RoleRecord
	 */
	public RoleRecord(java.lang.Integer id, java.lang.String nameKey) {
		super(com.incomb.server.model.tables.RoleTable.ROLE);

		setValue(0, id);
		setValue(1, nameKey);
	}
}
