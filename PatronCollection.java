
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
	
	public Patrons[] getPatronCollector()
	{
		return patronCollector;
	}
	public void setPatronCollector( Patrons [] inputPatronCollector)
	{
		this.patronCollector= inputPatronCollector;
	}
	/*need to do displayPatron(),findPatron(),addPatron(),removePatron().
	 * 
	 * 
	 * 
	 * **************** */
	 
	 System.out.println(  Arrays.toString(PatronCollection));
	
}
	
	
