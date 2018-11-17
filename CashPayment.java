

public class CashPayment extends Payment
{
	//default constructor
	public CashPayment()
	{
	      super();
	}
	
	
	// CashPayment detail altered
	@Override
	public void paymentDetails()
	{
		System.out.println("This amount of cash payed $"+ getAmountPayment());
	}

}
	
	
	
