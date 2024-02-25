/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClanBans extends org.jooq.impl.TableImpl<mineplex.database.tables.records.ClanBansRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1230268694;

	/**
	 * The reference instance of <code>Account.clanBans</code>
	 */
	public static final mineplex.database.tables.ClanBans clanBans = new mineplex.database.tables.ClanBans();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.ClanBansRecord> getRecordType() {
		return mineplex.database.tables.records.ClanBansRecord.class;
	}

	/**
	 * The column <code>Account.clanBans.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanBansRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.clanBans.uuid</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanBansRecord, java.lang.String> uuid = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(36), this, "");

	/**
	 * The column <code>Account.clanBans.admin</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanBansRecord, java.lang.String> admin = createField("admin", org.jooq.impl.SQLDataType.VARCHAR.length(16), this, "");

	/**
	 * The column <code>Account.clanBans.reason</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanBansRecord, java.lang.String> reason = createField("reason", org.jooq.impl.SQLDataType.VARCHAR.length(128), this, "");

	/**
	 * The column <code>Account.clanBans.banTime</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanBansRecord, java.sql.Timestamp> banTime = createField("banTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clanBans.unbanTime</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanBansRecord, java.sql.Timestamp> unbanTime = createField("unbanTime", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clanBans.permanent</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanBansRecord, java.lang.Byte> permanent = createField("permanent", org.jooq.impl.SQLDataType.TINYINT, this, "");

	/**
	 * The column <code>Account.clanBans.removed</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanBansRecord, java.lang.Byte> removed = createField("removed", org.jooq.impl.SQLDataType.TINYINT, this, "");

	/**
	 * Create a <code>Account.clanBans</code> table reference
	 */
	public ClanBans() {
		this("clanBans", null);
	}

	/**
	 * Create an aliased <code>Account.clanBans</code> table reference
	 */
	public ClanBans(java.lang.String alias) {
		this(alias, mineplex.database.tables.ClanBans.clanBans);
	}

	private ClanBans(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ClanBansRecord> aliased) {
		this(alias, aliased, null);
	}

	private ClanBans(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ClanBansRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.ClanBansRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_clanBans;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.ClanBansRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_clanBans_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.ClanBansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.ClanBansRecord>>asList(mineplex.database.Keys.KEY_clanBans_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.ClanBans as(java.lang.String alias) {
		return new mineplex.database.tables.ClanBans(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.ClanBans rename(java.lang.String name) {
		return new mineplex.database.tables.ClanBans(name, null);
	}
}