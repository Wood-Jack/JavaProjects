
public class HotDogStand
{
	//instance variables
	private String idNumber;
	private int hotDogSold;
	
	// static variable
	private static double totalHotDogSold;
	
	// contstructor method
	public HotDogStand (String idNumber, int hotDogSold)
	{
		this.idNumber=idNumber;
		this.hotDogSold=hotDogSold;
		totalHotDogSold+= hotDogSold;
	}
	
	public String toString()
	{
		return idNumber + " " + hotDogSold;
	}
	
	public void justSold()
	{
		 hotDogSold++;
		 totalHotDogSold++;
	}
	
	public static double hotDogSold()
	{
		return totalHotDogSold;
	}
}
	
