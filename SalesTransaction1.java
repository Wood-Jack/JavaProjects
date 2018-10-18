
public class SalesTransaction1
{
	//Instance variables
	private Product3 productSold ;
	
	private int quantitySold;
	// transactionAmount= proudctsold.getPrice() * quantitysold
	private double transactionAmount;
	
	private static  double transactionsTotalAmount;
	
	//Constructor method
	public SalesTransaction1( Product3 productSold, int quantitySold)
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
