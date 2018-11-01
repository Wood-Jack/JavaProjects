
import java.util.Scanner;


public class HomeWork10_1
{ 
	public static void main (String [] args)
	{
		Scanner myScanner= new Scanner (System.in);
		
		String [] months;
		months = new String[12];
		months[0]= "(1) January ";
		months[1]= "(2) Feburary ";
		months[2]= "(3) March ";
		months[3]= "(4) April ";
		months[4]= "(5) May  ";
		months[5]= "(6) June ";
		months[6]= "(7) July ";
		months[7]= "(8) August ";
		months[8]= "(9) Septmeber ";
		months[9]="(10) October ";
		months[10]="(11) November ";
		months[11]="(12) December ";
		
		
		int [] rainFall;
		rainFall= new int[12];
		rainFall[0]= 0;
		rainFall[1]= 2;
		rainFall[2]= 23;
		rainFall[3]= 13;
		rainFall[4]= 17 ;
		rainFall[5]= 14;
		rainFall[6]= 4;
		rainFall[7]= 19;
		rainFall[8]= 26;
		rainFall[9]= 11;
		rainFall[10]= 22;
		rainFall[11]= 1;
		
		
		int [] inputRainFall;
		inputRainFall= new int [12];
		
		int monthPicker;
		int numberPicker;
		
		
		for ( int i =0 ; i < months.length; i++)
		{
			System.out.println( months[i]);
		} 
		
		do
		{
		System.out.println(" Please choose a number for the month if greater than 13 program will end");
		monthPicker = myScanner.nextInt();
		monthPicker= monthPicker -1;
	
		
		
			
			for( int i = monthPicker; i < monthPicker + 12; i++)
				{
					System.out.println(" Please choose the a number for rainfall of  month" + months[i%12]);
					numberPicker = myScanner.nextInt();
					inputRainFall[i%12]=numberPicker;
				}
				
			
					
		if (monthPicker <= 12)
			{
			  System.out.println( "Your month " + months[monthPicker]+ "your month rainfall: "+ inputRainFall[monthPicker]);
			}
				for ( int i =0 ; i < months.length; i++)
				{
					System.out.println( months[i]+ '\t'+ "Rainfall average of months: " + rainFall[i]);
				} 
				
			
		}
		while (monthPicker <=12);
			if(month
			
		     monthPicker= myScanner.nextInt();
			
	}
}
