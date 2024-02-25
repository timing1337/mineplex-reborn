/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables.records;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountWebsiteLinkCodeRecord extends org.jooq.impl.UpdatableRecordImpl<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record3<java.lang.Integer, java.lang.String, java.sql.Timestamp> {

	private static final long serialVersionUID = -505757434;

	/**
	 * Setter for <code>Account.accountWebsiteLinkCode.accountId</code>.
	 */
	public void setAccountId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.accountWebsiteLinkCode.accountId</code>.
	 */
	public java.lang.Integer getAccountId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Account.accountWebsiteLinkCode.confirmationCode</code>.
	 */
	public void setConfirmationCode(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.accountWebsiteLinkCode.confirmationCode</code>.
	 */
	public java.lang.String getConfirmationCode() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>Account.accountWebsiteLinkCode.date</code>.
	 */
	public void setDate(java.sql.Timestamp value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Account.accountWebsiteLinkCode.date</code>.
	 */
	public java.sql.Timestamp getDate() {
		return (java.sql.Timestamp) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.sql.Timestamp> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.sql.Timestamp> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return mineplex.database.tables.AccountWebsiteLinkCode.accountWebsiteLinkCode.accountId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return mineplex.database.tables.AccountWebsiteLinkCode.accountWebsiteLinkCode.confirmationCode;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Timestamp> field3() {
		return mineplex.database.tables.AccountWebsiteLinkCode.accountWebsiteLinkCode.date;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getConfirmationCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Timestamp value3() {
		return getDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountWebsiteLinkCodeRecord value1(java.lang.Integer value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountWebsiteLinkCodeRecord value2(java.lang.String value) {
		setConfirmationCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountWebsiteLinkCodeRecord value3(java.sql.Timestamp value) {
		setDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountWebsiteLinkCodeRecord values(java.lang.Integer value1, java.lang.String value2, java.sql.Timestamp value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AccountWebsiteLinkCodeRecord
	 */
	public AccountWebsiteLinkCodeRecord() {
		super(mineplex.database.tables.AccountWebsiteLinkCode.accountWebsiteLinkCode);
	}

	/**
	 * Create a detached, initialised AccountWebsiteLinkCodeRecord
	 */
	public AccountWebsiteLinkCodeRecord(java.lang.Integer accountId, java.lang.String confirmationCode, java.sql.Timestamp date) {
		super(mineplex.database.tables.AccountWebsiteLinkCode.accountWebsiteLinkCode);

		setValue(0, accountId);
		setValue(1, confirmationCode);
		setValue(2, date);
	}
}