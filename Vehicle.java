
public class Vehicle
{
	private String vehicleMaker= "Tom";
	public int engine = 6;
	
	
	public String getVehicleMaker()
	{
		return  this.vehicleMaker;
	}
	
	public void setVehicleMaker (String inputVehicleMaker)
	{
		vehicleMaker = inputVehicleMaker;
	}
	
	public int getEngine()
	{
		return this.engine;
	}
	
	public void setEngine( int inputEngine)
	{
		engine= inputEngine;
	}
	
	public void carDescription()
	{
		System.out.println("Vehicle Owner and how many cylinders the engine has" + vehicleMaker + engine);
	}
	
	
}
	

