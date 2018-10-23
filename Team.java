
public class Team 
{
	// Instance Variables for Teams
	private String teamName;
	private String name1,name2,name3,name4;
	private Competition competition1,competition2;
	
	//Copy Constructor
	public Team ( Team inputTeam)
	{ 
		teamName=inputTeam.getTeamName();
		name1=inputTeam.getName1();
		name2=inputTeam.getName2();
		name3=inputTeam.getName3();
		name4=inputTeam.getName4();
		competition1= inputTeam.getCompetition1();
		competition2= inputTeam.getCompetition2();
	}
	
	// Constructor method 
	
	public Team ( String teamName,String name1,String name2,String name3,String name4,
	Competition competition1, Competition competition2 )
	{
		this.teamName=teamName;
		this.name1=name1;
		this.name2=name2;
		this.name3=name3;
		this.name4=name4;
		this.competition1= competition1;
		this.competition2= competition2;
	}
	
	//Getter setter method
	public String getTeamName()
	{ 
		return this.teamName;
	}
	public void setTeamName(String inputTeamName)
	{
		this.teamName= inputTeamName;
	}
	public String getName1()
	{
		return this.name1;
	}
	public void setName1(String inputName1)
	{
		this.name1= inputName1;
	}
	public String getName2()
	{
		return this.name2;
	}
	public void setName2(String inputName2)
	{
		this.name2=inputName2;
	}
	public String getName3()
	{
		return this.name3;
	}
	public void setName3(String inputName3)
	{
		this.name3=inputName3;
	}
	public String getName4()
	{
		return this.name4;
	}
	public void setName4(String inputName4)
	{
		this.name4=inputName4;
	}
	public Competition getCompetition1()
	{
		return this.competition1;
	}
	public void setCompetition1(Competition inputCompetition1)
	{
		this.competition1=inputCompetition1;
	}
	public Competition getCompetition2()
	{
		return this.competition1;
	}
	public void setCompetition2(Competition inputCompetition2)
	{
		this.competition2=inputCompetition2;
	}
	
	public String toString()
	{
		return teamName+ " " + name1 + " " + name2 + " " + name3 + " " + name4 + 
		" " + competition1+ " " + competition2 ;
	}
		
}
	
