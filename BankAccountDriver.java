
public class BankAccountDriver
{
	public static void main (String args[])
	{
		System.out.println(" Total Bank Balance: " + BankAccount.getTotalBalance() );
		
		BankAccount marksAccount = new BankAccount();
		marksAccount.setAccountBalance(100.00);
		
		System.out.println("Marks Balance: "+ marksAccount.getAccountBalance() );
		
		BankAccount matthewsAccount= new BankAccount ();
		matthewsAccount.setAccountBalance(20.00);
		System.out.println(" Matthew's Balance: " + matthewsAccount.getAccountBalance() );
		//System.out.println( " Total Bank balance ( via Mark): " + marksAccount.getTotalBalance() );
		//System.out.println( " Total Bank balance ( via Matthew): " + matthewsAccount.getTotalBalance() );
		System.out.println(" Total Bank Balance: " + BankAccount.getTotalBalance() );
	}
}
