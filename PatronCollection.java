





public class PatronCollection
{
	private int collectionMaxSize;
	private Patrons[] patronCollector;
	public static final int INITIAL_SIZE = 10;
	
	
	
	//constructor method 
	public PatronCollection ( int collectionMaxSize, Patrons[] patronCollector )
	{
		this.collectionMaxSize= collectionMaxSize;
		this.patronCollector = patronCollector;
	}
	
	// Default constructor 
	public PatronCollection()
	{
		this.collectionMaxSize= INITIAL_SIZE;
		this.patronCollector= new Patrons[INITIAL_SIZE];
		
	}
	
	//getters /setters
	
	public int getCollectionMaxSize()
	{
		return collectionMaxSize;
	}
	public void setCollectionMaxSize(int inputCollectionMaxSize)
	{
		this.collectionMaxSize= inputCollectionMaxSize;
	}
	
	public Patrons [] getPatronCollector()
	{
		return patronCollector;
	}
	public void setPatronCollector( Patrons [] inputPatronCollector)
	{
		this.patronCollector= inputPatronCollector;
	}
	
	// display all patrons
	
	public static void displayPatrons(Patrons[] patronCollector)
	{
		for( int i = 0 ; i < patronCollector.length; i++)
		{
			if ( patronCollector[i] != null)
			{
				System.out.println( "  " + patronCollector[i]);
			}
		}
	}
	
	// find patron
	public static void findPatrons(Patrons[] patronCollector, String inputName)
	{
		for( int i = 0 ; i < patronCollector.length; i++)
		{
			if ( patronCollector[i] != null)
			{
				if ( patronCollector[i].getName().equalsIgnoreCase(inputName))
				{
					System.out.println( "   " + patronCollector[i]);
				}
			}
		}
	}
	
	// add patron 
	
	public static void addPatrons( Patrons[] patronCollector, String inputName, int inputPatronID)
	{
		for ( int i = 0 ; i< patronCollector.length; i++)
		{
			if (patronCollector[i] != null)
			{

                Patrons newPatron = new Patrons( inputPatronID, inputName);
                
				patronCollector[i]=  newPatron;
				System.out.println("Patron has been added");
				
			}
		}
	}
	
	
	
	
	
	// removed patron
	public static void removePatrons( Patrons[] patronCollector, String inputName)
	{
		for ( int i = 0 ; i< patronCollector.length; i++)
		{
			if (patronCollector[i] != null)
			{
				if (patronCollector[i].getName().equalsIgnoreCase(inputName))
				{
					patronCollector[i]=null;
					System.out.println("Patron has been deleted");
				}
			}
		}
	}
	 
	 /* PatronCollection Completed */
	
	
}
	
	
