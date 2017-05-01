package oop;

public class DeluxeBurger extends Hamburger
{
	public DeluxeBurger()
	{
		super("Deluxe", "Whole wheat", "Tuna", 14.5);
		super.addItem1("Chips", 2.5);
		super.addItem2("Drink", 1.8);
	}

}
