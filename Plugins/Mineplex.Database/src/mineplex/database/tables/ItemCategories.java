/**
 * This class is generated by jOOQ
 */
package mineplex.database.tables;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ItemCategories extends org.jooq.impl.TableImpl<mineplex.database.tables.records.ItemCategoriesRecord> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 1747950682;

	/**
	 * The reference instance of <code>Account.itemCategories</code>
	 */
	public static final mineplex.database.tables.ItemCategories itemCategories = new mineplex.database.tables.ItemCategories();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<mineplex.database.tables.records.ItemCategoriesRecord> getRecordType() {
		return mineplex.database.tables.records.ItemCategoriesRecord.class;
	}

	/**
	 * The column <code>Account.itemCategories.id</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ItemCategoriesRecord, java.lang.Integer> id = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>Account.itemCategories.name</code>.
	 */
	public final org.jooq.TableField<mineplex.database.tables.records.ItemCategoriesRecord, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

	/**
	 * Create a <code>Account.itemCategories</code> table reference
	 */
	public ItemCategories() {
		this("itemCategories", null);
	}

	/**
	 * Create an aliased <code>Account.itemCategories</code> table reference
	 */
	public ItemCategories(java.lang.String alias) {
		this(alias, mineplex.database.tables.ItemCategories.itemCategories);
	}

	private ItemCategories(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ItemCategoriesRecord> aliased) {
		this(alias, aliased, null);
	}

	private ItemCategories(java.lang.String alias, org.jooq.Table<mineplex.database.tables.records.ItemCategoriesRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, mineplex.database.Account.Account, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<mineplex.database.tables.records.ItemCategoriesRecord, java.lang.Integer> getIdentity() {
		return mineplex.database.Keys.IDENTITY_itemCategories;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<mineplex.database.tables.records.ItemCategoriesRecord> getPrimaryKey() {
		return mineplex.database.Keys.KEY_itemCategories_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<mineplex.database.tables.records.ItemCategoriesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<mineplex.database.tables.records.ItemCategoriesRecord>>asList(mineplex.database.Keys.KEY_itemCategories_PRIMARY, mineplex.database.Keys.KEY_itemCategories_nameIndex);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public mineplex.database.tables.ItemCategories as(java.lang.String alias) {
		return new mineplex.database.tables.ItemCategories(alias, this);
	}

	/**
	 * Rename this table
	 */
	public mineplex.database.tables.ItemCategories rename(java.lang.String name) {
		return new mineplex.database.tables.ItemCategories(name, null);
	}
}
