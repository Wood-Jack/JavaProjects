


import java.util.Scanner;

public class PlayerStatDriver
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
		input.nextLine();
		
		System.out.print("option selected:  " + menuChoice1);
		
		// adding a new player name and scor
		if (menuChoice1 == 1)
		{
			if(countPlayers >= 10)
			{
				System.out.println(" Already enterd 10 players");
			}
			else
			{
		
			System.out.println("Please enter Player Name:");
			//String temp = input.nextLine(); 
			String playerName= input.nextLine();
			
			
			//get player Score
			System.out.println(" Please enter player score ");
			int playerScore= input.nextInt();
			input.nextLine();
			
			//temp= input.nextLine();
			
			//assign values to array at correct index position
			playerNames[countPlayers]= playerName;
			playerScores[countPlayers]= playerScore;
			countPlayers +=1;
			}
			
			
				
			
		}
		//print all the player scores
	    if (menuChoice1==2)
		{
			for ( int i= 0 ; i < countPlayers; i++)
			{
					System.out.println("Player " + i+ " : " + playerNames[i] + " has a score of " + playerScores[i]);
			}
		}
		//find player by name
		if (menuChoice1==3)
		{
			String searchName=input.nextLine();
			for ( int i =0 ; i< 10; i++ )
			{
				if (searchName.equalsIgnoreCase(playerNames[i]))
				{
					System.out.println(" Players Score " + playerScores[i]);
				}
			}
		}
		//remove players name 
		
		if (menuChoice1==4)
		{
			String searchName=input.nextLine();
			for ( int i = 0; i < 10; i++)
			{
				if (searchName.equals(playerNames[i]))
				{
				playerNames[i]="";
				System.out.println("Player Name Deleted ");
				}
		
			}
		}
	}
	while  (menuChoice1 != 5);
}
}
