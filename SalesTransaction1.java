
public class SalesTransaction
{
	//Instance variables
	private Product productSold ;
	
	private int quantitySold;
	// transactionAmount= proudctsold.getPrice() * quantitysold
	private double transactionAmount;
	
	private static  double transactionsTotalAmount;
	
	//Constructor method
	public SalesTransaction( Product productSold, int quantitySold)
	{
		this.productSold=productSold;
		this.quantitySold=quantitySold;
		this.transactionAmount = this.productSold.getPrice()* this.quantitySold;
		transactionsTotalAmount+= this.transactionAmount;
	}
	public String toString()
	// string to string
	// return 'sold' + quantitySold + "x product"
	{
		return "Sold " + quantitySold + "X product " + productSold.getName()+ ": Amount $" + transactionAmount;
	}
}
