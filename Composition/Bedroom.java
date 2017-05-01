package composition;

public class Bedroom 
{
	private String name;
	private Wall wallArr[] = new Wall[4];
	private Ceiling ceiling;
	private Bed bed;
	private Lamp lamp;
	
	public Bedroom(String roomName,Wall walls[] , 
			Ceiling ceil, Bed bed, Lamp lamp) {
        this.name = roomName;
        this.wallArr = walls;
        this.ceiling = ceil;
        this.bed = bed;
        this.lamp = lamp;
    }
	
	public void cleanRoom()
	{
		System.out.println(name + " is cleaning the room.");
		lamp.turnOn();
		ceiling.clean();
		for (int i = 0; i < 4; i++)
		{
			System.out.println(name + " is cleaning wall " + wallArr[i].getDirection());
		}
		
		bed.make();
	}
}
