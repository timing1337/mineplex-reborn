/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables.records;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FieldBlockRecord extends org.jooq.impl.UpdatableRecordImpl<mineplex.database.tables.records.FieldBlockRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Byte, java.lang.Integer, java.lang.Byte, java.lang.Integer, java.lang.Double, java.lang.String> {

	private static final long serialVersionUID = 1246274827;

	/**
	 * Setter for <code>Account.fieldBlock.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Account.fieldBlock.server</code>.
	 */
	public void setServer(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.server</code>.
	 */
	public java.lang.String getServer() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>Account.fieldBlock.location</code>.
	 */
	public void setLocation(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.location</code>.
	 */
	public java.lang.String getLocation() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>Account.fieldBlock.blockId</code>.
	 */
	public void setBlockId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.blockId</code>.
	 */
	public java.lang.Integer getBlockId() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>Account.fieldBlock.blockData</code>.
	 */
	public void setBlockData(java.lang.Byte value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.blockData</code>.
	 */
	public java.lang.Byte getBlockData() {
		return (java.lang.Byte) getValue(4);
	}

	/**
	 * Setter for <code>Account.fieldBlock.emptyId</code>.
	 */
	public void setEmptyId(java.lang.Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.emptyId</code>.
	 */
	public java.lang.Integer getEmptyId() {
		return (java.lang.Integer) getValue(5);
	}

	/**
	 * Setter for <code>Account.fieldBlock.emptyData</code>.
	 */
	public void setEmptyData(java.lang.Byte value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.emptyData</code>.
	 */
	public java.lang.Byte getEmptyData() {
		return (java.lang.Byte) getValue(6);
	}

	/**
	 * Setter for <code>Account.fieldBlock.stockMax</code>.
	 */
	public void setStockMax(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.stockMax</code>.
	 */
	public java.lang.Integer getStockMax() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>Account.fieldBlock.stockRegenTime</code>.
	 */
	public void setStockRegenTime(java.lang.Double value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.stockRegenTime</code>.
	 */
	public java.lang.Double getStockRegenTime() {
		return (java.lang.Double) getValue(8);
	}

	/**
	 * Setter for <code>Account.fieldBlock.loot</code>.
	 */
	public void setLoot(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>Account.fieldBlock.loot</code>.
	 */
	public java.lang.String getLoot() {
		return (java.lang.String) getValue(9);
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
	// Record10 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Byte, java.lang.Integer, java.lang.Byte, java.lang.Integer, java.lang.Double, java.lang.String> fieldsRow() {
		return (org.jooq.Row10) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row10<java.lang.Integer, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Byte, java.lang.Integer, java.lang.Byte, java.lang.Integer, java.lang.Double, java.lang.String> valuesRow() {
		return (org.jooq.Row10) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return mineplex.database.tables.FieldBlock.fieldBlock.id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return mineplex.database.tables.FieldBlock.fieldBlock.server;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return mineplex.database.tables.FieldBlock.fieldBlock.location;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return mineplex.database.tables.FieldBlock.fieldBlock.blockId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field5() {
		return mineplex.database.tables.FieldBlock.fieldBlock.blockData;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field6() {
		return mineplex.database.tables.FieldBlock.fieldBlock.emptyId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field7() {
		return mineplex.database.tables.FieldBlock.fieldBlock.emptyData;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return mineplex.database.tables.FieldBlock.fieldBlock.stockMax;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field9() {
		return mineplex.database.tables.FieldBlock.fieldBlock.stockRegenTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return mineplex.database.tables.FieldBlock.fieldBlock.loot;
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
		return getServer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLocation();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getBlockId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value5() {
		return getBlockData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value6() {
		return getEmptyId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value7() {
		return getEmptyData();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getStockMax();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value9() {
		return getStockRegenTime();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getLoot();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value2(java.lang.String value) {
		setServer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value3(java.lang.String value) {
		setLocation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value4(java.lang.Integer value) {
		setBlockId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value5(java.lang.Byte value) {
		setBlockData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value6(java.lang.Integer value) {
		setEmptyId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value7(java.lang.Byte value) {
		setEmptyData(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value8(java.lang.Integer value) {
		setStockMax(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value9(java.lang.Double value) {
		setStockRegenTime(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord value10(java.lang.String value) {
		setLoot(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldBlockRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.lang.Integer value4, java.lang.Byte value5, java.lang.Integer value6, java.lang.Byte value7, java.lang.Integer value8, java.lang.Double value9, java.lang.String value10) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FieldBlockRecord
	 */
	public FieldBlockRecord() {
		super(mineplex.database.tables.FieldBlock.fieldBlock);
	}

	/**
	 * Create a detached, initialised FieldBlockRecord
	 */
	public FieldBlockRecord(java.lang.Integer id, java.lang.String server, java.lang.String location, java.lang.Integer blockId, java.lang.Byte blockData, java.lang.Integer emptyId, java.lang.Byte emptyData, java.lang.Integer stockMax, java.lang.Double stockRegenTime, java.lang.String loot) {
		super(mineplex.database.tables.FieldBlock.fieldBlock);

		setValue(0, id);
		setValue(1, server);
		setValue(2, location);
		setValue(3, blockId);
		setValue(4, blockData);
		setValue(5, emptyId);
		setValue(6, emptyData);
		setValue(7, stockMax);
		setValue(8, stockRegenTime);
		setValue(9, loot);
	}
}
