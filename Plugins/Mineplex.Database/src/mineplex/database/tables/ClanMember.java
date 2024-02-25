/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * VIEW
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClanMember extends org.jooq.impl.TableImpl<mineplex.database.tables.records.ClanMemberRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -681774477;

	/**
	 * The reference instance of <code>Account.clanMember</code>
	 */
	public static final mineplex.database.tables.ClanMember clanMember = new mineplex.database.tables.ClanMember();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.ClanMemberRecord> getRecordType() {
		return mineplex.database.tables.records.ClanMemberRecord.class;
	}

	/**
	 * The column <code>Account.clanMember.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanMemberRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>Account.clanMember.accountId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanMemberRecord, java.lang.Integer> accountId = createField("accountId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.clanMember.clanId</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanMemberRecord, java.lang.Integer> clanId = createField("clanId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.clanMember.clanRole</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanMemberRecord, java.lang.String> clanRole = createField("clanRole", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>Account.clanMember.uuid</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanMemberRecord, java.lang.String> uuid = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>Account.clanMember.name</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ClanMemberRecord, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

	/**
	 * Create a <code>Account.clanMember</code> table reference
	 */
	public ClanMember() {
		this("clanMember", null);
	}

	/**
	 * Create an aliased <code>Account.clanMember</code> table reference
	 */
	public ClanMember(java.lang.String alias) {
		this(alias, mineplex.database.tables.ClanMember.clanMember);
	}

	private ClanMember(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ClanMemberRecord> aliased) {
		this(alias, aliased, null);
	}

	private ClanMember(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ClanMemberRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "VIEW");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.ClanMember as(java.lang.String alias) {
		return new mineplex.database.tables.ClanMember(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.ClanMember rename(java.lang.String name) {
		return new mineplex.database.tables.ClanMember(name, null);
	}
}
