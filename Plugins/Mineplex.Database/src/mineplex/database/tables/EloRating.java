/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class EloRating extends org.jooq.impl.TableImpl<mineplex.database.tables.records.EloRatingRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1056892571;

	/**
	 * The reference instance of <code>Account.eloRating</code>
	 */
	public static final mineplex.database.tables.EloRating eloRating = new mineplex.database.tables.EloRating();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.EloRatingRecord> getRecordType() {
		return mineplex.database.tables.records.EloRatingRecord.class;
	}

	/**
	 * The column <code>Account.eloRating.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.EloRatingRecord, org.jooq.types.UInteger> id = createField("id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>Account.eloRating.accountId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.EloRatingRecord, java.lang.Integer> accountId = createField("accountId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.eloRating.gameType</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.EloRatingRecord, java.lang.String> gameType = createField("gameType", org.jooq.impl.SQLDataType.VARCHAR.length(256), this, "");

	/**
	 * The column <code>Account.eloRating.elo</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.EloRatingRecord, java.lang.Integer> elo = createField("elo", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>Account.eloRating</code> table reference
	 */
	public EloRating() {
		this("eloRating", null);
	}

	/**
	 * Create an aliased <code>Account.eloRating</code> table reference
	 */
	public EloRating(java.lang.String alias) {
		this(alias, mineplex.database.tables.EloRating.eloRating);
	}

	private EloRating(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.EloRatingRecord> aliased) {
		this(alias, aliased, null);
	}

	private EloRating(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.EloRatingRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.EloRatingRecord, org.jooq.types.UInteger> getIdentity() {
		return mineplex.database.Keys.IDENTITY_eloRating;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.EloRatingRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_eloRating_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.EloRatingRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.EloRatingRecord>>asList(mineplex.database.Keys.KEY_eloRating_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<mineplex.database.tables.records.EloRatingRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<mineplex.database.tables.records.EloRatingRecord, ?>>asList(mineplex.database.Keys.ELORATING_ACCOUNTID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.EloRating as(java.lang.String alias) {
		return new mineplex.database.tables.EloRating(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.EloRating rename(java.lang.String name) {
		return new mineplex.database.tables.EloRating(name, null);
	}
}
