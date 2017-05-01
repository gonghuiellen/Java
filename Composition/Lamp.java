package composition;

public class Lamp 
{
	private String style;
	private int number;
	
	public Lamp(String in_style, int num)
	{
		style = in_style;
		number = num;
	}
	
	public void turnOn()
	{
		System.out.println("Turning on Lamp");
	}
	
	public String getStyle() {
        return style;
    }
	
	public int getNum() {
        return number;
    }
}
