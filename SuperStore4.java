
public class SuperStore4
{
	public static void main ( String [] args)
	{
		Product4 product1= new Product4("Acer Computer", 750.00, 700);
		//product1.name= "Acer computer ";
		//product1.setName("Acer Computer");
		//product1.setPrice (750.50);
		//product1.setQuantity(500); 
        
		
		Product4 product2= new Product4("Beats Headphones", 500.25, 400);
		//product2.setName("Beats Headphones");
		//product2.setPrice(500.25);
		//product2.setQuantity(400);
		
		Product4 product3= new Product4("Alien Ware", 25.00, 100);
		//product3.setName("Alien Ware");
		//product3.setPrice(25.00);
		//product3.setQuantity(100);
		
		Product4 product4= new Product4 (product1);
		Product4 product5= new Product4 (product2);
		
		double inventoryValue= 0;
		inventoryValue += product1.calcInventoryValue();
		inventoryValue += product2.calcInventoryValue();
		inventoryValue += product3.calcInventoryValue();
		
		// Testing the copy of product 1 to product 4
         System.out.println(product1.toString());
         System.out.println(product4.toString());
         
         // Testing the copy of product 2 to product 5
         System.out.println(product2.toString());
         System.out.println(product5.toString());
		
		// proof of true or false hood of the products change
		System.out.println( " Is product1 = to product4 " + (product1.equals(product4)));
		System.out.println( " Is product5 = to prodct3 " + ( product5 ==product3));
		
		//System.out.println(product1 +" Inventory value of product $" +product1.calcInventoryValue());
		
		//System.out.println(product2 +" Inventory value of product $"+ product2.calcInventoryValue());
		
		//System.out.println(product3+ " Inventory value of product $" + product3.calcInventoryValue());
		
		//System.out.println(" Inventory value for all of the products is $"+inventoryValue);
		
			//SalesTransaction1 sale1 = new SalesTransaction1(product1,55);
			//SalesTransaction1 sale2 = new SalesTransaction1 (product2,45);
			//SalesTransaction1 sale3 = new SalesTransaction1 (product3, 5);
		//System.out.println(sale1.toString());
		//System.out.println(sale2.toString());
		//System.out.println(sale3.toString());
	
		
	}
}
