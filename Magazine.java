public class Magazine extends Materials
{
	private String issueNbr;
	
	//constructor method
	public Magazine ( String title, int id , String issueNbr)
	{
		
		super(title, id);
		this.issueNbr=issueNbr;
		
	}
	
	//default constructor
	public Magazine()
	{
		
		this.issueNbr= " No issueNbr";
	}
	
	//getters and setters 
	public String getIssueNbr()
	{
		return issueNbr;
	}
	public void setIssueNbr( String inputIssueNbr)
	{
		this.issueNbr= inputIssueNbr;
	}
}
