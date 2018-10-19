
public class Car
{
	// Instance Variables
	private int modelYear;
	
	// Constructor
	public Car()
	{
		// crate an empty car with no data
	}
	
	//Constructor- Copy Constructo
	public Car (Car inputCar)
	{
		// copy the model year from the input car to this car
		modelYear= inputCar.getModelYear();
	}
	
	// Get/Set Methods
	public void setModelYear (int inputModelYear)
	{
		modelYear = inputModelYear;
	}
	
	public int getModelYear()
	{
		return modelYear;
	}
	
	// equals methods 
	// compare myself to another object of my same type to see if th data calues maatcj
	
	public boolean equals (Car inputCar)
	{
		/*
		if ( modelYear == inputCar.getModelYear())
		{
			return true;
		}
		else
		{
			return false;
		}
		* */
		
		return (modelYear== inputCar.getModelYear());
	}
}
