
public class Main
{
	public static void main ( String [] args)
	{
		Car car1 = new Car();
		car1.setModelYear(2995);
		System.out.println( " car1: " +car1.getModelYear());
		
		// Car car2 = car1;
		Car car2 = new Car(car1);
		//car2.setModelYear(1995);
		System.out.println(" car2: " + car2.getModelYear());
		
		// Compare car1 to car2
		System.out.println( " is car1 == car2? " + (car1== car2));
	}
}
