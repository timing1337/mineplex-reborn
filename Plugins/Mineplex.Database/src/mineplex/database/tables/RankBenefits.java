/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RankBenefits extends org.jooq.impl.TableImpl<mineplex.database.tables.records.RankBenefitsRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1274456623;

	/**
	 * The reference instance of <code>Account.rankBenefits</code>
	 */
	public static final mineplex.database.tables.RankBenefits rankBenefits = new mineplex.database.tables.RankBenefits();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.RankBenefitsRecord> getRecordType() {
		return mineplex.database.tables.records.RankBenefitsRecord.class;
	}

	/**
	 * The column <code>Account.rankBenefits.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.RankBenefitsRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.rankBenefits.accountId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.RankBenefitsRecord, java.lang.Integer> accountId = createField("accountId", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>Account.rankBenefits.benefit</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.RankBenefitsRecord, java.lang.String> benefit = createField("benefit", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>Account.rankBenefits</code> table reference
	 */
	public RankBenefits() {
		this("rankBenefits", null);
	}

	/**
	 * Create an aliased <code>Account.rankBenefits</code> table reference
	 */
	public RankBenefits(java.lang.String alias) {
		this(alias, mineplex.database.tables.RankBenefits.rankBenefits);
	}

	private RankBenefits(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.RankBenefitsRecord> aliased) {
		this(alias, aliased, null);
	}

	private RankBenefits(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.RankBenefitsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.RankBenefitsRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_rankBenefits;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.RankBenefitsRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_rankBenefits_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.RankBenefitsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.RankBenefitsRecord>>asList(mineplex.database.Keys.KEY_rankBenefits_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<mineplex.database.tables.records.RankBenefitsRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<mineplex.database.tables.records.RankBenefitsRecord, ?>>asList(mineplex.database.Keys.rankBenefits_ibfk_1);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.RankBenefits as(java.lang.String alias) {
		return new mineplex.database.tables.RankBenefits(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.RankBenefits rename(java.lang.String name) {
		return new mineplex.database.tables.RankBenefits(name, null);
	}
}
