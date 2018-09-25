
import java.util.Scanner;
import java.text.DecimalFormat;




public class HomeWork5_2
{
	public static void main (String args[])	
	{
		Scanner myScanner = new Scanner (System.in);
		DecimalFormat percentage= new DecimalFormat("#.00");
		
		System.out.println("Please enter the desired values of an item ");
		int currentYear=0;
		
		System.out.println(" How much will the item cost?");
		double costCounter= myScanner.nextDouble();
		
		System.out.println("How many years from now will the item be purchased? ");
		int yearCounter= myScanner.nextInt();
		

		System.out.println("Rate of inflation by percentage");
		double inFlation= myScanner.nextDouble();
		inFlation= inFlation/100;
		
		double priceAdjusted = costCounter;
		System.out.println(" Your item will cost this much " +priceAdjusted);
		
		for(currentYear=0; currentYear<yearCounter; currentYear++)
		{
		 priceAdjusted += priceAdjusted*inFlation;
	}
	System.out.println(" This is how much it will cost " + percentage.format(priceAdjusted) +" with this many " +yearCounter+ " years" );
	
			
	}
}
