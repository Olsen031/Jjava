
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = ""; 
   
    }
   
    public String getTitle(){
      return title;   
    }
    public void setTitle(String t){
        title = t;
    }
    
    public static void main(){
        Song song1 = new Song();
        System.out.println(song1);
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        Movie movie1 = new Movie();
        System.out.println(movie1);
        Book book1 = new Book();
        System.out.println(book1);
       
    }
    
    
    
   

    
    
}
