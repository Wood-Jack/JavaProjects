
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

//need for scanner input example
import java.util.Scanner;
import java.io.FileInputStream;

//needed for BufferedReader input example
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main
{
	public static void main (String[] args)
	{
		//EXPORTER
		// create oour printwriter obejct,
		PrintWriter outputStreamName = null ;
		//FileOutputStream file = new FileOutputStream (new FileOutputStream("cars.text"));
		
		try
		{
			// wire up printwriter to text file via FileOutPutStream object
			// c:\\temp// car.text to put a file in a certain location
			// puts information from the outputstream into the the text file cars ex. 32 & 33
			outputStreamName= new PrintWriter(new FileOutputStream("cars.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("unable open or create a file");
		}
		
	
		outputStreamName.println("Ford F-150");
		outputStreamName.println("Toyota Corolla");
		// flushes takes inforamtion thoruwn to into buffer thrown into the data file
		// releases connection to the file make sures everything goes into the file than it releases
		// can use product.toString() 
		outputStreamName.flush();
		outputStreamName.close();
		
		//=================================================================
		//reads txts from a file 
		
		//IMPORTER
		//create scanner 
		Scanner inputFile= null;
		
		// Try to open the file
		try 
		{
			inputFile= new Scanner(new FileInputStream("animals.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Could not find or open file");
		}
		
		// Get first line of text form the input file  it allows file to show up in the execute
		String line1 = inputFile.nextLine();
		System.out.println(line1);
		System.out.println(inputFile.nextLine());
		System.out.println(inputFile.nextLine());
		
		
		if(inputFile.hasNextLine())
		{
			System.out.println(inputFile.nextLine());
		}
		
		//=====================================================================
		//=====================================================================
		
		
		//create Buffered Reader object
		BufferedReader inputFile2= null;
		
		//try to open file for reading 
		try
		{
			inputFile2 = new BufferedReader(new FileReader("animals.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("sorry couldnt open the file");
		
			System.out.println("could not read data from file");
		}
		
		
	}
}
