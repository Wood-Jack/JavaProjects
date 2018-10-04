
public class Car2
{
	public static void main ( String [] args)
	{
		Car2Specs car1= new Car2Specs();
		car1.vehicle= "Toyata Corolla ";
		car1.gasTank= 13;
		car1.fuelEfficiency= 30;
		car1.gasTank*car1.fuelEfficiency;
		
		Car2Specs car2= new Car2Specs();
		car2.vehicle= "Ford F-150 ";
		car2.gasTank= 30;
		car2.fuelEfficiency= 20;
		car2.gasTank*car2.fuelEfficiency;
		
		Car2Specs car3= new Car2Specs();
		car3.vehicle= "Toyata Prius ";
		car3.gasTank= 9;
		car3.fuelEfficiency= 45;
		car3.gasTank*car3.fuelEfficiency;
		
		System.out.println(car1);
	}
}
