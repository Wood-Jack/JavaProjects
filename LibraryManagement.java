

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
		String library[] = new String[100];

		
		// Creating the array for the to hold the 3 classes
	
	
			
		System.out.println("Welcome to the Library Management operating system");
		System.out.println( "(1) Manage Materials");
		System.out.println( "(2) Manage Patrons");
		System.out.println( "(3) Load/SaveData");
		System.out.println( "(5) Quit Program");
		
		menuChoice1= input.nextInt();
	}
	
}
