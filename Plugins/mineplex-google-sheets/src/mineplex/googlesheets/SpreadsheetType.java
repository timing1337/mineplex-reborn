package mineplex.googlesheets;

/**
 * An enum containing all the google spreadsheet links relating to Mineplex.<br>
 */
public enum SpreadsheetType
{

	GEM_HUNTERS_CHESTS("13DCxZV15MvoRsnGRiZw7KCjk0cJ56Byq8OGLBrqLKds"),
	GEM_HUNTERS_SHOP("1dkdBISpehQPbMkDTj1joKEGBIIFto1yFIfAt2e-7o_4"),
	MOBA_SKINS("1fLaZdCkjLGkBnJnM9ahn3ZjlomLc9nDzc9_XUnac-H8"),
	QUESTS_SHEET("1RTJRAHrjJbelLo2151hZN9hsMhv4O7Y9Aauom6YDinU"),
	SMASH_KITS("1uHaFeX0HEI-6gbZA23uSf_sCO5ABaSWk-yAW4SvlP7s"),
	;
	
	private String _id;
	
	SpreadsheetType(String id)
	{
		_id = id;
	}
	
	public String getId()
	{
		return _id;
	}
}