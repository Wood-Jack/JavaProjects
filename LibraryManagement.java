

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.io.FileInputStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * This is Driver 
 * 
 * 
 * 
 * 
 * 
 * 
 * ********************/




public class LibraryManagement
{
	public static void main (String args[])
	{
		//input menu options
		int menuChoice1;
		Scanner input = new Scanner (System.in);
		int menu[] = new int[4];
		LibraryCollection sampleArray[] = new LibraryCollection[10];
		// patrons array
		sampleArray[1] = new LibraryCollection ( "Patron", 101,"Mark Stramaglia");
		
		
		
		
		
		
		
	
		// Creating the array for the to hold the 3 classes
	
	// menu

		
		System.out.println("Welcome to the Library Management operating system");
		System.out.println( "(1) Manage Materials");
		System.out.println( "(2) Manage Patrons");
		System.out.println( "(3) Load/SaveData");
		System.out.println( "(4) Quit Program");
		
		menuChoice1= input.nextInt();
		
		if (menuChoice1==1)
			{
				System.out.println( " In Manage Materials section");
				System.out.println( "(1) Display all materials");
				System.out.println( "(2) Checkout a material");
				System.out.println( "(3) Return a checked out material");
				System.out.println( "(4) Add a new material");
				System.out.println( "(5) Remove a material");
			}
		if (menuChoice1==2)
			{
				System.out.println( " In Patron Section");
				System.out.println( "(1) Display all patrons with their checked-out Materials");
				System.out.println( "(2) Display all patrons with their checked-out materials");
				System.out.println( "(3) Add a new patron");
				System.out.println( "(4) Remove a patron");
			}
		if ( menuChoice1==3)
			{
				//  does not exist
				System.out.println("  In Load/Save data");
			}
		if ( menuChoice1==4)
			{
				System.out.println("Program ending");
				System.exit(0);
			}
			
		
		
		
	
		
		
		
		
		
		
		
		
	}
	

}
