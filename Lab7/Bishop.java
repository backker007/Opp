package Lab7;

import java.util.ArrayList;

public class Bishop extends Figure {

    ArrayList<String> Intdexofcanmove = new ArrayList<>();

    public Bishop(String Name, boolean iswhite, int CurrentPositionRow, int CurrentPositionCol) {
        super(Name, iswhite, CurrentPositionRow, CurrentPositionCol);
        // TODO Auto-generated constructor stub
    }

    @Override
    void FreeMove(Board brd, int targetPositionRow, int targetPositionCol) {
        // TODO Auto-generated method stub
        super.FreeMove(brd, targetPositionRow, targetPositionCol);
    }

    @Override
    void MoveFigure(Board brd, int targetRow, int targetCol) {

    }

    @Override
    void updateMovableList(Board board) {
        BishopCanMove(this, board);
        this.movableList.clear();

    }

    void BishopCanMove(Bishop bishop, Board brd) {
        Intdexofcanmove.clear();
        // boolean TR = true; // บนขวา
        // boolean TL = true; // บนขวา
        // boolean BR = true; // ล่างขวา
        // boolean BL = true; // ล่างซ้าย
        int i = this.CurrentPositionRow;
        int j = this.CurrentPositionCol;
        BR: while ((i < brd.board.length) && (j < brd.board.length)) {
            if (brd.board[i][j] != null) {
                String str = "[" + (i + 1) + "," + (j + 1) + "]";
                this.Intdexofcanmove.add(str);
                break BR;
            }
            {
                String str = "[" + (i + 1) + "," + (j + 1) + "]";
                this.Intdexofcanmove.add(str);
                i++;
                j++;
            }

        }
        i = this.CurrentPositionRow;
        j = this.CurrentPositionCol;
        BL: while (i > 0 && i < brd.board.length && j < brd.board.length && j > 1) {
            if (brd.board[i][j] != null) {
                if (brd.board[i][j].iswhite != this.iswhite) {
                    String str = "[" + (i + 1) + "," + (j + 1) + "]";
                    this.Intdexofcanmove.add(str);
                } else {
                    break BL;
                }
            } else {
                i++;
                j--;
                String str = "[" + i + "," + j + "]";
                this.Intdexofcanmove.add(str);
            }
        }
        i = this.CurrentPositionRow;
        j = this.CurrentPositionCol;

        System.out.println(i);
        System.out.println(j);
        TR: while (i > 1 && i < brd.board.length && j < brd.board.length && j > 1) {
            if (brd.board[i][j] != null) {
                break TR;
            }
            i++;
            j--;
            String str = "[" + i + "," + j + "]";
            this.Intdexofcanmove.add(str);
        }
        i = this.CurrentPositionRow;
        j = this.CurrentPositionCol;
        // TL: while (i > 1 && j > 1) {
        //     if (brd.board[i][j] != null) {
        //         break TL;
        //     } else {
        //         i--;
        //         j--;
        //         System.out.println(i);
        //         System.out.println(j);
        //         String str = "[" + i + "," + j + "]";
        //         this.Intdexofcanmove.add(str);
        //     }
        // }

        System.out.println(Intdexofcanmove);
    }
}
