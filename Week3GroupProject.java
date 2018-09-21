import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Coder: Woodrow
 * Program: Group Lab Project 3
 * Date:
 */


public class Week3GroupProject
{
	public static void main (String [] arg)
	{
		System.out.println("Hello World");
		Scanner fileIn= null;
		
		try
		{
			fileIn= new Scanner ( new FileInputStream("orders-1.txt"));
		}	
		catch (FileNotFoundException e)
		{
			System.out.println(" File is not found");
			System.exit(0);
		}
		fileIn.useDelimiter(",|\\n");
		String header = fileIn.nextLine();
		System.out.println(" Line 1 " + header);
		
		// Now lets read in the values from line 2 indvidually 
		
		String orderdate1 = fileIn.next();
		String productNbr1= fileIn.next();
		String descr1= fileIn.next();
		double unitprice1 = fileIn.nextDouble();
		int quantitiy1= fileIn.nextInt();
		
		System.out.println( orderdate1+ productNbr1);
		
	}
}
