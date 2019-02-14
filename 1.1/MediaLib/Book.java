
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
   
    private int rating;
    private String title;
    private int pages;
    

    public Book()
    {
        // initialise instance variables
        rating = 0;
        title = ""; 
   
    }
    public Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }
    
   
    public String getTitle(){
      return title;   
    }
    public void setTitle(String t){
        title = "t";
    }
    public int getPages(){
    return pages;}
    public void setPages(int p){
    pages = p;}
        
}
