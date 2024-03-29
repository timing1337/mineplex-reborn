/**
 * This class is generated by jOOQ
 */
package mineplex.database.routines;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ClaimThank extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = 856582355;

	/**
	 * The parameter <code>Account.claimThank.inAccountId</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> inAccountId = createParameter("inAccountId", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>Account.claimThank.amountClaimed</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> amountClaimed = createParameter("amountClaimed", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * The parameter <code>Account.claimThank.uniqueThank</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> uniqueThank = createParameter("uniqueThank", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public ClaimThank() {
		super("claimThank", mineplex.database.Account.Account);

		addInParameter(inAccountId);
		addOutParameter(amountClaimed);
		addOutParameter(uniqueThank);
	}

	/**
	 * Set the <code>inAccountId</code> parameter IN value to the routine
	 */
	public void setInAccountId(java.lang.Integer value) {
		setValue(mineplex.database.routines.ClaimThank.inAccountId, value);
	}

	/**
	 * Get the <code>amountClaimed</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getAmountClaimed() {
		return getValue(amountClaimed);
	}

	/**
	 * Get the <code>uniqueThank</code> parameter OUT value from the routine
	 */
	public java.lang.Integer getUniqueThank() {
		return getValue(uniqueThank);
	}
}
