import java.util.Scanner;
import java.util.Arrays;
public class MeanMedian {

    public static void main(String[] args){
        int[] list = new int[5];
        double total = 0;
        double average;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter five numbers below: ");
        for(int i = 0; i < list.length; i++){
            list[i] = keyboard.nextInt();
            total = list[i] + total;
        }

        average = total / 5;

        System.out.println("The average of the five numbers entered is: " + average);
        orderedArray(list);

    }

    public static void orderedArray(int[] list){
        Arrays.sort(list);
        int median = list[2];
        System.out.println("The median of the five numbers entered is: " + median);
    }

}
