/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables.records;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClansGoldRecord extends org.jooq.impl.UpdatableRecordImpl<mineplex.database.tables.records.ClansGoldRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -90641108;

	/**
	 * Setter for <code>Account.clansGold.serverId</code>.
	 */
	public void setServerId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.clansGold.serverId</code>.
	 */
	public java.lang.Integer getServerId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Account.clansGold.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.clansGold.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>Account.clansGold.gold</code>.
	 */
	public void setGold(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Account.clansGold.gold</code>.
	 */
	public java.lang.Integer getGold() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.Integer, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return mineplex.database.tables.ClansGold.clansGold.serverId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return mineplex.database.tables.ClansGold.clansGold.id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return mineplex.database.tables.ClansGold.clansGold.gold;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getServerId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getGold();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansGoldRecord value1(java.lang.Integer value) {
		setServerId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansGoldRecord value2(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansGoldRecord value3(java.lang.Integer value) {
		setGold(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ClansGoldRecord values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ClansGoldRecord
	 */
	public ClansGoldRecord() {
		super(mineplex.database.tables.ClansGold.clansGold);
	}

	/**
	 * Create a detached, initialised ClansGoldRecord
	 */
	public ClansGoldRecord(java.lang.Integer serverId, java.lang.Integer id, java.lang.Integer gold) {
		super(mineplex.database.tables.ClansGold.clansGold);

		setValue(0, serverId);
		setValue(1, id);
		setValue(2, gold);
	}
}
