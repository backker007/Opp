package Lab7;

import java.util.ArrayList;

public class Figure {
    
    String Name = "";
    boolean iswhite = true;
    int CurrentPositionRow = 0;
    int CurrentPositionCol = 0;
    ArrayList<String> movableList = new ArrayList();

    public Figure(String Name, boolean iswhite, int CurrentPositionRow, int CurrentPositionCol) {
        this.Name = Name;
        this.iswhite = iswhite;
        this.CurrentPositionRow = CurrentPositionRow;
        this.CurrentPositionCol = CurrentPositionCol;
        ArrayList<String> MovableList = new ArrayList<String>();
    }

    String getiswhite(boolean iswhite) {
        String B = "B";
        String W = "W";
        if (iswhite == true) {
            return W;
        } else {
            return B;
        }

    }

    void FreeMove(Board brd, int targetPositionRow, int targetPositionCol) {
        if ((targetPositionRow < 1) || (targetPositionRow > brd.board.length)) {
            if ((targetPositionCol < 1) || (targetPositionRow > brd.board.length)) {
                System.out.println("The speicified destination is out of range , Command abort!!! \n");

            }

        } else if ((brd.board[targetPositionRow - 1][targetPositionCol - 1] != null) && (brd.board[targetPositionRow - 1][targetPositionCol - 1].iswhite == this.iswhite)) {
            System.out.printf("The destination is being occupied by the same-side figure %s , Command abort!!!\n", this.Name);
        } else {
            brd.board[CurrentPositionRow - 1][CurrentPositionCol - 1] = null;
            brd.board[targetPositionRow - 1][targetPositionCol - 1] = this;
            brd.board[targetPositionRow - 1][targetPositionCol - 1].CurrentPositionRow = targetPositionRow;
            brd.board[targetPositionRow - 1][targetPositionCol - 1].CurrentPositionCol = targetPositionCol;

        }

    }

    void updateMovableList(Board board) {

        this.movableList.clear();
        char sum[] = {'[', 'i', ',', 'j', ']'};
        for (int i = 0; i < board.board.length; i++) {
            for (int j = 0; j < board.board[i].length; j++) {
                if ((board.board[i][j] == null) || (board.board[i][j].iswhite != this.iswhite)) {
                    sum[1] = (char) (i + 49);
                    sum[3] = (char) (j + 49);
                    String Str = String.valueOf(sum);
                    this.movableList.add(Str);
                }
            }

        }
    }

    void MoveFigure(Board board, Class brd , int targetRow , int targetCol) {
    }

   
}
