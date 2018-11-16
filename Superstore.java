public class Superstore
{
	public static void main(String[] args)
	{	
		ProductProject product1 = new ProductProject("Nintendo", 300, 50);
		ProductProject product2 = new ProductProject("Xbox", 250, 150);
		ProductProject product3 = new ProductProject("Playstation", 200, 150);
		
		System.out.println(product1.toString());
		System.out.println(product2.toString());
		System.out.println(product3.toString());
		
		
		
	}
}
