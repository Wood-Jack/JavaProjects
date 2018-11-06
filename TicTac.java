

import java.util.Scanner;

public class TicTac
{
	public static void main (String [] args )
	{
		Scanner playerInput= new Scanner (System.in);
		
		
		// Tic tac table
		char [][] table = new char [3][3];
		char player = 'X';
		char ch = '1';
		int row, column;
		int turnCounter= 1;
		
		
		System.out.println("Tic- Tac program begin");
		
			for ( int i = 0 ; i < table.length; i++)
			{
				for(int j= 0 ; j <  table[i].length; j++)
					{
		                table[i][j]=ch;
		                ch++;
					 }
				
			}
			for ( int i = 0 ; i < 3; i++)
			{
				for(int j= 0 ; j <  3; j++)
					{
		                System.out.print(table[i][j]);
					 }
				System.out.println();
			}
			
			
			while(winner(table) ==false && turnCounter !=9)
			{
				System.out.println( "Enter a postion for player" + player);
				row = playerInput.nextInt();
				
				
			
				while(!markTable(row,table,player))
				{
					System.out.println(" This spot is taken. Try again");
					System.out.println( "Enter a another postion" + player);
				row = playerInput.nextInt();
				}
			
		
				
				
				for ( int i = 0 ; i < 3; i++)
				{
				for(int j= 0 ; j <  3; j++)
					{
		                System.out.print(table[i][j]);
					 }
				System.out.println();
				}
			
				
				
				
				if (winner(table))
				{
					System.out.println("Player" + player+ " is the winner!!!");
				}
				
				// player taking turns
				turnCounter++;
				
				if (player== 'O')
				{
					player= 'X';
				}
				else
				{
					player = 'O';
				}
				if (winner(table) == false && turnCounter == 9 )
				{
					System.out.println("Game is a tie");
				}
				
		}
		
	}
	public static  boolean markTable(int input, char [][] table, char symbol)
	{ 
	
	
		if (input== 1)
		{
			if(table[0][0]== 'X' || table[0][0]== 'O')
			{
				return false;
			}
			else
			{
				 table[0][0]= symbol;
				 return true;
			}
			
		}
		else if (input==2)
		{
			
			if(table[0][1]== 'X' || table[0][1]== 'O')
			{
				return false;
			}
			else
			{
				 table[0][1]= symbol;
				 return true;
			}
		}
		else if (input==3)
		{
			
			if(table[0][2]== 'X' || table[0][2]== 'O')
			{
				return false;
			}
			else
			{
				 table[0][2]= symbol;
				 return true;
			}
		}
		else if (input==4)
		{
			
			if(table[1][0]== 'X' || table[1][0]== 'O')
			{
				return false;
			}
			else
			{
				 table[1][0]= symbol;
				 return true;
			}
		}
		else if (input==5)
		{
			
			if(table[1][1]== 'X' || table[1][1]== 'O')
			{
				return false;
			}
			else
			{
				 table[1][1]= symbol;
				 return true;
			}
		}
		else if (input == 6)
		{
			
			if(table[1][2]== 'X' || table[1][2]== 'O')
			{
				return false;
			}
			else
			{
				 table[1][2]= symbol;
				 return true;
			}
		}
		else if (input == 7)
		{
			
			if(table[2][0]== 'X' || table[2][0]== 'O')
			{
				return false;
			}
			else
			{
				 table[2][0]= symbol;
				 return true;
			}
		}
		else if (input == 8)
		{
			
			if(table[2][1]== 'X' || table[2][1]== 'O')
			{
				return false;
			}
			else
			{
				 table[2][1]= symbol;
				 return true;
			}
		}
		else if (input ==9)
		{
			
			if(table[2][2]== 'X' || table[2][2]== 'O')
			{
				return false;
			}
			else
			{
				 table[2][2]= symbol;
				 return true;
			}
		}
		
		
	return false;

	}
	
	public static boolean winner(char [][]table)
			{
				return ( (table[0][0] == table[1][0] && table[0][0]== table[2][0]) || (table[0][0] == table[0][1]&& table[0][0] == table[0][2] )||
				(table[1][0] == table[0][1] && table[1][0] == table[0][2]) || (table[2][0] == table[2][1] && table[2][0] == table[2][2])
				||(table[0][0]== table[1][1] && table[0][0] == table[2][2]) || (table[0][0]== table[1][1] && table[0][0] == table[2][1])
				||(table[0][2]== table[1][2] && table[0][2] == table[2][2])|| (table[2][0] == table[1][1]&& table [2][0] == table[0][2]));
			}
}
