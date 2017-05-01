package encapsulation;

public class Printer 
{
	private double toner;
	private int totalPages;
	private boolean duplex;
	
	public Printer(double toner, boolean duplex)
	{
		if(toner > -1 && toner <=100)
		{
			this.toner = toner;
		}
		else
		{
			this.toner = -1;
		}
		this.duplex = duplex;
		this.totalPages = 0;
	}
	
	public double addToner(int tonerAmount) 
	{
        if(tonerAmount >0 && tonerAmount <=100) 
        {
            if(toner + tonerAmount >100) 
            {
                return -1;
            }
            toner += tonerAmount;
            return toner;
        } 
        else 
        {
            return -1;
        }
    }
	
	public void printPages(int in_pages)
	{
		int printPage = in_pages;
		if(duplex)
		{
			printPage = in_pages/2;
			if(in_pages %2 != 0)
			{
				printPage += 1;
			}	
		}
		
		toner -= (double)in_pages / 100; 
		totalPages += printPage;
		System.out.println("Print out " + printPage + " pages.");
	}
	
	public void totalPageUse()
	{
		System.out.println("Total pages so far: " + totalPages);
	}
	
	public void tonerRemain()
	{
		System.out.println("Total remaining toner: " + toner);
	}

}
