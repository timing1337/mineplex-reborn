/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tournaments extends org.jooq.impl.TableImpl<mineplex.database.tables.records.TournamentsRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -2104066935;

	/**
	 * The reference instance of <code>Account.tournaments</code>
	 */
	public static final mineplex.database.tables.Tournaments tournaments = new mineplex.database.tables.Tournaments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.TournamentsRecord> getRecordType() {
		return mineplex.database.tables.records.TournamentsRecord.class;
	}

	/**
	 * The column <code>Account.tournaments.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.TournamentsRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.tournaments.name</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.TournamentsRecord, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

	/**
	 * The column <code>Account.tournaments.startDate</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.TournamentsRecord, java.sql.Timestamp> startDate = createField("startDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

	/**
	 * The column <code>Account.tournaments.gameType</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.TournamentsRecord, java.lang.String> gameType = createField("gameType", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

	/**
	 * The column <code>Account.tournaments.gemCost</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.TournamentsRecord, java.lang.Integer> gemCost = createField("gemCost", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>Account.tournaments.winner</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.TournamentsRecord, java.lang.String> winner = createField("winner", org.jooq.impl.SQLDataType.VARCHAR.length(80), this, "");

	/**
	 * Create a <code>Account.tournaments</code> table reference
	 */
	public Tournaments() {
		this("tournaments", null);
	}

	/**
	 * Create an aliased <code>Account.tournaments</code> table reference
	 */
	public Tournaments(java.lang.String alias) {
		this(alias, mineplex.database.tables.Tournaments.tournaments);
	}

	private Tournaments(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.TournamentsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tournaments(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.TournamentsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.TournamentsRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_tournaments;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.TournamentsRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_tournaments_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.TournamentsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.TournamentsRecord>>asList(mineplex.database.Keys.KEY_tournaments_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.Tournaments as(java.lang.String alias) {
		return new mineplex.database.tables.Tournaments(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.Tournaments rename(java.lang.String name) {
		return new mineplex.database.tables.Tournaments(name, null);
	}
}
