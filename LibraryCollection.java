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
	
	// display Materials
	
	public static void displayMaterials(Materials[] libraryCollector)
	{
		for( int i = 0 ; i < libraryCollector.length; i++)
		{
			if ( libraryCollector[i] != null)
			{
				System.out.println( "  " + libraryCollector[i]);
			}
		}
	}
	
	// find Materials
	public static void findMaterials(Materials[] libraryCollector, String inputTitle, int ID)
	{
		for( int i = 0 ; i < libraryCollector.length; i++)
		{
			if ( libraryCollector[i] != null)
			{
				if ((libraryCollector[i].getTitle().equalsIgnoreCase(inputTitle)) && (libraryCollector[i].getMaterialID() == ID))
				{
					System.out.println( "   " + libraryCollector[i]);
				}
			}
		}
	}
	
	// checked out materials.
	
	
	
	public static void checkedOutMaterials(Materials[] libraryCollector, boolean inputCheckedOut )
	{
		for( int i = 0 ; i < libraryCollector.length; i++)
		{
			if ( libraryCollector[i] != null)
			{
				if(libraryCollector[i].getCheckedOut())
				{
				System.out.println( "  " + libraryCollector[i]);
				}
			}
		}
	}
	
	// add book
	public static void addBooks( Materials[] libraryCollector, String inputAuthor, String inputISBN,
	 int id, int checkedOutPatron, boolean checkedOut, String title)
	{
		for ( int i = 0 ; i< libraryCollector.length; i++)
		{
			if (libraryCollector[i] != null)
			{
				// fix checked out and checked out patron if must 
                Materials newBook = new Book (title,id,inputAuthor, inputISBN,checkedOutPatron, checkedOut);
                
				libraryCollector[i]=  newBook;
				System.out.println("Book has been Added");
				
			}
		}
	}
	
	//remove book 
	public static void removeBook( Materials[] libraryCollector, String inputAuthor, String inputISBN)
	{
		for ( int i = 0 ; i< libraryCollector.length; i++)
		{
			if (libraryCollector[i] != null)
			{
				if ((libraryCollector[i].getAuthor().equalsIgnoreCase(inputAuthor)) && libraryCollector[i].getISBN == ISBN)
				{
					libraryCollector[i]=null;
					System.out.println("Book has been deleted");
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
