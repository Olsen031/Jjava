
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;
               
        if(description.indexOf("windy") >= 0){
        windy = true;
        }
        
        if(temperature > 100 && description.indexOf("snow") >= 0){
            return "Fake news";
        }
        
        if(temperature > -54 && temperature < 0)
        { 
            return "You are sadly in Iowa";
        }
        if(!windy && (temperature > 30)){
            return("It's safe to go outside: " + temperature + " degrees and " + description + ".");
        }
        else
        return "To windy or cold! Enjoy some apex!";

    }
    
}
