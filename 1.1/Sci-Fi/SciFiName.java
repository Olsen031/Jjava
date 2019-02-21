
/**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    import java.util.Random;
public class SciFiName
{
    
    public static void main()
    {
        String sciFiFirstName = "";
        String sciFiLastName = "";
        String sciFiOrigin = "";
        double lengthRelative1;
        double lenghtRelative2;
       
        
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        // generate a sciFi name
        
        sciFiFirstName = firstName.substring(0,3) + lastName.substring(0,2);
        sciFiLastName = city.substring(0,2) + school.substring(0,3);
        lengthRelative1 = relativeName1.length() - 1;
        lenghtRelative2 = relativeName2.length() - 1;
        double random1 = Math.random() * lengthRelative1;
        double random2 = Math.random() * lenghtRelative2;
        long rounded1 = Math.round(random1);
        long rounded2 = Math.round(random2);
        int f = (int) rounded1;
        int l = (int) rounded2;
        sciFiOrigin = relativeName1.substring(f,relativeName1.length()) + 
        relativeName2.substring(l, relativeName2.length());
        
        System.out.println("Hello " + sciFiFirstName + " " + sciFiLastName + " of " + sciFiOrigin + 
        ". Welcome!");
        
        
        
        
        
        
        
        
   
        
    }
}
