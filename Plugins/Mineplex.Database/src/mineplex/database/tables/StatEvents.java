/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StatEvents extends org.jooq.impl.TableImpl<mineplex.database.tables.records.StatEventsRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 180759980;

	/**
	 * The reference instance of <code>Account.statEvents</code>
	 */
	public static final mineplex.database.tables.StatEvents statEvents = new mineplex.database.tables.StatEvents();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.StatEventsRecord> getRecordType() {
		return mineplex.database.tables.records.StatEventsRecord.class;
	}

	/**
	 * The column <code>Account.statEvents.eventId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StatEventsRecord, org.jooq.types.UInteger> eventId = createField("eventId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>Account.statEvents.accountId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StatEventsRecord, org.jooq.types.UInteger> accountId = createField("accountId", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>Account.statEvents.date</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StatEventsRecord, java.sql.Date> date = createField("date", org.jooq.impl.SQLDataType.DATE.nullable(false), this, "");

	/**
	 * The column <code>Account.statEvents.gamemode</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StatEventsRecord, org.jooq.types.UByte> gamemode = createField("gamemode", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>Account.statEvents.serverGroup</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StatEventsRecord, java.lang.String> serverGroup = createField("serverGroup", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>Account.statEvents.type</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StatEventsRecord, org.jooq.types.UByte> type = createField("type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>Account.statEvents.value</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.StatEventsRecord, org.jooq.types.UShort> value = createField("value", org.jooq.impl.SQLDataType.SMALLINTUNSIGNED.nullable(false).defaulted(true), this, "");

	/**
	 * Create a <code>Account.statEvents</code> table reference
	 */
	public StatEvents() {
		this("statEvents", null);
	}

	/**
	 * Create an aliased <code>Account.statEvents</code> table reference
	 */
	public StatEvents(java.lang.String alias) {
		this(alias, mineplex.database.tables.StatEvents.statEvents);
	}

	private StatEvents(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.StatEventsRecord> aliased) {
		this(alias, aliased, null);
	}

	private StatEvents(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.StatEventsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.StatEventsRecord, org.jooq.types.UInteger> getIdentity() {
		return mineplex.database.Keys.IDENTITY_statEvents;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.StatEventsRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_statEvents_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.StatEventsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.StatEventsRecord>>asList(mineplex.database.Keys.KEY_statEvents_PRIMARY, mineplex.database.Keys.KEY_statEvents_UK_DailyEntry);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.StatEvents as(java.lang.String alias) {
		return new mineplex.database.tables.StatEvents(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.StatEvents rename(java.lang.String name) {
		return new mineplex.database.tables.StatEvents(name, null);
	}
}
