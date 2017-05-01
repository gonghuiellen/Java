package oop;

public class HealthyBurger extends Hamburger
{
	private String addition1;
	private double price1;
	private String addition2;
	private double price2;
	
	public HealthyBurger(String in_meat, double in_price)
	{
		super("Healthy burger", "brown rye bread", in_meat, in_price);
	}
	
	public void addHealthItem1( String name, double price)
	{
		addition1 = name;
		price1 = price;
	}
	
	public void addHealthItem2( String name, double price)
	{
		addition2 = name;
		price2 = price;
	}
	
	@Override
	public double details()
	{
		double totalPrice = super.details() + price1 + price2;
		String extraItems =  
				"Added " + addition1 + " for extra: " + price1
				+ ".\nAdded " + addition2 + " for extra: " + price2;
		System.out.println(extraItems);
		
		
		return totalPrice;
	}

}
