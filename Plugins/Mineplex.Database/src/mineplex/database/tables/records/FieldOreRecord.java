/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables.records;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FieldOreRecord extends org.jooq.impl.UpdatableRecordImpl<mineplex.database.tables.records.FieldOreRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1341399574;

	/**
	 * Setter for <code>Account.fieldOre.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.fieldOre.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Account.fieldOre.server</code>.
	 */
	public void setServer(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.fieldOre.server</code>.
	 */
	public java.lang.String getServer() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>Account.fieldOre.location</code>.
	 */
	public void setLocation(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>Account.fieldOre.location</code>.
	 */
	public java.lang.String getLocation() {
		return (java.lang.String) getValue(2);
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
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return mineplex.database.tables.FieldOre.fieldOre.id;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return mineplex.database.tables.FieldOre.fieldOre.server;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return mineplex.database.tables.FieldOre.fieldOre.location;
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
	public FieldOreRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldOreRecord value2(java.lang.String value) {
		setServer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldOreRecord value3(java.lang.String value) {
		setLocation(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public FieldOreRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached FieldOreRecord
	 */
	public FieldOreRecord() {
		super(mineplex.database.tables.FieldOre.fieldOre);
	}

	/**
	 * Create a detached, initialised FieldOreRecord
	 */
	public FieldOreRecord(java.lang.Integer id, java.lang.String server, java.lang.String location) {
		super(mineplex.database.tables.FieldOre.fieldOre);

		setValue(0, id);
		setValue(1, server);
		setValue(2, location);
	}
}
