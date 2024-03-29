/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Transactions extends org.jooq.impl.TableImpl<mineplex.database.tables.records.TransactionsRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 513318870;

	/**
	 * The reference instance of <code>Account.transactions</code>
	 */
	public static final mineplex.database.tables.Transactions transactions = new mineplex.database.tables.Transactions();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.TransactionsRecord> getRecordType() {
		return mineplex.database.tables.records.TransactionsRecord.class;
	}

	/**
	 * The column <code>Account.transactions.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.TransactionsRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.transactions.name</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.TransactionsRecord, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false), this, "");

	/**
	 * Create a <code>Account.transactions</code> table reference
	 */
	public Transactions() {
		this("transactions", null);
	}

	/**
	 * Create an aliased <code>Account.transactions</code> table reference
	 */
	public Transactions(java.lang.String alias) {
		this(alias, mineplex.database.tables.Transactions.transactions);
	}

	private Transactions(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.TransactionsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Transactions(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.TransactionsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.TransactionsRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_transactions;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.TransactionsRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_transactions_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.TransactionsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.TransactionsRecord>>asList(mineplex.database.Keys.KEY_transactions_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.Transactions as(java.lang.String alias) {
		return new mineplex.database.tables.Transactions(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.Transactions rename(java.lang.String name) {
		return new mineplex.database.tables.Transactions(name, null);
	}
}
