
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

//Exporter 
import java.io.PrintWriter;




public class DataImportExport
{
	//method to import ProductProject data from a file and create
	// an Array of Product objects
	public ProductProject [] importProducts(String inputFilePath)
	{
		ProductProject [] products = new ProductProject[100];
		int productCount=0;
	
		Scanner importProduct = null ;
	


	//open my data file for reading
		try 
		{
			importProduct = new Scanner( new FileInputStream(inputFilePath));
			importProduct.useDelimiter(",|\r|\n");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("could not find the file");
		}
	
		
		
		//to do : for each line in the file...
		// to do: (1) read in the line of text and split it into the name, price, and quantiy
		while (importProduct.hasNextLine())
			{
				String name = importProduct.next();
				double price = importProduct.nextDouble();
				int quantity = importProduct.nextInt();
				
				System.out.println("debug: Name " + name);
				System.out.println("debug: Price " + price);
				System.out.println("debug: Quantity " + quantity);
				
				//System.out.println(importProduct.nextLine()); (debugged cause it to skip over the lines)
			
		
				//to do : (2) create a new product object, setting the values for name, price, and quantity,
				ProductProject product = new ProductProject(name, price, quantity);
				// to do: (3)  add the product  object to the array
				products[productCount] = product;
				productCount++;
		
				//Advance the cursor past the end of the line because Scanner is terrible
				if(importProduct.hasNextLine())
				{
					importProduct.nextLine();
				}
			}
			importProduct.close();
			
			// return my Array of Product objects back to the main method
			return products;
			
			
			
		}
		
		public static void exportProducts (ProductProject product [] , String inputFilePath)
		{
			//Exporter creating object
		PrintWriter exportProducts = null ;
		
		try
		{
			exportProducts =  new PrintWriter (new FileOutputStream(inputFilePath));
			System.out.println(" Please create a product with a name,price, quantity");
			for( int i=0; i < product.length ; i++)
			{
				if (product[i] != null)
				{
					exportProducts.println(product[i]);
				}
			}
		}	
		catch(FileNotFoundException e)
		{
			System.out.println("file not found");
		}
		
		exportProducts.close();
		
		}
		
	
		
		
		
		
		/*public static void main(String[] args)
		{
			DataImportExport data = new DataImportExport();
			data.importProducts("products.txt");
		}*/
		
		
				
		
}
