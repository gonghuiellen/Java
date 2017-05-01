package composition;

//Create a single room of a house using composition.
public class test 
{
	public static void main(String[] args) 
	{
		Bed bed = new Bed( 2, 2, 1);
		Ceiling ceiling = new Ceiling(9, "white");
		Wall wallArr[] = new Wall[4];
		wallArr[0] = new Wall("W");
	    wallArr[1] = new Wall("E");
	    wallArr[2] = new Wall("S");
	    wallArr[3] = new Wall("N");
	    Lamp lamp = new Lamp("Classic", 1);
	    
	    Bedroom bedRoom = new Bedroom("Kate", wallArr, ceiling, bed, lamp);
	    bedRoom.cleanRoom();
	    
	    
	    
	}
	
}
