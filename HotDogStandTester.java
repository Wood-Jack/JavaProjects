
public class HotDogStandTester
{
	public static void main ( String [] args)
	{
		HotDogStand hotDog1= new HotDogStand("W453667 ", 99);
		
		HotDogStand hotDog2= new HotDogStand("W732928 ", 45);
		
		HotDogStand hotDog3= new HotDogStand("W324359 ", 27);
		
		
		hotDog1.justSold();	
		hotDog2.justSold();
		hotDog3.justSold();
		
		System.out.println(hotDog1);
		System.out.println(hotDog2);
		System.out.println(hotDog3);
		System.out.println(HotDogStand.hotDogSold());
		
		
		
		
	}
}
