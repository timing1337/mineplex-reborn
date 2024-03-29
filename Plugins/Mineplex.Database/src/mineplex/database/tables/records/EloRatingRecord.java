/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables.records;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EloRatingRecord extends org.jooq.impl.UpdatableRecordImpl<mineplex.database.tables.records.EloRatingRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record4<org.jooq.types.UInteger, java.lang.Integer, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -2140106949;

	/**
	 * Setter for <code>Account.eloRating.id</code>.
	 */
	public void setId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.eloRating.id</code>.
	 */
	public org.jooq.types.UInteger getId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>Account.eloRating.accountId</code>.
	 */
	public void setAccountId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.eloRating.accountId</code>.
	 */
	public java.lang.Integer getAccountId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>Account.eloRating.gameType</code>.
	 */
	public void setGameType(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Account.eloRating.gameType</code>.
	 */
	public java.lang.String getGameType() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>Account.eloRating.elo</code>.
	 */
	public void setElo(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Account.eloRating.elo</code>.
	 */
	public java.lang.Integer getElo() {
		return (java.lang.Integer) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.UInteger> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<org.jooq.types.UInteger, java.lang.Integer, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<org.jooq.types.UInteger, java.lang.Integer, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return mineplex.database.tables.EloRating.eloRating.id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return mineplex.database.tables.EloRating.eloRating.accountId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return mineplex.database.tables.EloRating.eloRating.gameType;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return mineplex.database.tables.EloRating.eloRating.elo;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
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
		return getGameType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getElo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EloRatingRecord value1(org.jooq.types.UInteger value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EloRatingRecord value2(java.lang.Integer value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EloRatingRecord value3(java.lang.String value) {
		setGameType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EloRatingRecord value4(java.lang.Integer value) {
		setElo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public EloRatingRecord values(org.jooq.types.UInteger value1, java.lang.Integer value2, java.lang.String value3, java.lang.Integer value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached EloRatingRecord
	 */
	public EloRatingRecord() {
		super(mineplex.database.tables.EloRating.eloRating);
	}

	/**
	 * Create a detached, initialised EloRatingRecord
	 */
	public EloRatingRecord(org.jooq.types.UInteger id, java.lang.Integer accountId, java.lang.String gameType, java.lang.Integer elo) {
		super(mineplex.database.tables.EloRating.eloRating);

		setValue(0, id);
		setValue(1, accountId);
		setValue(2, gameType);
		setValue(3, elo);
	}
}
