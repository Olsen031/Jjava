public class checkerboard {

    public static void main(String[] args){
        String[][] checkerBoard = new String[8][8];

        for (int i = 0; i < checkerBoard.length; i++) {
            int oddRow = i % 2;
            for (int j = 0; j < checkerBoard[0].length; j++) {
                int oddColumn = j % 2;
                if(oddRow == 0 && oddColumn == 0){
                    System.out.print("W");
                }
                else if(oddRow == 0 && oddColumn == 1){
                    System.out.print("B");
                }
                else if(oddRow == 1 && oddColumn == 0){
                    System.out.print("B");
                }
                else
                    System.out.print("W");
                System.out.print(" ");
            }

            System.out.println();
        }


    }
}
