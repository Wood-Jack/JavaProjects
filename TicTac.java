

import java.util.Scanner;

public class TicTac
{
	public static void main (String [] args )
	{
		Scanner playerInput= new Scanner (System.in);
		
		
		// Tic tac table
		int [][] table= new int [3][3];
		int number=1;
		
		
		
		
		System.out.println("Tic- Tac program begin");
		
			for ( int row = 0 ; row < table.length; row++)
			{
				for(int column= 0 ; column < table[row].length; column++)
			{
				table[row][column]= number;
				number++;
			}
			}
		
			for ( int row = 0 ; row < table.length; row++)
			{
				for(int column= 0 ; column < table[row].length; column++)
				{
				System.out.print(table[row][column]+ "  ");
				}
				System.out.println();
			}
		System.out.println("please enter number");
	}
}
