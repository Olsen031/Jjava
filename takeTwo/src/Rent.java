import javax.swing.*;
public class Rent {

    public static void main(String[] args){
        int [] [] rent = {{400, 450, 510, 550},
                            {500, 560, 630, 700},
                            {625, 676, 740, 950},
                            {1000, 1250, 1600, 1800},
                            {1200, 1350, 1725, 2000},
                            {1400, 1825, 2125, 2400},
                            {1800, 2200, 3230, 3500}};

        String entry;
        int floor;
        int bedrooms;

        entry = JOptionPane.showInputDialog(null, "Enter a floor number ");
        floor = Integer.parseInt(entry);
        entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms ");
        bedrooms = Integer.parseInt(entry);

        if(floor > 7 || bedrooms > 3) {
            JOptionPane.showMessageDialog(null, "No such offer exists, your application has been terminated. Have a nice day");
        }
        else{
            JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms + " bedroom apartment floor " + floor +
                    " is $" + rent[floor][bedrooms]);
        }

    }
}
