/**
 * This class is generated by jOOQ
 */
package mineplex.database.routines;

/**
 * Update the leaderboard for a given tournament.
 */

@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UpdateTournament extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -502124639;

	/**
	 * The parameter <code>Account.updateTournament.tourneyName</code>.
	 */
	public static final org.jooq.Parameter<java.lang.String> tourneyName = createParameter("tourneyName", org.jooq.impl.SQLDataType.VARCHAR.length(95), false);

	/**
	 * Create a new routine call instance
	 */
	public UpdateTournament() {
		super("updateTournament", mineplex.database.Account.Account);

		addInParameter(tourneyName);
	}

	/**
	 * Set the <code>tourneyName</code> parameter IN value to the routine
	 */
	public void setTourneyName(java.lang.String value) {
		setValue(mineplex.database.routines.UpdateTournament.tourneyName, value);
	}
}