/**
 * This class is generated by jOOQ
 */
package mineplex.database.routines;

/**
 * This class is generated by jOOQ.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TestPro extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -418397480;

	/**
	 * The parameter <code>Account.testPro.var</code>.
	 */
	public static final org.jooq.Parameter<java.sql.Date> var = createParameter("var", org.jooq.impl.SQLDataType.DATE, false);

	/**
	 * Create a new routine call instance
	 */
	public TestPro() {
		super("testPro", mineplex.database.Account.Account);

		addOutParameter(var);
	}

	/**
	 * Get the <code>var</code> parameter OUT value from the routine
	 */
	public java.sql.Date getVar() {
		return getValue(var);
	}
}
