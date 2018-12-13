public class Magazine extends Materials
{
	private String issueNbr;
	
	//constructor method
	public Magazine ( String title, int id , String issueNbr, int checkedOutPatron, boolean checkedOut)
	{
		
		super(title, id, checkedOutPatron, checkedOut);
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
	/* Magazine completed */
}
