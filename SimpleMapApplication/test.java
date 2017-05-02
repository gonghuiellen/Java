import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * map details:
 * 
 * fireworks view
 *     |
 * Bog garden                      Japanese garden
 *     |                               |
 * Sunker garden -- Rose garden -- Italian garden
 *     |                               |
 * Waterfall ------- Entrance----  visitor center
 * 
 */

public class test 
{
	private static Map<Integer, Location> locations = 
			new HashMap<Integer, Location>();
	
	public static void main(String[] args)
	{
		createMap();
		Map<String, String> vocabulary = new HashMap<String, String>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");
        move();
	}
	
	public static void createMap()
	{
		locations.put(-1, new Location(-1, "Leave the garden"));
		locations.put(0, new Location(0, "Entrance of the garden"));
		locations.put(1, new Location(1, "Visitor center"));
		locations.put(2, new Location(2, "Italian garden"));
		locations.put(3, new Location(3, "Rose garden"));
		locations.put(4, new Location(4, "Waterfall"));
		locations.put(5, new Location(5, "Japanese garden"));
		locations.put(6, new Location(6, "Sunker garden"));
		locations.put(7, new Location(7, "Bog garden"));
		locations.put(8, new Location(8, "Fireworks view"));
		
		locations.get(0).addExits("N", 3);
		locations.get(0).addExits("E", 1);
		locations.get(0).addExits("W", 4);
		locations.get(0).addExits("Q", -1);
		
		locations.get(1).addExits("N", 2);
		locations.get(1).addExits("W", 0);
		locations.get(1).addExits("Q", -1);
		
		locations.get(2).addExits("N", 5);
		locations.get(2).addExits("S", 1);
		locations.get(2).addExits("W", 3);
		locations.get(2).addExits("Q", -1);
		
		locations.get(3).addExits("E", 2);
		locations.get(3).addExits("S", 0);
		locations.get(3).addExits("Q", -1);
		
		locations.get(4).addExits("N", 6);
		locations.get(4).addExits("E", 0);
		locations.get(4).addExits("Q", -1);
		
		locations.get(5).addExits("S", 2);
		locations.get(5).addExits("Q", -1);
		
		locations.get(6).addExits("N", 7);
		locations.get(6).addExits("E", 3);
		locations.get(6).addExits("S", 4);
		locations.get(6).addExits("Q", -1);
		
		locations.get(7).addExits("N", 8);
		locations.get(7).addExits("S", 6);
		locations.get(7).addExits("Q", -1);
		
		locations.get(8).addExits("S", 7);
		locations.get(8).addExits("Q", -1);
	}

	public static void move()
	{
		int addr = 0;
		while(true)
		{
			if(addr == -1) // leave the garden
			{
				System.out.println(locations.get(addr).getDescription());
				break;
			}
			
			Map<String, Integer> roadMap = locations.get(addr).getMap();
			System.out.println("You are at: " + locations.get(addr).getDescription());	
			System.out.println("Available path: "+ roadMap.keySet());
			
			System.out.println("Please enter the direction: ");
			Scanner scanner = new Scanner(System.in);
			String direction = scanner.nextLine().toUpperCase();
			
			if(roadMap.containsKey(direction))
			{
				addr = roadMap.get(direction);
			}
			else 
			{
                System.out.println("No path to go there");
            }	
		}
	}
}
