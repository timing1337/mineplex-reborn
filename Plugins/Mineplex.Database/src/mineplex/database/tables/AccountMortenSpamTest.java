/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AccountMortenSpamTest extends org.jooq.impl.TableImpl<mineplex.database.tables.records.AccountMortenSpamTestRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -519595750;

	/**
	 * The reference instance of <code>Account.accountMortenSpamTest</code>
	 */
	public static final mineplex.database.tables.AccountMortenSpamTest accountMortenSpamTest = new mineplex.database.tables.AccountMortenSpamTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.AccountMortenSpamTestRecord> getRecordType() {
		return mineplex.database.tables.records.AccountMortenSpamTestRecord.class;
	}

	/**
	 * The column <code>Account.accountMortenSpamTest.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.AccountMortenSpamTestRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.accountMortenSpamTest.accountId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.AccountMortenSpamTestRecord, java.lang.Integer> accountId = createField("accountId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.accountMortenSpamTest.text</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.AccountMortenSpamTestRecord, java.lang.String> text = createField("text", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

	/**
	 * The column <code>Account.accountMortenSpamTest.punished</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.AccountMortenSpamTestRecord, java.lang.Integer> punished = createField("punished", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * The column <code>Account.accountMortenSpamTest.amountPunished</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.AccountMortenSpamTestRecord, java.lang.Integer> amountPunished = createField("amountPunished", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>Account.accountMortenSpamTest</code> table reference
	 */
	public AccountMortenSpamTest() {
		this("accountMortenSpamTest", null);
	}

	/**
	 * Create an aliased <code>Account.accountMortenSpamTest</code> table reference
	 */
	public AccountMortenSpamTest(java.lang.String alias) {
		this(alias, mineplex.database.tables.AccountMortenSpamTest.accountMortenSpamTest);
	}

	private AccountMortenSpamTest(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.AccountMortenSpamTestRecord> aliased) {
		this(alias, aliased, null);
	}

	private AccountMortenSpamTest(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.AccountMortenSpamTestRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.AccountMortenSpamTestRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_accountMortenSpamTest;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.AccountMortenSpamTestRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_accountMortenSpamTest_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.AccountMortenSpamTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.AccountMortenSpamTestRecord>>asList(mineplex.database.Keys.KEY_accountMortenSpamTest_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<mineplex.database.tables.records.AccountMortenSpamTestRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<mineplex.database.tables.records.AccountMortenSpamTestRecord, ?>>asList(mineplex.database.Keys.MORTEN_ACCOUNT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.AccountMortenSpamTest as(java.lang.String alias) {
		return new mineplex.database.tables.AccountMortenSpamTest(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.AccountMortenSpamTest rename(java.lang.String name) {
		return new mineplex.database.tables.AccountMortenSpamTest(name, null);
	}
}
