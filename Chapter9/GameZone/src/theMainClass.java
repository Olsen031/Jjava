import javax.swing.*;
import java.util.Random;

public class theMainClass {
    String[] [] playingBoard = {{"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}};
    String[] locations = {playingBoard[0] [0], playingBoard[0] [1],  playingBoard[0] [2], playingBoard[1] [0], playingBoard[1] [1], playingBoard[1] [2],
            playingBoard[2] [0],
            playingBoard[2] [1],
            playingBoard[2] [2]};
    int guess;
    int cpuGuess;
    String entry;

    public theMainClass(int guess){
        this.guess = guess;
    }

    public int getUserMove(){
        guess = guess - 1;
        while((locations[guess].equals("X")) && (locations[guess].equals("O"))) {
            entry = JOptionPane.showInputDialog(null, "Enter a different number 1-9");
            guess = Integer.parseInt(entry);
            guess = guess - 1;
        }

        locations[guess] = "X";

        return guess;

    }
    public void setUserMove(int g){
        guess = g;
    }
    public int getcpuMove(){
        Random rand = new Random();
        do {
            cpuGuess = rand.nextInt(8);
        }while(!(locations[cpuGuess].equals("X")) && !(locations[cpuGuess].equals("O")));

        locations[cpuGuess] = "O";
        return cpuGuess;
    }
    public void setCpuMove(int cpu){
        cpuGuess = cpu;
    }
}
