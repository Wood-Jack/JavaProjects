
public class Product2
{
	// Instance Variables
	private String name;
    private double price;
	private int Quantity;
	
	// Constructor Method
	
	public Product2(String name)
	{
		System.out.println("DEBUG: Picked Constructor 1");
		this.name= name;
	}
	 public Product2(String name, double price)
	{
		System.out.println("DEBUG: Picked Constructor 2" );
		this.name= name;
		this.price= price;
	}
	 public Product2(String name, double price, int Quantity)
	{
		System.out.println("DEBUG: Picked Constructor 3" );
		this.name= name;
		this.price= price;
		this.Quantity=Quantity;
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
		return name+" "+price+"  "+Quantity;
	}
	public double calcInventoryValue()
		{
			return price*Quantity;
		}
	}

