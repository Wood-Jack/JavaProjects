
public class BankAccount
{
	//Static Variables
	private static double totalOfAllAccounts= 1000.00;
	// instance variable
	private double accountBalance;
	
	// get/set methods
	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
		totalOfAllAccounts+= accountBalance;
	}
	
	public double getAccountBalance()
	{
		return accountBalance;
	}
	
	public static double getTotalBalance()
	{
		return totalOfAllAccounts;
	}
}
