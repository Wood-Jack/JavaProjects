


import java.util.Scanner;

public class HomeWork10
{
	public static void main (String [] args)
	{
		
		/*Menu System
		 * (1) add a new player and score ( up to 10 players)
		 * (1) Print all the players scores
		 * (1) find player by name and print
		 * (1) remove player by name
		 * (5) Quit
		 * ********** */
		 
		 // input for menu options
		System.out.println(" hello world");
		int menuChoice1;
		Scanner input= new Scanner(System.in);
		
		String playerNames[] = new String [10];
		int playerScores[] = new int [10];
		
		int countPlayers=0;
		
		
		do
	{
		System.out.println(" Choose a menu option");
		System.out.println(" (1) add a new player and score");
	    System.out.println(" (2) print all the players scores");
		System.out.println(" (3) find player by name and print score");
		System.out.println(" (4) Remove player by name");
		System.out.println(" (5) Quit");
		
		menuChoice1= input.nextInt();
		
		System.out.print("Debug: you choose option;" + menuChoice1);
		
		// adding a new player name and scor
		if (menuChoice ==1)
		{
			if(countPlayer >= 10)
			{
				System.out.println(" Already enterd 10 players");
			}
			else
			{
		
			System.out.println("please enter Player Name:");
			String playerName= input.nextLine();
			
			//get player Score
			System.out.println(" please enter player score ");
			int playerScore= input.nextInt();
			
			//assign values to array at correct index position
			playerNames[countPlayers]= playerName;
			playerScores[countPlayers]= playerScore;
			countPlayers +=1;
			}
			
			
				
			
		}
		//print all the player scores
		else if (menuChoice1==2)
		{
			for ( int i= 0 ; i < countPlayers; i++)
			{
					System.out.println("Player" + i+ ":" + playerNames[i] + " has a score of " + playerScores[i]);
			}
		}
		//find player by name
		if (menuChoice1==3)
		{
			String searchName=input.nextLine();
			for ( int i =0 ; i< 10; i++ )
			{
				if (searchName.equals(playerName[i]))
				{
					System.out.println(" Players Score" + playerScore[i]);
				}
			}
		}
		//remove players name 
		
		if (menuChoice1==4)
		{
			for ( int i = 0; i< 10; i++)
			{
				if (searchName.equals(playerName[i]))
				{
				playerName[i]="";
				System.out.println("Player Name Deleted ");
				}
		
			}
		}
	
	while  (menuChoice != 5);
		{
		}
}
