/*
*Two Dimensional Arrays
* By: Woodrow Jackson
 * ***************** */
 
 public class Dimensional
 {
	 public static void main (String [] args)
	 {
		 System.out.println( "hello world");
		
		
		// Declare array
		int[][] table = new int[3][3];
		
		//this our counter- it will start at 1 and go to 36
		int number=1;
		
	
		
		
			
		
		
		//T0-Do: Assign values to each element of the array, 1-36
		// Outer Loop: Loop through each ROW	
		for (int row = 0 ; row < table.length; row++)
		{	
			// Inner Loop: For each row, loop through each column
			for  ( int column =0 ; column < table[row].length ; column++)
			{
				// Assign a value  to the array element
				table[row][column] = number;
				number++;
			}
		
		}
		for (int row = 0 ; row < table.length; row++)
		{	
			// Inner Loop: For each row, loop through each column
			for  ( int column =0 ; column < table[row].length ; column++)
			{
				// A display the value
				System.out.print(table[row][column] + " ");
				
			}
			// at the end of each row, print a new line
			System.out.println();
		}
	}
}
