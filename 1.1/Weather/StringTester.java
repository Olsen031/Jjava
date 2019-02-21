
/**
 * Write a description of class StringTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import javax.swing.JOptionPane;
public class StringTester
{
    
 
    public static void main(){
        String result;
        String result2;
        int intResult;
        int counter = 0;
        while(counter < 4){
            result  = JOptionPane.showInputDialog(null, "Enter the current temperature");
            result2 = JOptionPane.showInputDialog(null, "Enter the current weather condition");
            intResult = Integer.parseInt(result);
            System.out.println(WeatherConditionals.getWeatherAdvice(intResult, result2));
            counter += 1;
        }
        
System.out.println(WeatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(101, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(12, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(72, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(27, "rain"));
        System.out.println(WeatherConditionals.getWeatherAdvice(-24, "windy"));
        
    
    }
    
  
    
  
}
