/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables.records;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountCoinTransactionsRecord extends org.jooq.impl.UpdatableRecordImpl<mineplex.database.tables.records.AccountCoinTransactionsRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 1454061161;

	/**
	 * Setter for <code>Account.accountCoinTransactions.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.accountCoinTransactions.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Account.accountCoinTransactions.accountId</code>.
	 */
	public void setAccountId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.accountCoinTransactions.accountId</code>.
	 */
	public java.lang.Integer getAccountId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>Account.accountCoinTransactions.reason</code>.
	 */
	public void setReason(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Account.accountCoinTransactions.reason</code>.
	 */
	public java.lang.String getReason() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>Account.accountCoinTransactions.coins</code>.
	 */
	public void setCoins(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Account.accountCoinTransactions.coins</code>.
	 */
	public java.lang.Integer getCoins() {
		return (java.lang.Integer) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return mineplex.database.tables.AccountCoinTransactions.accountCoinTransactions.id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return mineplex.database.tables.AccountCoinTransactions.accountCoinTransactions.accountId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return mineplex.database.tables.AccountCoinTransactions.accountCoinTransactions.reason;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return mineplex.database.tables.AccountCoinTransactions.accountCoinTransactions.coins;
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
	public java.lang.Integer value2() {
		return getAccountId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getReason();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getCoins();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountCoinTransactionsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountCoinTransactionsRecord value2(java.lang.Integer value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountCoinTransactionsRecord value3(java.lang.String value) {
		setReason(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountCoinTransactionsRecord value4(java.lang.Integer value) {
		setCoins(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AccountCoinTransactionsRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached AccountCoinTransactionsRecord
	 */
	public AccountCoinTransactionsRecord() {
		super(mineplex.database.tables.AccountCoinTransactions.accountCoinTransactions);
	}

	/**
	 * Create a detached, initialised AccountCoinTransactionsRecord
	 */
	public AccountCoinTransactionsRecord(java.lang.Integer id, java.lang.Integer accountId, java.lang.String reason, java.lang.Integer coins) {
		super(mineplex.database.tables.AccountCoinTransactions.accountCoinTransactions);

		setValue(0, id);
		setValue(1, accountId);
		setValue(2, reason);
		setValue(3, coins);
	}
}
