/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Stats extends org.jooq.impl.TableImpl<mineplex.database.tables.records.StatsRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -1426984538;

	/**
	 * The reference instance of <code>Account.stats</code>
	 */
	public static final mineplex.database.tables.Stats stats = new mineplex.database.tables.Stats();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.StatsRecord> getRecordType() {
		return mineplex.database.tables.records.StatsRecord.class;
	}

	/**
	 * The column <code>Account.stats.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StatsRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.stats.name</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StatsRecord, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>Account.stats</code> table reference
	 */
	public Stats() {
		this("stats", null);
	}

	/**
	 * Create an aliased <code>Account.stats</code> table reference
	 */
	public Stats(java.lang.String alias) {
		this(alias, mineplex.database.tables.Stats.stats);
	}

	private Stats(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.StatsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Stats(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.StatsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.StatsRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_stats;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.StatsRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_stats_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.StatsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.StatsRecord>>asList(mineplex.database.Keys.KEY_stats_PRIMARY, mineplex.database.Keys.KEY_stats_nameIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.Stats as(java.lang.String alias) {
		return new mineplex.database.tables.Stats(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.Stats rename(java.lang.String name) {
		return new mineplex.database.tables.Stats(name, null);
	}
}
