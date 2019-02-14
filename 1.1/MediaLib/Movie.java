
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    private int rating;
    private String title;
    private int duration;
    private int hours;
    private int minutes;

   
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = ""; 
    
    }
    
    public Movie(String title, int duration){
     this.title = title;
     this.duration = duration;
    }
   
    public int getHours(){
    return hours;}
    public void setHours(int h){
    hours = duration / 60;
    hours = h; }
    public int getMinutes(){
        return minutes;}
    public void setMinutes(int m){
         minutes = duration % 60;
         minutes = m;}
    public String getTitle(){
      return title;   
    }
    public void setTitle(String t){
     title = "t";   
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int r){
        rating = r;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int length){
        duration = length;
    }
}
