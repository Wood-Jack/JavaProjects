/*
 * Library Collector
 * 
 * 
 * 
 * ********************** */
public class LibraryCollection
{
	private int collectionMaxSize;
	private Materials [] libraryCollector;
	public static final int INTIAL_SIZE = 10;
	
	// constructor method
	public LibraryCollection( int collectionMaxSize, Materials[] libraryCollector)
	{
		this.collectionMaxSize= collectionMaxSize;
		this.libraryCollector= libraryCollector;
	}
	
	// Default constructor method
	public LibraryCollection()
	{
		this.collectionMaxSize= INTIAL_SIZE;
		this.libraryCollector = new Materials[INTIAL_SIZE];
	}
	
	// get set methods
	
	public int getCollectionMaxSize()
	{
		return collectionMaxSize;
	}
	public void setCollectionMaxSize( int inputCollectionMaxSize)
	{
		this.collectionMaxSize = inputCollectionMaxSize;
	}
	
	public Materials[] getLibraryCollector()
	{
		return libraryCollector;
	}
	public void setLibraryCollector( Materials[] inputLibraryCollector)
	{
		this.libraryCollector= inputLibraryCollector;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
