
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
   
    private int rating;
    private String title;
    private double price;
    private boolean favorite;
   
    public Song()
    {
         rating = 0;
         title = ""; 
         price = 0.0;
    }
   
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double p){
         price = p;
    }
    
    public String getTitle(){
      return title;   
    }
    public void setTitle(String t){
        title = t;
    }
    public void addToFavorites(){
        favorite = true;
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
