/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountWebsiteLinkCode extends org.jooq.impl.TableImpl<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 2114439433;

	/**
	 * The reference instance of <code>Account.accountWebsiteLinkCode</code>
	 */
	public static final mineplex.database.tables.AccountWebsiteLinkCode accountWebsiteLinkCode = new mineplex.database.tables.AccountWebsiteLinkCode();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord> getRecordType() {
		return mineplex.database.tables.records.AccountWebsiteLinkCodeRecord.class;
	}

	/**
	 * The column <code>Account.accountWebsiteLinkCode.accountId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord, java.lang.Integer> accountId = createField("accountId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.accountWebsiteLinkCode.confirmationCode</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord, java.lang.String> confirmationCode = createField("confirmationCode", org.jooq.impl.SQLDataType.CHAR.length(6).nullable(false), this, "");

	/**
	 * The column <code>Account.accountWebsiteLinkCode.date</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord, java.sql.Timestamp> date = createField("date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>Account.accountWebsiteLinkCode</code> table reference
	 */
	public AccountWebsiteLinkCode() {
		this("accountWebsiteLinkCode", null);
	}

	/**
	 * Create an aliased <code>Account.accountWebsiteLinkCode</code> table reference
	 */
	public AccountWebsiteLinkCode(java.lang.String alias) {
		this(alias, mineplex.database.tables.AccountWebsiteLinkCode.accountWebsiteLinkCode);
	}

	private AccountWebsiteLinkCode(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord> aliased) {
		this(alias, aliased, null);
	}

	private AccountWebsiteLinkCode(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_accountWebsiteLinkCode_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord>>asList(mineplex.database.Keys.KEY_accountWebsiteLinkCode_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<mineplex.database.tables.records.AccountWebsiteLinkCodeRecord, ?>>asList(mineplex.database.Keys.accountWebsiteLinkCode_ibfk_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.AccountWebsiteLinkCode as(java.lang.String alias) {
		return new mineplex.database.tables.AccountWebsiteLinkCode(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.AccountWebsiteLinkCode rename(java.lang.String name) {
		return new mineplex.database.tables.AccountWebsiteLinkCode(name, null);
	}
}
