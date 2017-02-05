/**
 * This class is generated by jOOQ
 */
package com.incomb.server.model.dao.internal;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InternalRoleNmPermissionDao extends org.jooq.impl.DAOImpl<com.incomb.server.model.records.RoleNmPermissionRecord, com.incomb.server.model.RoleNmPermission, org.jooq.Record2<java.lang.Integer, java.lang.Integer>> {

	/**
	 * Create a new InternalRoleNmPermissionDao without any configuration
	 */
	public InternalRoleNmPermissionDao() {
		super(com.incomb.server.model.tables.RoleNmPermissionTable.ROLE_NM_PERMISSION, com.incomb.server.model.RoleNmPermission.class);
	}

	/**
	 * Create a new InternalRoleNmPermissionDao with an attached configuration
	 */
	public InternalRoleNmPermissionDao(org.jooq.Configuration configuration) {
		super(com.incomb.server.model.tables.RoleNmPermissionTable.ROLE_NM_PERMISSION, com.incomb.server.model.RoleNmPermission.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.Integer, java.lang.Integer> getId(com.incomb.server.model.RoleNmPermission object) {
		return compositeKeyRecord(object.getRoleId(), object.getPermissionId());
	}

	/**
	 * Fetch records that have <code>role_id IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.RoleNmPermission> fetchByRoleId(java.lang.Integer... values) {
		return fetch(com.incomb.server.model.tables.RoleNmPermissionTable.ROLE_NM_PERMISSION.ROLE_ID, values);
	}

	/**
	 * Fetch records that have <code>permission_id IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.RoleNmPermission> fetchByPermissionId(java.lang.Integer... values) {
		return fetch(com.incomb.server.model.tables.RoleNmPermissionTable.ROLE_NM_PERMISSION.PERMISSION_ID, values);
	}
}
