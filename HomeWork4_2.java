


import java.util.Scanner;

public class HomeWork4_2
{
	public static void main (String[] args)
	{
		System.out.println("Hello world");
		System.out.println(" What is your age");
		Scanner keyBoard = new Scanner(System.in);
		
		int input1, input2;
		input1= keyBoard.nextInt();
		
		
		
		if(input1 < 15)
		{
			System.out.println(" You can't drive");
		}
		else if ((input1 > 16) && (input1 == 17))
		{
			System.out.println(" You can drive but not vote");
		}
		else if ((input1 > 17) && (input1 < 24))
		{
			System.out.println(" You can vote but not rent a car");
		}
		else if (input1 > 25) 
		{
			System.out.println(" You can do pretty much anything ");
		}
	}
}
