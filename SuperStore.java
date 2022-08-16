
public class SuperStore3
{
	public static void main ( String [] args)
	{
		Product product1= new Product("Acer Computer", 750.00, 700);
		//product1.name= "Acer computer ";
		product1.setName("Acer Computer");
		product1.setPrice (750.50);
		product1.setQuantity(500); 
        
		
		Product product2= new Product("Beats Headphones", 500.25, 400);
		product2.setName("Beats Headphones");
		product2.setPrice(500.25);
		product2.setQuantity(400);
		
		Product product3= new Product3("Alien Ware", 25.00, 100);
		product3.setName("Alien Ware");
		product3.setPrice(25.00);
		product3.setQuantity(100);
		
		double inventoryValue= 0;
		inventoryValue += product1.calcInventoryValue();
		inventoryValue += product2.calcInventoryValue();
		inventoryValue += product3.calcInventoryValue();
		
	
		
		
		System.out.println(product1 +" Inventory value of product $" +product1.calcInventoryValue());
		
		System.out.println(product2 +" Inventory value of product $"+ product2.calcInventoryValue());
		
		System.out.println(product3+ " Inventory value of product $" + product3.calcInventoryValue());
		
		System.out.println(" Inventory value for all of the products is $"+inventoryValue);
		
			SalesTransaction1 sale1 = new SalesTransaction1(product1,55);
			SalesTransaction1 sale2 = new SalesTransaction1 (product2,45);
			SalesTransaction1 sale3 = new SalesTransaction1 (product3, 5);
		System.out.println(sale1.toString());
		System.out.println(sale2.toString());
		System.out.println(sale3.toString());
	
		
	}
}
