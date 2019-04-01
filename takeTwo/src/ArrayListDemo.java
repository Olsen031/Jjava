import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList.indexOf;

public class ArrayListDemo{

    public static void main(String[] args){
          ArrayList<String> names = new ArrayList<String>();
          Scanner keyboard = new Scanner(System.in);
          int remove;

          for(int h = 0; h < 5; ++h){
              System.out.println("Enter a name of a person here >>> ");
              names.add(keyboard.next());
          }
          System.out.println("Please enter one last name here >>> ");
          names.add(keyboard.next());

          System.out.println("Please enter what name you wish to delete >>> ");
          remove = keyboard.nextInt();
          names.remove(remove);
//        names.add("Bobby");
//        names.add("Todd");
//        names.add("Jeff");
//        names.add(0, "Sam");
//        names.remove(3);
          display(names);
    }

    public static void display(ArrayList<String> names){

        System.out.println("The size of the list is " + names.size());
        for(int i = 0; i < names.size(); ++i){
            System.out.println("Position: " + i + " Name: " + names.get(i));
        }
    }
}
