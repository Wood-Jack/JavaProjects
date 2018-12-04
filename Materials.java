



public class Materials
{

	private static int materialID;
	private String title;
	private int id;
	
	//Constructor Method
	public Materials(String title, int id )
	{
		this.id = id;
		this.title= title;
	
	}
	
	
	//default Constructor Method
	public Materials()
	{
		this.id= materialID;
		this.title= "title";
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
	
	
	
}
	

            
            
            
            
            
            
