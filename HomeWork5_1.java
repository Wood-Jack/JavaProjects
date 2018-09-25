

import java.util.Random;

public class HomeWork5_1
{
	public static void main (String args[])
	{
		System.out.println("Welcome Finalists");
		int finalist1, finalist2, finalist3;
		Random winnerRoll= new Random();
		
		do
		{
			// The roll for the three winning contestants
			finalist1= winnerRoll.nextInt(30)+1;
			System.out.println(" Prize winner 1 is " + finalist1);
			
			finalist2= winnerRoll.nextInt(30)+1;
			System.out.println(" Prize winner 2 is " + finalist2);
			
			finalist3= winnerRoll.nextInt(30)+1;
			System.out.println(" Prize winner 3 is " + finalist3);
		}
		// the finalist can't equal the same number
		while (finalist1 == finalist2 && finalist2 == finalist3 && finalist3 == finalist1);
		
		System.out.println("Winners!");
		
	}
}
