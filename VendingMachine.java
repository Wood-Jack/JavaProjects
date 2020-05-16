/* *****************************
* Name: Woodrow Jackson
* Project Vending Machine
* ******************************* */
import java.util.Scanner;

public class VendingMachine

{ 
	public static void main (String [] args)
    {
		
		int price; 
		
		Scanner myScanner= new Scanner (System.in);
		System.out.println("How much will the item cost");
		 price= myScanner.nextInt();
		 
		System.out.println("It will cost " + price+ " cents");
		
		int change= 100- price;
		
		System.out.println(" I owe you " + change);
		
	
	    int nkl = change/5;
	    System.out.println("nickels " + nkl);
	    
	    int dm = change/10;
	    System.out.println ( "dimes " + dm);
		//int leftoverChange;
		//int num = 45;	
		int qtr = change/25;
		
		System.out.println("quarters " + qtr);
		change= change %25;
		
		//System.out.println(qtr);
		//System.out.println(leftoverChange);
	}
}
