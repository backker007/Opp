package Lab7;

import javax.swing.plaf.TreeUI;

public class Board {
    Figure[][] board = new Figure[8][8];

    void boardInitiate() {
        board[0][0] = new Pawn("Pa1", true, 1, 1);
        board[0][1] = new Pawn("Pa2", true, 1, 2);
        board[7][1] = new Pawn("Pa2", false, 8, 1);
        board[0][2] = new Bishop("Bi1", true, 1, 3);
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
            for (int j = 0; j < board[i].length; j++) {
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
        System.out.printf("Command : Move figure  %s  to Row %d Column %d \n", Name, targetRow, targetCol);
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
            System.out.printf("There is no figure named as %s in the board!!! , Command abort \n\n", name);
        }
    }

}
