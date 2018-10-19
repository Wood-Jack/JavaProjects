
public class Product4
{
	// Instance Variables
	private String name;
    private double price;
	private int Quantity;
	
	// Constructor Method
	
	 public Product4(String name, double price, int Quantity)
	{
		
		this.name= name;
		this.price= price;
		this.Quantity=Quantity;
	}
	// Copy constructor
	public Product4 (Product4 inputProduct)
	{
		name=inputProduct.getName();
		price=inputProduct.getPrice();
		Quantity= inputProduct.getQuantity();
	}
	
	
	 //Getter/Setter Mehtods
	public String getName()
	{
		return this.name;
	}
	public void setName( String inputName)
	{
		this.name= inputName;
	}
	public double getPrice()
	{
		return this.price;
	}
	public void setPrice(double price)
	{
		this.price= price;
	}
	public int getQuantity()
	{
		return this.Quantity;
	}
	public void setQuantity(int Quantity)
	{
		this.Quantity=Quantity;
	}
	
	// methods

	public String toString()
	{
		return name ;
	}
	/*
	 * double inventoryValue;
	 * inventorValue= price*quantity
	 * return inventoryValue;
	 * 
	 * ******************** */
	public double calcInventoryValue()
		{
			return price*Quantity;
		}
			public boolean equals(Product4 inputProduct)
	{
		if ( name == inputProduct.getName())
		{
			return true;
		}
		else
		{
			return false;
		}
		if ( price == inputProduct.getPrice())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

