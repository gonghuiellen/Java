package oop;

public class test 
{
	public static void main(String[] args)
	{
		Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 3.56);
		hamburger.addItem1("Tomato", 0.27);
		hamburger.addItem2("Lettuce", 0.75);
		System.out.println("Total Burger price is " + hamburger.details());
		System.out.println();
		
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHealthItem1("Egg", 5.43);
        healthyBurger.addHealthItem2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.details());
        
        System.out.println();
        DeluxeBurger db = new DeluxeBurger();
        System.out.println("Total Deluxe Burger price is  " + db.details());
	}
}
