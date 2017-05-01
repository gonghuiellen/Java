package composition;

public class Ceiling 
{
	private int height;
	private String color;
	
	public Ceiling(int in_height, String in_color)
	{
		height = in_height;
		color = in_color;
	}
	
	public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
    
    public void clean()
    {
    	System.out.println("Clean the celling");
    }

}
