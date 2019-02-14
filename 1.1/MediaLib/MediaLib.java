
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    public static void main(){
        double totalCost = 0.0;
        double totalRating = 0.0;
        int numSongs = 0;
        double aveCost;
        double aveRating;
        int numBooks = 0;
        int numMovies = 0;
        int numPages = 0;
        int totalMinutes = 0;
        int avgMinutes = 0;
        int hours;
        int minutes;
   

        
        System.out.println("Welcome to your Media Library");
        Song song1 = new Song("Highway to Hell", .99, 8);
        numSongs = numSongs + 1;
        totalCost = totalCost + song1.price();
        totalRating = totalRating + song1.getRating();  
        
        Song song2 = new Song("Living After Midnight", .99, 10);
        numSongs = numSongs + 1;
        totalCost = totalCost + song2.price();
        totalRating = totalRating + song2.getRating(); 
        
        Song song3 = new Song("Slow Ride", 1.29, 7);
        numSongs = numSongs + 1;
        totalCost = totalCost + song3.price();
        totalRating = totalRating + song3.getRating();  
        
        Song song4 = new Song("Strutter", .99, 6);
        numSongs = numSongs + 1;
        totalCost = totalCost + song4.price();
        totalRating = totalRating + song4.getRating();  
        
        Song song5 = new Song("Love Gun", .99, 5);
        numSongs = numSongs + 1;
        totalCost = totalCost + song5.price();
        totalRating = totalRating + song5.getRating();  
        
        Song song6 = new Song("Thunderstruck", 1.29, 1);
        numSongs = numSongs + 1;
        totalCost = totalCost + song6.price();
        totalRating = totalRating + song6.getRating();  
        
        Song song7 = new Song("Cold Gin", .99, 4);
        numSongs = numSongs + 1;
        totalCost = totalCost + song7.price();
        totalRating = totalRating + song7.getRating();  
        
        aveCost = totalCost / numSongs;
        aveRating = totalRating / numSongs;
        
        System.out.println("Total number of song: " + numSongs);
        System.out.println("The total cost of the songs are: $" + totalCost);
        System.out.println("The average cost of your songs are: $" + aveCost);
        System.out.println("The average rating for your songs is: " + aveRating);
        
        Movie movie1 = new Movie("Die Hard", 106);
        numMovies = numMovies + 1;
        totalMinutes = totalMinutes + movie1.getDuration();
        
        Movie movie2 = new Movie("Die Hard 2", 120);
        numMovies = numMovies + 1;
        totalMinutes = totalMinutes + movie2.getDuration();
        
        Movie movie3 = new Movie("Die Hard With a Vengeance", 145);
        numMovies = numMovies + 1;
        totalMinutes = totalMinutes + movie3.getDuration();
        
        Movie movie4 = new Movie("Live Free or Die Hard", 95);
        numMovies = numMovies + 1;
        totalMinutes = totalMinutes + movie4.getDuration();
        
        Movie movie5 = new Movie("A Good Day to Die Hard", 86);
        numMovies = numMovies + 1;
        totalMinutes = totalMinutes + movie5.getDuration();
        
        avgMinutes = totalMinutes / numMovies;
        hours = avgMinutes / 60;
        minutes = avgMinutes % 60;
        
        System.out.println("The total number of movies is: "+ numMovies);
        System.out.println("The average duration of the movies is: " + hours + " hours and " + minutes + " minutes");
        
        
        
        
        
        Book book1 = new Book("Ready Player One", 195);
        numBooks = numBooks + 1;
        numPages = numPages + book1.getPages();
        
        Book book2 = new Book("The Hobbit", 456);
        numBooks = numBooks + 1;
        numPages = numPages + book2.getPages();
        
        Book book3 = new Book("Harry Potter", 326);
        numBooks = numBooks + 1;
        numPages = numPages + book3.getPages();
        
        System.out.println("The number of books selected is: " + numBooks + ".");
        System.out.println("The average number of pages are: " + numPages / 3 + ".");
        
        
        
        
        
        


        
       
    } 
}
