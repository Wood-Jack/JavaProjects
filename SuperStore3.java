
public class SuperStore3
{
	public static void main ( String [] args)
	{
		Product3 product1= new Product3("Acer Computer", 750.00, 700);
		//product1.name= "Acer computer ";
		product1.setName("Acer Computer");
		product1.setPrice (750.50);
		product1.setQuantity(500); 
        
		
		Product3 product2= new Product3("Beats Headphones", 500.25, 400);
		product2.setName("Beats Headphones");
		product2.setPrice(500.25);
		product2.setQuantity(400);
		
		Product3 product3= new Product3("Alien Ware", 25.00, 100);
		product3.setName("Alien Ware");
		product3.setPrice(25.00);
		product3.setQuantity(100);
		
		double inventoryValue= 0;
		inventoryValue += product1.calcInventoryValue();
		inventoryValue += product2.calcInventoryValue();
		inventoryValue += product3.calcInventoryValue();
		
		SalesTransaction sale1 = new SalesTransaction(product1,2)
		
		
		
		System.out.println(product1 +" inventory value of product " +product1.calcInventoryValue());
		
		System.out.println(product2 +" inventory value of product "+ product2.calcInventoryValue());
		
		System.out.println(product3+ " inventory value of product " + product3.calcInventoryValue());
		
		System.out.println(" Inventory value for all of the products is "+inventoryValue);
		
	}
}
