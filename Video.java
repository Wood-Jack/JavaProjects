public class Video extends Materials
{
	private String director;
	//private static int materialID;
	//private String title;
	
	//Constructor method
	 public  Video (String title, int id, String director)
	 {
		 //super();
		 super(title, id);
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
 }
