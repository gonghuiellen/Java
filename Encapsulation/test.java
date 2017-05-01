package encapsulation;

public class test 
{
	public static void main(String[] args) 
	{
		Printer printer = new Printer(50, true);
		printer.printPages(11);
		printer.totalPageUse();
		printer.tonerRemain();
		printer.printPages(20);
		printer.totalPageUse();
		printer.tonerRemain();
		
	}

}
