/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables.records;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RankedBansRecord extends org.jooq.impl.UpdatableRecordImpl<mineplex.database.tables.records.RankedBansRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record4<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1051907372;

	/**
	 * Setter for <code>Account.rankedBans.accountId</code>.
	 */
	public void setAccountId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.rankedBans.accountId</code>.
	 */
	public java.lang.Integer getAccountId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Account.rankedBans.strikes</code>.
	 */
	public void setStrikes(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.rankedBans.strikes</code>.
	 */
	public java.lang.Integer getStrikes() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>Account.rankedBans.strikesExpire</code>.
	 */
	public void setStrikesExpire(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Account.rankedBans.strikesExpire</code>.
	 */
	public java.lang.String getStrikesExpire() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>Account.rankedBans.banEnd</code>.
	 */
	public void setBanEnd(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Account.rankedBans.banEnd</code>.
	 */
	public java.lang.String getBanEnd() {
		return (java.lang.String) getValue(3);
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
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return mineplex.database.tables.RankedBans.rankedBans.accountId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return mineplex.database.tables.RankedBans.rankedBans.strikes;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return mineplex.database.tables.RankedBans.rankedBans.strikesExpire;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return mineplex.database.tables.RankedBans.rankedBans.banEnd;
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
	public java.lang.Integer value2() {
		return getStrikes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getStrikesExpire();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getBanEnd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RankedBansRecord value1(java.lang.Integer value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RankedBansRecord value2(java.lang.Integer value) {
		setStrikes(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RankedBansRecord value3(java.lang.String value) {
		setStrikesExpire(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RankedBansRecord value4(java.lang.String value) {
		setBanEnd(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public RankedBansRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.String value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached RankedBansRecord
	 */
	public RankedBansRecord() {
		super(mineplex.database.tables.RankedBans.rankedBans);
	}

	/**
	 * Create a detached, initialised RankedBansRecord
	 */
	public RankedBansRecord(java.lang.Integer accountId, java.lang.Integer strikes, java.lang.String strikesExpire, java.lang.String banEnd) {
		super(mineplex.database.tables.RankedBans.rankedBans);

		setValue(0, accountId);
		setValue(1, strikes);
		setValue(2, strikesExpire);
		setValue(3, banEnd);
	}
}
