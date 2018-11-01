
import java.util.Scanner;


public class HomeWork10_1
{ 
	public static void main (String [] args)
	{
		Scanner myScanner= new Scanner (System.in);
		
		String [] months;
		months = new String[13];
		months[0]= null;
		months[1]= "(1)January";
		months[2]= "(2)Feburary";
		months[3]= "(3)March";
		months[4]= "(4)April";
		months[5]= "(5)May";
		months[6]= "(6)June";
		months[7]= "(7)July";
		months[8]= "(8)August";
		months[9]= "(9)Septmeber";
		months[10]="(10)October";
		months[11]="(11)November";
		months[12]="(12)December";
		
		int [] rainFall;
		rainFall= new int[13];
		rainFall[0]= -1;
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
		rainFall[12]= 0;
		
		for ( int i =0 ; i < months.length; i++)
		{
			System.out.println( months[i]);
		} 
		
		System.out.println(" Please choose a number for the month");
		int monthPicker = myScanner.nextInt();
		
		//if (monthPicker ==1)

}
		
}
