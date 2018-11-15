
public class Person
{
	// instance variables
	
	private String name = "Bob" ;
	
	// getter and setters 
	
	public Person( String theName, Person theObject, String name)
	
	{
		this.name = name;
		this.theName = theName;
		this.theObject = theObject;
	}
	
	public Person (String theName)
	
	{
		this.theName= theName;
	}
	
	public Person ( Person theObject)
	
	{
		this.theObject= theObject;
	}
	
	public String getName()
	
	{
		return this.name;
	}
	
	public void setName(String theName)
	
	{
		this.name = theName;
	}
	
	
	public String toString()
	
	{
		return theName + theObject + name;
	}
	
	public boolean equals(Object other)
	
	{
		 return true;
	}
	
}
