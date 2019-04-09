public class setArrayCheckerboard {

    public static void main(String[] args){
        String[][] checkerBoard = new String[8][8];

        for (int i = 0; i < checkerBoard.length; i++) {
            int oddRow = i % 2;
            for (int j = 0; j < checkerBoard[0].length; j++) {
                int oddColumn = j % 2;
                if(oddRow == 0 && oddColumn == 0){
                    checkerBoard[i][j] = "WS";
                }
                else if(oddRow == 0 && oddColumn == 1){
                    checkerBoard[i][j] = "BS";

                    if(i == 0 && oddColumn == 1){
                        checkerBoard[i][j] = "BC";
                    }
                    if(i == 6 && oddColumn == 1){
                        checkerBoard[i][j] = "RC";
                    }
                }
                else if(oddRow == 1 && oddColumn == 0){
                    checkerBoard[i][j] = "BS";
                    if((i == 1 && oddColumn == 0)){
                        checkerBoard[i][j] = "BC";
                    }
                    if((i == 7 && oddColumn == 0)){
                        checkerBoard[i][j] = "RC";
                    }
                }
                else
                    checkerBoard[i][j] = "WS";
                System.out.print(checkerBoard[i][j] + " ");
            }

            System.out.println();
        }

    }
}
