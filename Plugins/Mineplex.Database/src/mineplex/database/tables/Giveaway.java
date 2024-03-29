/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Giveaway extends org.jooq.impl.TableImpl<mineplex.database.tables.records.GiveawayRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -516869143;

	/**
	 * The reference instance of <code>Account.giveaway</code>
	 */
	public static final mineplex.database.tables.Giveaway giveaway = new mineplex.database.tables.Giveaway();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.GiveawayRecord> getRecordType() {
		return mineplex.database.tables.records.GiveawayRecord.class;
	}

	/**
	 * The column <code>Account.giveaway.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.giveaway.name</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(30).nullable(false), this, "");

	/**
	 * The column <code>Account.giveaway.prettyName</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.String> prettyName = createField("prettyName", org.jooq.impl.SQLDataType.VARCHAR.length(64).nullable(false), this, "");

	/**
	 * The column <code>Account.giveaway.header</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.String> header = createField("header", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this, "");

	/**
	 * The column <code>Account.giveaway.message</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.String> message = createField("message", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>Account.giveaway.max</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.Integer> max = createField("max", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.giveaway.notifyNetwork</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.Byte> notifyNetwork = createField("notifyNetwork", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.giveaway.notifyCooldown</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.Integer> notifyCooldown = createField("notifyCooldown", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), this, "");

	/**
	 * The column <code>Account.giveaway.canWinTwice</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.Byte> canWinTwice = createField("canWinTwice", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.giveaway.enabled</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.GiveawayRecord, java.lang.Byte> enabled = createField("enabled", org.jooq.impl.SQLDataType.TINYINT.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>Account.giveaway</code> table reference
	 */
	public Giveaway() {
		this("giveaway", null);
	}

	/**
	 * Create an aliased <code>Account.giveaway</code> table reference
	 */
	public Giveaway(java.lang.String alias) {
		this(alias, mineplex.database.tables.Giveaway.giveaway);
	}

	private Giveaway(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.GiveawayRecord> aliased) {
		this(alias, aliased, null);
	}

	private Giveaway(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.GiveawayRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.GiveawayRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_giveaway;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.GiveawayRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_giveaway_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.GiveawayRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.GiveawayRecord>>asList(mineplex.database.Keys.KEY_giveaway_PRIMARY, mineplex.database.Keys.KEY_giveaway_giveaway_name_uindex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.Giveaway as(java.lang.String alias) {
		return new mineplex.database.tables.Giveaway(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.Giveaway rename(java.lang.String name) {
		return new mineplex.database.tables.Giveaway(name, null);
	}
}
