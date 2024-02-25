/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaffMotd extends org.jooq.impl.TableImpl<mineplex.database.tables.records.StaffMotdRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -306255583;

	/**
	 * The reference instance of <code>Account.staffMotd</code>
	 */
	public static final mineplex.database.tables.StaffMotd staffMotd = new mineplex.database.tables.StaffMotd();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.StaffMotdRecord> getRecordType() {
		return mineplex.database.tables.records.StaffMotdRecord.class;
	}

	/**
	 * The column <code>Account.staffMotd.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StaffMotdRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.staffMotd.date</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StaffMotdRecord, java.sql.Timestamp> date = createField("date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.staffMotd.accountId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StaffMotdRecord, java.lang.Integer> accountId = createField("accountId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.staffMotd.title</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StaffMotdRecord, java.lang.String> title = createField("title", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>Account.staffMotd.text</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StaffMotdRecord, java.lang.String> text = createField("text", org.jooq.impl.SQLDataType.CLOB.length(16777215), this, "");

	/**
	 * Create a <code>Account.staffMotd</code> table reference
	 */
	public StaffMotd() {
		this("staffMotd", null);
	}

	/**
	 * Create an aliased <code>Account.staffMotd</code> table reference
	 */
	public StaffMotd(java.lang.String alias) {
		this(alias, mineplex.database.tables.StaffMotd.staffMotd);
	}

	private StaffMotd(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.StaffMotdRecord> aliased) {
		this(alias, aliased, null);
	}

	private StaffMotd(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.StaffMotdRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.StaffMotdRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_staffMotd;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.StaffMotdRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_staffMotd_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.StaffMotdRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.StaffMotdRecord>>asList(mineplex.database.Keys.KEY_staffMotd_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.StaffMotd as(java.lang.String alias) {
		return new mineplex.database.tables.StaffMotd(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.StaffMotd rename(java.lang.String name) {
		return new mineplex.database.tables.StaffMotd(name, null);
	}
}
