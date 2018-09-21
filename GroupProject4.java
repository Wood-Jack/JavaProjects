

import java.util.Random;

 public class GroupProject4
{
	public static void main (String args [])
	{ 
		System.out.println(" Yahtzee");
		// variable declartions dice1 dice2 dice3 dice4 dice5 
		int dice1, dice2, dice3, dice4, dice5;
		
		// Create random number generator, named diceRoller
		Random diceRoller = new Random();
		int counter =1;
		
		do
		{
				
			// Roll dice1
			dice1= diceRoller.nextInt(6) + 1;
			System.out.println(" dice 1 equals " + dice1);
			
			dice2= diceRoller.nextInt(6)+ 1;
			System.out.println(" dice 2 equals " + dice2);
			
			dice3= diceRoller.nextInt(6) +1;
			System.out.println(" dice 3 equals " + dice3);
			
			dice4= diceRoller.nextInt(6) +1;
			System.out.println(" dice 4 equals " + dice4);
			
			dice5= diceRoller.nextInt(6) +1;
			System.out.println(" dice 5 equals " + dice5);
			counter++;
		
		
		}
		while(dice1 != dice2 || dice2 != dice3 || dice3 != dice4 || dice4 != dice5);
		System.out.println(" Yahtzee!!");
		System.out.println(" It took this many " + counter);
	
		
	}
}
