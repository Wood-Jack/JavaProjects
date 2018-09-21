import java.util.Scanner;
import java.text.DecimalFormat;




public class HomeWork3_2
{
	public static void main (String [] arg)
	{
		System.out.println ("Hello World");
		System.out.println("We have Group excercises to complete");
	
	System.out.println("Name of Excerise 1 "); 
	
	
	Scanner myScanner = new Scanner(System.in);
	DecimalFormat percentage= new DecimalFormat("0.00%");
	
	String Name;
	Name= myScanner.nextLine();
	
	System.out.println (" Score received for Excercise 1");
	double scoreR1= myScanner.nextDouble();
	
	System.out.println(" Total points possible for Excercise 1 ");

	double totalPoint1= myScanner.nextDouble();
	
	System.out.println("\n Name of Excercise 2");
	String Name2=myScanner.next();
	
	System.out.println(" Score received for Excercise 2");
	double scoreR2= myScanner.nextDouble();
	
	System.out.println("Total points possible for Excercise 2");
	double totalPoint2= myScanner.nextDouble();
	
	System.out.println("\n Name of Excercise 3");
	String Name3=myScanner.next();
	
	System.out.println(" Score received for Excercise 3");
	double scoreR3= myScanner.nextDouble();
	
	System.out.println(" Total points possible for Excercise 3");
	double totalPoint3=myScanner.nextDouble();
	
	double scoreTotal = scoreR1+scoreR2+scoreR3;
	double totalPossible= totalPoint1+totalPoint2+totalPoint3;
	double percent= scoreTotal/totalPossible;
		
	System.out.println( "\n Excercise " + Name+ "\n Score " + scoreR1+ " \n Total Possible " + totalPoint1);
	System.out.println("\n Excercise " + Name2+ "\n Score " + scoreR2+ " \n Total Possibel " + totalPoint2);
    System.out.println("\n Excercise " + Name3+ "\n Score " + scoreR3+ " \n Total possible " + totalPoint3);
	System.out.println("Your total is "+scoreTotal+" out of " +totalPossible+" or "+percentage.format(percent));


	}
	
}
