package Lab7;

public class Board {
    Figure[][] board = new Figure[8][8];

    void boardInitiate() {
        board[1][0] = new Pawn("Pa1", true, 2, 1);
        board[1][1] = new Pawn("Pa2", true, 2, 2);
        board[1][4] = new Pawn("Pa3", true, 2, 5);
        board[1][5] = new Pawn("Pa4", true, 2, 6);
        board[1][6] = new Pawn("Pa5", true, 2, 7);
        board[0][2] = new Bishop("Bi1", true, 1, 3);
        board[6][0] = new Pawn("Pa1", false, 7, 1);
        board[6][1] = new Pawn("Pa2", false, 7, 2);
        board[6][2] = new Pawn("Pa3", false, 7, 3);
        board[6][3] = new Pawn("Pa4", false, 7, 4);
        board[6][4] = new Pawn("Pa5", false, 7, 5);
        board[7][5] = new Bishop("Bi1", false, 8, 6);
    }


    void Display() {
        System.out.print("\n       1         2         3         4         5         6         7         8       \n");
        System.out.print("-----------------------------------------------------------------------------------\n");
        // System.out.println(" ");
        for (int i = 0; i < board.length; i++) {
            System.out.printf("%d  ", i + 1);
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != null) {
                    System.out.print("|  " + board[i][j].getiswhite(board[i][j].iswhite) + board[i][j].Name + "  |");
                } else {
                    System.out.print("|   xx   |");
                }
            }
            System.out.printf(" %d  \n", i + 1);
        }
        System.out.println("-----------------------------------------------------------------------------------");
        System.out.print("       1         2         3         4         5         6         7         8       \n\n");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != null) {
                    board[i][j].updateMovableList(this);
                    System.out.println("Next turn, Figure " + board[i][j].getiswhite(board[i][j].iswhite)
                            + board[i][j].Name + "  can move to these positions : " + board[i][j].movableList);
                    System.out.println("");
                }
            }
        }
    }

    void FreeMove(String name, boolean iswhite, int targetPositionRow, int targetPositionCol) {
        System.out.printf("Command : FreeMove figure  %s  to Row %d Column %d \n", name, targetPositionRow,
                targetPositionCol);
        boolean found = false;
        s1: for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    continue;
                } else if ((board[i][j].Name == name) && (board[i][j].iswhite == iswhite)) {
                    board[i][j].FreeMove(this, targetPositionRow, targetPositionCol);
                    found = true;
                    break s1;
                }

            }
        }
        if (found == false) {
            System.out.printf("There is no figure named as %s in the board!!! , Command abort \n\n", name);
        }
    }

    void MoveFigure(String Name, boolean iswhite, int targetRow, int targetCol) {

        String x;
        if (iswhite == true )
        {
             x =  "W";
        }else{
             x = "B";
        }
        System.out.printf("Command : Move figure  %s%s  to Row %d Column %d \n",x,Name, targetRow, targetCol);
        boolean found = false;
        s1: for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    continue;
                } else if ((board[i][j].Name == Name) && (board[i][j].iswhite == iswhite)) {
                    board[i][j].MoveFigure(this, targetRow, targetCol);                                            
                    found = true;
                    break s1;
                }

            }
        }
        if (found == false) {
            System.out.printf("There is no figure named as %s in the board!!! , Command abort \n\n", Name);
        }
    }

}
