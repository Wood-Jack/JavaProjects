



public class Materials
{

	private static int materialID;
	private String title;
	private int id;
	private int checkedOutPatron;
	
	//Constructor Method
	public Materials(String title, int id , int checkedOutPatron)
	{
		this.id = materialID;
		this.title= title;
		this.checkedOutPatron= checkedOutPatron;
	
	}
	
	
	//default Constructor Method
	public Materials()
	{
		this.id= materialID;
		this.title= "title";
		this.checkedOutPatron= 0;
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
	public int getCheckedOut()
	{
		return checkedOutPatron;
	}
	public void setCheckedOut( int inputCheckedOutPatron)
	{
		this.checkedOutPatron = inputCheckedOutPatron;
	}
	
	
	
	
	
	
	
	/*need to do checkedOut: boolean
	 * need to do checkedOutPatron: int
	 * 
	 * 
	 * ******** */
	
	
}
	

            
            
            
            
            
            
