



public class Materials
{

	private static int materialID;
	private String title;
	private int id;
	private int checkedOutPatron;
	private boolean checkedOut;
	
	
	//Constructor Method
	public Materials(String title, int id , int checkedOutPatron, boolean checkedOut)
	{
		this.id = materialID;
		this.title= title;
		this.checkedOutPatron= checkedOutPatron;
		this.checkedOut = checkedOut;
	
	}
	
	
	//default Constructor Method
	public Materials()
	{
		this.id= materialID;
		this.title= "title";
		this.checkedOutPatron= 0;
		this.checkedOut= false;
		materialID++;
	}
	
	
	//Get/ Set methods
	public int getMaterialID()
	{
		return materialID;
	}
	public void setMaterialID(int inputMaterialID)
	{
		this.materialID = inputMaterialID;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String inputTitle)
	{
		this.title = inputTitle;
	}
	public int getCheckedOutPatron()
	{
		return checkedOutPatron;
	}
	public void setCheckedOutPatron( int inputCheckedOutPatron)
	{
		this.checkedOutPatron = inputCheckedOutPatron;
	}
	public boolean getCheckedOut()
	{
		return checkedOut;
	}
	public void setCheckedOut( boolean inputCheckedOut)
	{
		this.checkedOut= inputCheckedOut;
	}
	
	
	
	
	
}
	

            
            
            
            
            
            
