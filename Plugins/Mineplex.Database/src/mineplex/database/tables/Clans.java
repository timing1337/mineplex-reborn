/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Clans extends org.jooq.impl.TableImpl<mineplex.database.tables.records.ClansRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1152753541;

	/**
	 * The reference instance of <code>Account.clans</code>
	 */
	public static final mineplex.database.tables.Clans clans = new mineplex.database.tables.Clans();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.ClansRecord> getRecordType() {
		return mineplex.database.tables.records.ClansRecord.class;
	}

	/**
	 * The column <code>Account.clans.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.clans.serverId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> serverId = createField("serverId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>Account.clans.name</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>Account.clans.description</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.String> description = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(140), this, "");

	/**
	 * The column <code>Account.clans.home</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.String> home = createField("home", org.jooq.impl.SQLDataType.VARCHAR.length(140), this, "");

	/**
	 * The column <code>Account.clans.admin</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Boolean> admin = createField("admin", org.jooq.impl.SQLDataType.BIT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.dateCreated</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.sql.Timestamp> dateCreated = createField("dateCreated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.lastOnline</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.sql.Timestamp> lastOnline = createField("lastOnline", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>Account.clans.energy</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> energy = createField("energy", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.kills</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> kills = createField("kills", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.murder</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> murder = createField("murder", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.deaths</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> deaths = createField("deaths", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.warWins</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> warWins = createField("warWins", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.warLosses</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> warLosses = createField("warLosses", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.generator</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.String> generator = createField("generator", org.jooq.impl.SQLDataType.VARCHAR.length(140).nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.generatorStock</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> generatorStock = createField("generatorStock", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clans.eloRating</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClansRecord, java.lang.Integer> eloRating = createField("eloRating", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>Account.clans</code> table reference
	 */
	public Clans() {
		this("clans", null);
	}

	/**
	 * Create an aliased <code>Account.clans</code> table reference
	 */
	public Clans(java.lang.String alias) {
		this(alias, mineplex.database.tables.Clans.clans);
	}

	private Clans(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ClansRecord> aliased) {
		this(alias, aliased, null);
	}

	private Clans(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ClansRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.ClansRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_clans;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.ClansRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_clans_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.ClansRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.ClansRecord>>asList(mineplex.database.Keys.KEY_clans_PRIMARY, mineplex.database.Keys.KEY_clans_clanName);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.Clans as(java.lang.String alias) {
		return new mineplex.database.tables.Clans(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.Clans rename(java.lang.String name) {
		return new mineplex.database.tables.Clans(name, null);
	}
}
