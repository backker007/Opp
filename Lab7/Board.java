package Lab7;

import javax.swing.plaf.TreeUI;

public class Board {
    Figure[][] board = new Figure[8][8];

    void boardInitiate() {
        board[0][0] = new Pawn("Pa1", true, 1, 1);
        board[0][1] = new Pawn("Pa2", true, 1, 2);
        board[7][1] = new Pawn("Pa2", false, 8, 2);
        board[0][2] = new Bishop("Bi1", true, 1, 3); 
        board[7][2] = new Bishop("Bi1", false, 8, 3); 
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
                    board[i][j] = null;                                          
                    found = true;
                    break s1;
                }
            }
        }
        if (found == false) {
            System.out.printf("There is no figure named as %s in the board!!! , Command abort \n\n", Name);
        }
    }

    void updateMovableList(Bishop bishop) {
            bishop.movableList.clear();
            boolean isCanmove = false;
            char sum[] = { '[', 'i', ',', 'j', ']' };
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if ((board[i][j] != null) && (board[i][j].iswhite == bishop.iswhite)) {
                        isCanmove = false;
                        continue;
                    } else {
                        int rowDiff = Math.abs(i - bishop.CurrentPositionRow);
                        int colDiff = Math.abs(j - bishop.CurrentPositionCol);
                        if    (rowDiff != colDiff) {
                            isCanmove = false;
                            continue;
                        }
                        int rowDir = (i - bishop.CurrentPositionRow) / rowDiff;
                        int colDir = (j - bishop.CurrentPositionCol) / colDiff;
                        int currRow = bishop.CurrentPositionRow + rowDir;
                        int currCol = bishop.CurrentPositionCol + colDir;
                        while ((currRow != i) || (currCol != j)) {
                            if (board[i][j] != null) {
                                isCanmove = false;
                                continue;
                            }
                            currRow += rowDir;
                            currCol += colDir;
                        }
                        isCanmove = true;
                        if (isCanmove == true) {
                            sum[1] = (char) (i + 48);
                            sum[3] = (char) (j + 48);
                            String Str = String.valueOf(sum);
                            bishop.movableList.add(Str);
                        }
                    }
                }
            }
        }

}
