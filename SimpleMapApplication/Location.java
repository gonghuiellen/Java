import java.util.HashMap;
import java.util.Map;

public class Location 
{
	private final int ID;
	private final String description;
	private final Map<String, Integer> roadMap;
	
	public Location(int ID, String description)
	{
		this.ID = ID;
		this.description = description;
		roadMap = new HashMap<String, Integer>();
		roadMap.put("Q", 0);
	}

	public void addExits(String description, int locationID)
	{
		roadMap.put(description, locationID);
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public Map<String, Integer> getMap()
	{
		return new HashMap<String, Integer>(roadMap);
	}

}
