/**
 * This class is generated by jOOQ
 */
package com.incomb.server.model.dao.internal;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InternalFlyWithDao extends org.jooq.impl.DAOImpl<com.incomb.server.model.records.FlyWithRecord, com.incomb.server.model.FlyWith, org.jooq.Record2<java.lang.Long, java.lang.Long>> {

	/**
	 * Create a new InternalFlyWithDao without any configuration
	 */
	public InternalFlyWithDao() {
		super(com.incomb.server.model.tables.FlyWithTable.FLY_WITH, com.incomb.server.model.FlyWith.class);
	}

	/**
	 * Create a new InternalFlyWithDao with an attached configuration
	 */
	public InternalFlyWithDao(org.jooq.Configuration configuration) {
		super(com.incomb.server.model.tables.FlyWithTable.FLY_WITH, com.incomb.server.model.FlyWith.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected org.jooq.Record2<java.lang.Long, java.lang.Long> getId(com.incomb.server.model.FlyWith object) {
		return compositeKeyRecord(object.getUserId(), object.getFlyWithId());
	}

	/**
	 * Fetch records that have <code>user_id IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.FlyWith> fetchByUserId(java.lang.Long... values) {
		return fetch(com.incomb.server.model.tables.FlyWithTable.FLY_WITH.USER_ID, values);
	}

	/**
	 * Fetch records that have <code>fly_with_id IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.FlyWith> fetchByFlyWithId(java.lang.Long... values) {
		return fetch(com.incomb.server.model.tables.FlyWithTable.FLY_WITH.FLY_WITH_ID, values);
	}

	/**
	 * Fetch records that have <code>fly_with_start_date IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.FlyWith> fetchByFlyWithStartDate(java.sql.Timestamp... values) {
		return fetch(com.incomb.server.model.tables.FlyWithTable.FLY_WITH.FLY_WITH_START_DATE, values);
	}
}
