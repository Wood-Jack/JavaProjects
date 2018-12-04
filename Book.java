public class Book extends Materials
{
	private String author;
	private String ISBN;
	
	//Constructor Method
	public Book ( String title, int id, String author, String ISBN)
	{
		super(title,id);
		this.author= author;
		this.ISBN= ISBN;
	}
	
	//default Constructor
	public Book()
	{
		this.author= "no Author";
		this.ISBN= " no ISBN";
	}
	
	// getters and setters
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor( String inputAuthor)
	{
		this.author= inputAuthor;
	}
	
	public String getISBN()
	{
		return ISBN;
	}
	public void setISBN(String inputISBN)
	{
		this.ISBN=inputISBN;
	}
}
