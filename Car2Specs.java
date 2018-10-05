
public class Car2Specs
{
	// Instance Variables
	public String vehicle;
	public double gasTank;
	public double fuelEfficiency;
	
	//Method
	public String toString()
{
	return "Vehicle is: "+vehicle+"gas tank holds "+gasTank+" Fuel efficency is "+ fuelEfficiency;
}
	public double drive()
	{
		return gasTank*fuelEfficiency;
	}
}
	
