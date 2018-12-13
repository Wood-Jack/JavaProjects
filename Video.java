public class Video extends Materials
{
	private String director;
	//private static int materialID;
	//private String title;
	
	//Constructor method
	 public  Video (String title, int id, String director, int checkedOutPatron, boolean checkedOut)
	 {
		 //super();
		 super(title, id, checkedOutPatron, checkedOut);
		 this.director = director;
	 }
	 
	 //default constructor
	 public Video ()
	 {
		 this.director= "no Director";
	 }
	 
	 // getters setters
	 
	 public String getDirector()
	 {
		 return director;
	 }
	 public void setDirector( String inputDirector)
	 {
		 this.director= inputDirector;
	 }
	 /* Video Competed */
 }
