import javax.swing.*;

public class theRealMainClass {
    public theRealMainClass(){}


    int index;

    public static void main(String[] args){

        String[] [] playingBoardInMain = {{"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}};


        boolean winningCondition = false;
        boolean tieGame = false;
        int personMove;
        int cpuMove;
        String entry;
        int guess;
        int realRow;
        int realColumn;
        int cpuRow;
        int cpuColumn;

        JOptionPane.showMessageDialog(null, "Welcome to Tic Tac Toe \n You will have X and the computer will have O");
        for(int i = 0; winningCondition == false || tieGame == false; ++i) {
            entry = JOptionPane.showInputDialog(null, "Please enter a number, 1-9\n" + playingBoardInMain[0] [0] + " " +
            playingBoardInMain[0] [1] + " " + playingBoardInMain[0] [2] + " \n" + playingBoardInMain[1] [0] + " " +
                    playingBoardInMain[1] [1] + " " + playingBoardInMain[1] [2] + " \n" + playingBoardInMain[2] [0] + " " +
                    playingBoardInMain[2] [1] + " " + playingBoardInMain[2] [2] + " \n");
            guess = Integer.parseInt(entry);
            theMainClass movei = new theMainClass(guess);
            personMove = movei.getUserMove();
            realRow = guess / 3;
            realColumn = guess % 3;
            playingBoardInMain[realRow] [realColumn] = "X";
            cpuMove = movei.getcpuMove();
            cpuRow = cpuMove / 3;
            cpuColumn = guess % 3;
            playingBoardInMain[cpuRow] [cpuColumn] = "O";

        }

    }
}
