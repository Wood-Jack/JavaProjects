

import java.util.Scanner;
/*
*Program: Airplane.java
*Description: A program that asks passengers what seats they want in a plane
*if seat is taken X will appear
*/



public class AirPlane
{
	public static void main ( String [] args)
	{
		
		Scanner seatInput= new Scanner (System.in);
		
		char [][] plane  = new char [7][4];
		
		char passanger = 'X';
		int row, column;
		char tp ='A';
		int seatCounter= 1;
		
		System.out.println(" Welcome Board Budget Airlines");
		
		for (int i= 0; i< plane.length;  i++)
		{
			for (int j =0 ; j < plane[i].length; j++)
			{
				
				plane[i][j] = tp ;
				tp++;
			}
			tp= 'A';
		}
		
		for (int i =0 ; i < 7; i++)
		{
			System.out.print(i+1);
			for (int j = 0 ; j < 4; j++)
			{
				System.out.print( plane[i][j]);
			}
			System.out.println();
		}
		
		while (seatCounter != 28)
		{
			System.out.println("Please choose a row");
			row= seatInput.nextInt()-1;
			System.out.println("Please choose a seat");
			column= seatInput.next().toUpperCase().charAt(0)-65;
			
			while(plane[row][column] == 'X')
				{
					System.out.println(" This spot is taken. Try again");
					
					System.out.println("Please choose a row");
					row= seatInput.nextInt()-1;
					System.out.println("Please choose a seat");
					column= seatInput.next().charAt(0)-65;
					
					
				}
			plane[row][column]= 'X';
			seatCounter++;
			
			for (int i =0 ; i < 7; i++)
			{
				System.out.print(i+1);
				for (int j = 0 ; j < 4; j++)
				{
					System.out.print( plane[i][j]);
				}
					System.out.println();
			}
			
			if(seatCounter == 28)
			{
				System.out.println( "All Seats Are Taken");
				System.exit(0);
			}
			
		}
		
		
		
		
	}
}
		


