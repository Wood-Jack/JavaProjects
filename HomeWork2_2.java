
import java.util.Scanner;

public class HomeWork2_2
{ 
	public static void main(String [] arg)
	{
		Scanner myScanner = new Scanner (System.in);
		System.out.println("Put only letters in this program");
		
		String Str;
		Str= myScanner.nextLine();
		System.out.println( "Your letters will be turned all uppercase " + Str.toUpperCase() );
		System.out.println( "Your letters will be turned all uppercase " + Str.toLowerCase() );

		
	}
}
