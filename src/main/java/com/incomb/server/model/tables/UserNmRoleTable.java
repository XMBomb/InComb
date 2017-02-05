/**
 * This class is generated by jOOQ
 */
package com.incomb.server.model.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserNmRoleTable extends org.jooq.impl.TableImpl<com.incomb.server.model.records.UserNmRoleRecord> {

	private static final long serialVersionUID = -413236093;

	/**
	 * The reference instance of <code>incomb.user_nm_role</code>
	 */
	public static final com.incomb.server.model.tables.UserNmRoleTable USER_NM_ROLE = new com.incomb.server.model.tables.UserNmRoleTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.incomb.server.model.records.UserNmRoleRecord> getRecordType() {
		return com.incomb.server.model.records.UserNmRoleRecord.class;
	}

	/**
	 * The column <code>incomb.user_nm_role.user_id</code>.
	 */
	public final org.jooq.TableField<com.incomb.server.model.records.UserNmRoleRecord, java.lang.Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>incomb.user_nm_role.role_id</code>.
	 */
	public final org.jooq.TableField<com.incomb.server.model.records.UserNmRoleRecord, java.lang.Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * Create a <code>incomb.user_nm_role</code> table reference
	 */
	public UserNmRoleTable() {
		this("user_nm_role", null);
	}

	/**
	 * Create an aliased <code>incomb.user_nm_role</code> table reference
	 */
	public UserNmRoleTable(java.lang.String alias) {
		this(alias, com.incomb.server.model.tables.UserNmRoleTable.USER_NM_ROLE);
	}

	private UserNmRoleTable(java.lang.String alias, org.jooq.Table<com.incomb.server.model.records.UserNmRoleRecord> aliased) {
		this(alias, aliased, null);
	}

	private UserNmRoleTable(java.lang.String alias, org.jooq.Table<com.incomb.server.model.records.UserNmRoleRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, com.incomb.server.model.tables.IncombTable.INCOMB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.incomb.server.model.records.UserNmRoleRecord> getPrimaryKey() {
		return com.incomb.server.model.tables.Keys.KEY_USER_NM_ROLE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.incomb.server.model.records.UserNmRoleRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.incomb.server.model.records.UserNmRoleRecord>>asList(com.incomb.server.model.tables.Keys.KEY_USER_NM_ROLE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<com.incomb.server.model.records.UserNmRoleRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<com.incomb.server.model.records.UserNmRoleRecord, ?>>asList(com.incomb.server.model.tables.Keys.FK_USER_HAS_ROLE_USER, com.incomb.server.model.tables.Keys.FK_USER_HAS_ROLE_ROLE1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.incomb.server.model.tables.UserNmRoleTable as(java.lang.String alias) {
		return new com.incomb.server.model.tables.UserNmRoleTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public com.incomb.server.model.tables.UserNmRoleTable rename(java.lang.String name) {
		return new com.incomb.server.model.tables.UserNmRoleTable(name, null);
	}
}
