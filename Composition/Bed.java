package composition;

public class Bed 
{
	private int pillow;
	private int nightTable;
	private int height;
	
	public Bed(int in_pillow, int in_nightTable, int in_height)
	{
		pillow = in_pillow;
		nightTable = in_nightTable;
		height = in_height;
	}
	
	public void make()
	{
		System.out.println("Making Bed");
	}
	
	public int getPillow() {
        return pillow;
    }

    public int getHeight() {
        return height;
    }

    public int getNightTable() {
        return nightTable;
    }
}
