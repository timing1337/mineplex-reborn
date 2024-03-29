/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BonusLog extends org.jooq.impl.TableImpl<mineplex.database.tables.records.BonusLogRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1857845660;

	/**
	 * The reference instance of <code>Account.bonusLog</code>
	 */
	public static final mineplex.database.tables.BonusLog bonusLog = new mineplex.database.tables.BonusLog();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.BonusLogRecord> getRecordType() {
		return mineplex.database.tables.records.BonusLogRecord.class;
	}

	/**
	 * The column <code>Account.bonusLog.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BonusLogRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.bonusLog.accountId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BonusLogRecord, java.lang.Integer> accountId = createField("accountId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.bonusLog.gemChange</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BonusLogRecord, java.lang.Integer> gemChange = createField("gemChange", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>Account.bonusLog.coinChange</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BonusLogRecord, java.lang.Integer> coinChange = createField("coinChange", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>Account.bonusLog.itemId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BonusLogRecord, java.lang.Integer> itemId = createField("itemId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>Account.bonusLog.itemChange</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BonusLogRecord, java.lang.Integer> itemChange = createField("itemChange", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>Account.bonusLog.time</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.BonusLogRecord, java.sql.Timestamp> time = createField("time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

	/**
	 * Create a <code>Account.bonusLog</code> table reference
	 */
	public BonusLog() {
		this("bonusLog", null);
	}

	/**
	 * Create an aliased <code>Account.bonusLog</code> table reference
	 */
	public BonusLog(java.lang.String alias) {
		this(alias, mineplex.database.tables.BonusLog.bonusLog);
	}

	private BonusLog(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.BonusLogRecord> aliased) {
		this(alias, aliased, null);
	}

	private BonusLog(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.BonusLogRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.BonusLogRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_bonusLog;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.BonusLogRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_bonusLog_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.BonusLogRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.BonusLogRecord>>asList(mineplex.database.Keys.KEY_bonusLog_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<mineplex.database.tables.records.BonusLogRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<mineplex.database.tables.records.BonusLogRecord, ?>>asList(mineplex.database.Keys.bonusLogAccountId, mineplex.database.Keys.bonusLogItemId);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.BonusLog as(java.lang.String alias) {
		return new mineplex.database.tables.BonusLog(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.BonusLog rename(java.lang.String name) {
		return new mineplex.database.tables.BonusLog(name, null);
	}
}
