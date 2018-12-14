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
	public static void removeBook( Materials[] libraryCollector, String inputTitle, String inputISBN)
	{
		for ( int i = 0 ; i< libraryCollector.length; i++)
		{
			if (libraryCollector[i] != null)
			{
				if ((libraryCollector[i].getAuthor().equalsIgnoreCase("Author")) && libraryCollector[i].getISBN() == "ISBN")
				{
					libraryCollector[i]=null;
					System.out.println("Book has been deleted");
				}
			}
		}
	}
	
	// add  video
	
	
	public static void addVideos( Materials[] libraryCollector,String title, int id, String director, int checkedOutPatron, boolean checkedOut)
	{
		for ( int i = 0 ; i< libraryCollector.length; i++)
		{
			if (libraryCollector[i] != null)
			{
				// fix checked out and checked out patron if must 
                Materials newVideo = new Video (title, id, director,  checkedOutPatron, checkedOut);
                
				libraryCollector[i]=  newVideo;
				System.out.println("Video has been Added");
				
			}
		}
	}
	
	//remove video

	public static void removeVideo( Materials[] libraryCollector, String inputDirector)
	{
		for ( int i = 0 ; i< libraryCollector.length; i++)
		{
			if (libraryCollector[i] != null)
			{
				if ((libraryCollector[i].getDirector().equalsIgnoreCase("Director")))
				{
					libraryCollector[i]=null;
					System.out.println("Video has been deleted");
				}
			}
		}
	}
	//add magazine
	
	public static void addMagazine( Materials[] libraryCollector, String title, int id , String issueNbr,
	 int checkedOutPatron, boolean checkedOut )
	{
		for ( int i = 0 ; i< libraryCollector.length; i++)
		{
			if (libraryCollector[i] != null)
			{
				// fix checked out and checked out patron if must 
                Materials newMagazine = new Magazine (title,id ,issueNbr,checkedOutPatron, checkedOut);
                
				libraryCollector[i]=  newMagazine;
				System.out.println("Magazine has been Added");
				
			}
		}
	}
	
	// remove magazine 
	
	
	public static void removeMagazine( Materials[] libraryCollector, String inputIssueNbr)
	{
		for ( int i = 0 ; i< libraryCollector.length; i++)
		{
			if (libraryCollector[i] != null)
			{
				if ((libraryCollector[i].getIssueNbr().equalsIgnoreCase("Issue number")))
				{
					libraryCollector[i]=null;
					System.out.println("Magazine has been deleted");
				}
			}
		}
	}
	

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
