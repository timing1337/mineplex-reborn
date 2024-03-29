/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActiveTournaments extends org.jooq.impl.TableImpl<mineplex.database.tables.records.ActiveTournamentsRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1981348090;

	/**
	 * The reference instance of <code>Account.activeTournaments</code>
	 */
	public static final mineplex.database.tables.ActiveTournaments activeTournaments = new mineplex.database.tables.ActiveTournaments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.ActiveTournamentsRecord> getRecordType() {
		return mineplex.database.tables.records.ActiveTournamentsRecord.class;
	}

	/**
	 * The column <code>Account.activeTournaments.name</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ActiveTournamentsRecord, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>Account.activeTournaments.start_date</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ActiveTournamentsRecord, java.sql.Date> start_date = createField("start_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * The column <code>Account.activeTournaments.end_date</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ActiveTournamentsRecord, java.sql.Date> end_date = createField("end_date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * The column <code>Account.activeTournaments.is_gamemode</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ActiveTournamentsRecord, java.lang.Integer> is_gamemode = createField("is_gamemode", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.activeTournaments.server_id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ActiveTournamentsRecord, org.jooq.types.UByte> server_id = createField("server_id", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

	/**
	 * Create a <code>Account.activeTournaments</code> table reference
	 */
	public ActiveTournaments() {
		this("activeTournaments", null);
	}

	/**
	 * Create an aliased <code>Account.activeTournaments</code> table reference
	 */
	public ActiveTournaments(java.lang.String alias) {
		this(alias, mineplex.database.tables.ActiveTournaments.activeTournaments);
	}

	private ActiveTournaments(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ActiveTournamentsRecord> aliased) {
		this(alias, aliased, null);
	}

	private ActiveTournaments(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ActiveTournamentsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.ActiveTournamentsRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_activeTournaments_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.ActiveTournamentsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.ActiveTournamentsRecord>>asList(mineplex.database.Keys.KEY_activeTournaments_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.ActiveTournaments as(java.lang.String alias) {
		return new mineplex.database.tables.ActiveTournaments(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.ActiveTournaments rename(java.lang.String name) {
		return new mineplex.database.tables.ActiveTournaments(name, null);
	}
}
