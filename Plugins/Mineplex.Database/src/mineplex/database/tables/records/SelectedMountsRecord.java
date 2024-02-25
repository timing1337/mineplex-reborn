/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables.records;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SelectedMountsRecord extends org.jooq.impl.TableRecordImpl<mineplex.database.tables.records.SelectedMountsRecord> implements java.io.Serializable, java.lang.Cloneable, org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1082236189;

	/**
	 * Setter for <code>Account.selectedMounts.accountId</code>.
	 */
	public void setAccountId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>Account.selectedMounts.accountId</code>.
	 */
	public java.lang.Integer getAccountId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>Account.selectedMounts.selected</code>.
	 */
	public void setSelected(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>Account.selectedMounts.selected</code>.
	 */
	public java.lang.String getSelected() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return mineplex.database.tables.SelectedMounts.selectedMounts.accountId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return mineplex.database.tables.SelectedMounts.selectedMounts.selected;
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
		return getSelected();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SelectedMountsRecord value1(java.lang.Integer value) {
		setAccountId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SelectedMountsRecord value2(java.lang.String value) {
		setSelected(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SelectedMountsRecord values(java.lang.Integer value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SelectedMountsRecord
	 */
	public SelectedMountsRecord() {
		super(mineplex.database.tables.SelectedMounts.selectedMounts);
	}

	/**
	 * Create a detached, initialised SelectedMountsRecord
	 */
	public SelectedMountsRecord(java.lang.Integer accountId, java.lang.String selected) {
		super(mineplex.database.tables.SelectedMounts.selectedMounts);

		setValue(0, accountId);
		setValue(1, selected);
	}
}
