/**
 * This class is generated by jOOQ
 */
package com.incomb.server.model.dao.internal;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InternalContentCommentDao extends org.jooq.impl.DAOImpl<com.incomb.server.model.records.ContentCommentRecord, com.incomb.server.model.ContentComment, java.lang.Long> {

	/**
	 * Create a new InternalContentCommentDao without any configuration
	 */
	public InternalContentCommentDao() {
		super(com.incomb.server.model.tables.ContentCommentTable.CONTENT_COMMENT, com.incomb.server.model.ContentComment.class);
	}

	/**
	 * Create a new InternalContentCommentDao with an attached configuration
	 */
	public InternalContentCommentDao(org.jooq.Configuration configuration) {
		super(com.incomb.server.model.tables.ContentCommentTable.CONTENT_COMMENT, com.incomb.server.model.ContentComment.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Long getId(com.incomb.server.model.ContentComment object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.ContentComment> fetchById(java.lang.Long... values) {
		return fetch(com.incomb.server.model.tables.ContentCommentTable.CONTENT_COMMENT.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>id = value</code>
	 */
	public com.incomb.server.model.ContentComment fetchOneById(java.lang.Long value) {
		return fetchOne(com.incomb.server.model.tables.ContentCommentTable.CONTENT_COMMENT.ID, value);
	}

	/**
	 * Fetch records that have <code>user_id IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.ContentComment> fetchByUserId(java.lang.Long... values) {
		return fetch(com.incomb.server.model.tables.ContentCommentTable.CONTENT_COMMENT.USER_ID, values);
	}

	/**
	 * Fetch records that have <code>content_id IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.ContentComment> fetchByContentId(java.lang.Long... values) {
		return fetch(com.incomb.server.model.tables.ContentCommentTable.CONTENT_COMMENT.CONTENT_ID, values);
	}

	/**
	 * Fetch records that have <code>comment_date IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.ContentComment> fetchByCommentDate(java.sql.Timestamp... values) {
		return fetch(com.incomb.server.model.tables.ContentCommentTable.CONTENT_COMMENT.COMMENT_DATE, values);
	}

	/**
	 * Fetch records that have <code>comment IN (values)</code>
	 */
	public java.util.List<com.incomb.server.model.ContentComment> fetchByComment(java.lang.String... values) {
		return fetch(com.incomb.server.model.tables.ContentCommentTable.CONTENT_COMMENT.COMMENT, values);
	}
}
