
public class Patrons
{
	private  int patronID;
	// create a private name for the patron collection system
	private  String name;
	
	
	//Constructor Method 
	public Patrons( int patronID, String name)
	{
		this.patronID= patronID;
		this.name= name;
	}
	
	
	//getters setters

	public int getPatronID()
	{
		return patronID;
	}
		
	public void setPatronID ( int inputPatronID)
	{
		this.patronID = inputPatronID;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String inputName)
	{
		this.name= inputName;
	}
	
	
	
	
	
	
	
	
	
	public static void getPatronIDs ( Patrons[] patronCollector)
	{
		for (int i = 0; i < patronCollector.length; i++)
		{
			System.out.println("" + patronCollector[i]);
		}
		
	}
	/* Patrons completed */
	
	
	
}
	
	
	
	
	
	
	
	

