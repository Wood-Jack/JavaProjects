
public class SuperStore
{
	public static void main ( String [] args)
	{
		Product product1= new Product();
		product1.Name= "Acer computer";
		
		System.out.println(" Product name: " + product1.Name);
		
		Product price1= new Product();
		price1.price= 750.50;
		
		System.out.println(" Price: " + price1.price);
		
		Product qty= new Product();
		qty.inventoryQuantity=500;
		
		System.out.println(" Quantity " + qty.inventoryQuantity);
	}
}
