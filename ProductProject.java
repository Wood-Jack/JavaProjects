





public class ProductProject
{
	// Instance Variables
	// Attributes/Properties that describe a product
	
	private String name;
	private double price;
	private int quantity;
	
	// Constructor Method
	public ProductProject(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
	}
	
	// Getter/Setter Methods
	public String getName()
	{
		return name;
	}
	public void setName(String inputName)
	{
		this.name = inputName;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	// Methods
	public double getInventoryValue()
	{
		/*
		double inventoryValue;
		inventoryValue = price * quantity;
		return inventoryValue;
		*/
		
		return price * quantity;
	}
	
	
	
	
	
	public String toString()
	{
		return "Product: " + name;
	}
}
