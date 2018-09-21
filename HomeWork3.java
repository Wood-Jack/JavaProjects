import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class HomeWork3
{
	public static void main (String [] arg)
	{
		System.out.println ("Hello World");
		System.out.println("We have items in the vending machine");
	
	System.out.println("Please choose Item 1 "); 
	
	
	Scanner myScanner = new Scanner(System.in);
	
	String Name;
	Name= myScanner.nextLine();
	
	System.out.println (" Choose a quantity");
	double Quantity1= myScanner.nextInt();
	
	System.out.println(" What is the price? ");

	double Price1= myScanner.nextDouble();
	
	System.out.println("\n Please choose Item 2");
	String Name2=myScanner.next();
	
	System.out.println(" Please choose a quantity");
	double Quantity2= myScanner.nextInt();
	
	System.out.println("Please choose a Price");
	double Price2= myScanner.nextDouble();
	
	System.out.println("\n Please choose Item 3");
	String Name3=myScanner.next();
	
	System.out.println(" Please choose a quantity");
	double Quantity3= myScanner.nextInt();
	
	System.out.println(" Please choose a price");
	double Price3=myScanner.nextDouble();
	
	double subTotal = Quantity1*Price1*Quantity2*Price2*Quantity3*Price3;
	
	double total= subTotal* 1.0625;
		
	System.out.println( "\n Item1 " + Name+ "\n Quantity " + Quantity1+ " \n Price " + Price1);
	System.out.println("\n Item2 " + Name2+ "\n Quantity " + Quantity2+ " \n Price " + Price2);
    System.out.println("\n Item3 " + Name3+ "\n Quantity " + Quantity3+ " \n Price " + Price3);
	System.out.println(" \n Subtotal "+ subTotal + " \n Sales tax $%6.25");
	System.out.printf("Total $%6.2f ",total);
	


	}
	
}

