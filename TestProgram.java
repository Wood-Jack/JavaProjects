public class TestProgram
{
	public static void main (String[] args)
	{
		System.out.println("Hello");
		
		Car car1 = new Car();
		
		car1.color = "Red";
		car1.year = 2008 ;
		System.out.println(" Car 1 color: " + car1.color);
		
		System.out.println(" Car 1 year: " + car1.year);
		
		Car car2 = new Car();
		car2.color= "Blue";
		System.out.println(" Car 2 color: " + car2.color);
		
		car2.speak();
		
		String car2Color = car2.getColor ();
		System.out.println(" Car 2 color: " + car2.getColor());
	}
}
