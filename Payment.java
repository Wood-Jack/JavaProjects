
public class Payment
{
	//Instance Varibales
	private double amountPayment;
	
	//Default Constructor no parameters
	public Payment()
	{
		 this.amountPayment= 0;
	}
		
	
	//Constructor 
	public Payment(double amountPayment)
	{
		this.amountPayment = amountPayment;
	}
	
	
	//getter setters
	public double getAmountPayment()
	{
		return this.amountPayment;
	}
	
	public void setAmountPayment(double inputAmountPayment)
	{
		amountPayment= inputAmountPayment;
	}
	
	public void  paymentDetails()
	{
	    System.out.println(" Amount payed is $" + amountPayment + " Dollars");
    }
}
