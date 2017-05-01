package oop;

public class Hamburger 
{
	private String name;
	private String rollType;
	private String meat;
	private double price;
	
	private String additionName1;
	private double additionPrice1;
	
	private String additionName2;
	private double additionPrice2;
	
	public Hamburger(
			String in_name, String in_rollType,
			String in_meat, double in_price)
	{
		name = in_name;
		rollType = in_rollType;
		meat = in_meat;
		price = in_price;
	}
	
	public void addItem1( String name, double price)
	{
		additionName1 = name;
		additionPrice1 = price;
	}
	
	public void addItem2( String name, double price)
	{
		additionName2 = name;
		additionPrice2 = price;
	}
	
	public double details()
	{
		String name_type_meat_price = 
				name + " burger on a " + rollType + " roll with " 
				+ meat + ", price is " + price;
		String addition_detail = "";
		if (additionName1 != null && additionName2 != null)
		{
			addition_detail = "\nAdded " + additionName1 
					+ " for extra " + additionPrice1 + ".\nAdded "
					+ additionName2 + " for extra " + additionPrice2;
		}
		
		System.out.println(name_type_meat_price + addition_detail);
		
		double totalPrice = price + additionPrice1 + additionPrice2;
		return totalPrice;
	}
}
