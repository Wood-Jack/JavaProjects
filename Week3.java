import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Program: Week3.java
 * Purpose:Read in a text file of scores
 * Author: Woodrow Jackson
 * Date : Sep 7, 2018
 */

public class Week3
{
	public static void main (String [] arg)
	{
		//System.out.print("$");
		
		double price = 19.8;
		System.out.printf("This is my first row: $%8.2f %10d %20s",100.5, 57, "end of line" );
		System.out.print("\n");
		
		
		/*
		Scanner fileIn= null;
		
		try
		{
			fileIn= new Scanner( new FileInputStream("scores.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Oops, file not found. Please check file name and try again.");
			System.exit(0);
		}
		int num1, num2, num3, num4;
		
		// Read in the integer value from the first line of the data field
		num1= fileIn.nextInt();
		System.out.println("The first score was:"+ num1);
		
		num2 = fileIn.nextInt();
		System.out.println("The second score was: "+ num2);
		
		num3 = fileIn.nextInt();
		System.out.println("the third score was: " + num3);
		
		num4 = fileIn.nextInt();
		System.out.println(" The fourth score was: " + num4);
		
		System.out.println(" The average score is: " + (num1+num2+num3+num4));
		*/
		
	}
}
