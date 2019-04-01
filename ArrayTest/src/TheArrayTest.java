import java.util.Scanner;
import java.util.ArrayList;


public class TheArrayTest {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        ArrayList<Integer> scoresEntered = new ArrayList<Integer>();
        double total = 0;
        int counter = 0;

        System.out.println("Please enter the first test score(Enter 999 to quit data entry)>>> ");
        scoresEntered.add(keyboard.nextInt());

        for(int i = 0; scoresEntered.get(i) != 999; ++i) {
            System.out.println("Please enter the first test score(Enter 999 to quit data entry)>>> ");
            scoresEntered.add(keyboard.nextInt());
            total = total + scoresEntered.get(i);
            ++counter;
        }
        scoresEntered.remove(counter);
        display(counter, total, scoresEntered);

    }

    public static void display(int counter, double total, ArrayList scoresEntered){
        double average = total / counter;
        System.out.print("The entered scores are as follows: " + scoresEntered.get(0));
        for(int i = 1; i < scoresEntered.size(); ++i){
            System.out.print(", " + scoresEntered.get(i));
        }
        System.out.println(".");
        System.out.println("The sum of all the scores is: " + total + ", and the average is: " + average + "%.");
    }
}
