
public class Competition
{
	// instance variables
	private String nameCompetition,winningTeam,runnerUp;
	private int yearCompetition;
	
	//Copy Constructor
	public Competition( Competition inputCompetition)
	{
		nameCompetition=inputCompetition.nameCompetition;
		winningTeam=inputCompetition.winningTeam;
		runnerUp= inputCompetition.runnerUp;
		yearCompetition= inputCompetition.yearCompetition;
	}
	
	
	
	//Constructor Method
	public Competition ( String nameCompetition,String winningTeam,String runnerUp, int yearCompetition)
	{
		this.nameCompetition= nameCompetition;
		this.winningTeam=winningTeam;
		this.runnerUp=runnerUp;
		this.yearCompetition=yearCompetition;
	}
	public String toString()
	{
	return nameCompetition + winningTeam + runnerUp + yearCompetition;
	}
}
