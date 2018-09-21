/* ****************************
 * Coder: Woodrow Jackson
 * Date: 9/6/18
 * Hmwk: Programing Ex 02-1 and Ex 2-2
 * 
 * **************************** */




import java.util.Scanner;

public class HomeWork2
{
	public static void main(String arg[])
	
	{
		Scanner myScanner= new Scanner(System.in); 
		System.out.println(" The sum,difference, and product of any number is");
		int Num1;
		int Num2;


		Num1= myScanner.nextInt();
		Num2= myScanner.nextInt();
		

		
		int a1= Num1* Num2;
		
		int a2= Num1+ Num2;
		int a3= Num1- Num2;
		System.out.println( "The the prouduct of your number is "+ a1);
		System.out.println( " The sum of your number is "+ a2);
		System.out.println( "The differnce of your number is " + a3);
		
}
}
