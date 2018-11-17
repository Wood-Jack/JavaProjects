

public class CreditCardPayment extends Payment 
{
	//instance variables
	protected String cardName= "Jonah Jamerson";
	protected String expDate= "10/25";
	protected int cardNumber= 2928414;
	
	//Default Constructor
	public CreditCardPayment()
	{
		super();
	}
	
	//Contrusctor Method
	public CreditCardPayment(String cardName, String expDate, int cardNumber, double payment)
	{
		super(payment);
	   // this.amountPayment = payment;
	    amountPayment = payment;
		this.cardName= cardName;
		this.expDate= expDate;
		this.cardNumber= cardNumber;
	}
	
	public String getCardName()
	{
		return this.cardName;
	}
	public void setCardName( String inputCardName)
	{
		cardName= inputCardName;
	}
	public String getExpDate()
	{
		return this.expDate;
	}
	public void  setExpDate(String inputExpDate)
	{
		expDate= inputExpDate;
	}
	public int getCardNumber()
	{
		return this.cardNumber;
	}
	public  void setCardNumber( int inputCardNumber)
	{
		cardNumber= inputCardNumber;
	}
	
	@Override
	public void paymentDetails()
	{
		System.out.println("Credit Card Payment of " + getAmountPayment());
	}
	
	
}
	
