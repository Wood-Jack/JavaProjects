
public class TeamDriver
{
	public static void main ( String [] args)
	{
		Competition event1= new Competition ( "Programming ", "Spartans ", "Eagles ", 2018);
		Competition event2= new Competition ( " Decoding ", "Eagles ", "Spartans", 2018);
		
		Team team1= new Team("Eagles", "Barry","Drew","Tim","Henry", event1 , event2);
		
		
		System.out.println(team1);
	}
}
