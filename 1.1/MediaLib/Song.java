
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
    private static int numSongs = 0;
 

    public Song(){
     title = "";
     price = 0.0;
     rating = 0;
    }
    
     public Song(String title, double price){
         this.title = title;
         this.price = price;
        }
   
    public Song(String title, double price, int rating) {
    this.title = title;
    this.price = price;
    this.rating = rating;
    numSongs = numSongs + 1;
   
    
}

    public double price(){
    return price;}
    public void setPrice(double p){
    price = p;}
        
    public int getRating(){
        return rating;
    }
    public void setRating(int r){
        rating = r;
    }
      public String getTitle() {
          return title;
        }

      public void setTitle(String t) {
          title = t;
        }
  
  public int getNumSongsInLibrary(){
     return numSongs; 
    }
   
   
    public void addToFavorites(){
        favorite = true;
    }
    
   
    
}
