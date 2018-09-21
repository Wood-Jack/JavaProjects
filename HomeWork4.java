import java.util.Scanner;

public class HomeWork4
{
	public static void main (String[] args)
	{
		System.out.println("Hello world");
		System.out.println(" Is it Animal, Vegetable, or Mineral");
		Scanner Name = new Scanner(System.in);
		
		String Input1, Input2;
		Input1= Name.nextLine();
		
		
		
		
		if(Input1.equalsIgnoreCase("Animal"))
		{
			System.out.println(" Is it bigger than a loaf of bread?");
			Input2= Name.nextLine();
			if (Input2.equalsIgnoreCase("yes"))
			{
				System.out.println("Your proably thinking of a hedgehog");
			}
			else if (Input2.equalsIgnoreCase("No"))
			{
				System.out.println("Your proably thinking of a Elephant");
            }
		}
		else if (Input1.equalsIgnoreCase("Vegetable"))
		{
			System.out.println(" Is it bigger than a loaf of bread?");
			Input2= Name.nextLine();
			if (Input2.equalsIgnoreCase("yes"))
			{
				System.out.println("Your proably thinking of a strawberrys");
			}
			else if (Input2.equalsIgnoreCase("no"))
			{
				System.out.println("Your proably thinking of a watermelon");
			}
		}
		else if(Input1.equalsIgnoreCase("Mineral"))
		{
			System.out.println(" Is it bigger than a loaf of bread?");
			Input2= Name.nextLine();
			if (Input2.equalsIgnoreCase("yes"))
			{
				System.out.println(" Your proably thinking of a paper clip");
			}
			else if (Input2.equalsIgnoreCase("no"))
			{
				System.out.println("Your proably thinking of a SS Chevelle ");
			}
			
		}
	}
}
