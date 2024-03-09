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
        boolean iscanmove = false;
        for (int i = 0; i < Intdexofcanmove.size(); i++) {
            String First = Intdexofcanmove.get(i);
            int row = Integer.parseInt(First.substring(1, 2));
            int col = Integer.parseInt(First.substring(3, 4));
            if (targetRow == row && targetCol == col) {
                iscanmove = true;
                break;
            } else {
                continue;
            }
        }
        if (iscanmove == true) {
            brd.board[targetRow - 1][targetCol - 1] = this;
            brd.board[CurrentPositionRow - 1][CurrentPositionCol - 1] = null;
            brd.board[targetRow - 1][targetCol - 1].CurrentPositionRow = targetRow;
            brd.board[targetRow - 1][targetCol - 1].CurrentPositionCol = targetCol;
        } else {
            System.out.println("Command : Can not move it!!!");
        }
    }

    @Override
    void updateMovableList(Board board) {
        BishopCanMove(this, board);
        this.movableList.clear();
        for (int i = 0; i < Intdexofcanmove.size(); i++) {
            String First = Intdexofcanmove.get(i);
            int row = Integer.parseInt(First.substring(1, 2));
            int col = Integer.parseInt(First.substring(3, 4));
            if (board.board[row - 1][col - 1] != null) {
                if (board.board[row - 1][col - 1].iswhite == this.iswhite) {
                    continue;
                }
            } else {
                this.movableList.add(First);
            }
        }

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
        j = this.CurrentPositionCol - 2;
        BL: while (i >= 0 && i < brd.board.length && j < brd.board.length && j >= 0) {
            if (brd.board[i][j] != null) {
                if (brd.board[i][j].iswhite == this.iswhite) {
                    String str = "[" + (i + 1) + "," + (j + 1) + "]";
                    this.Intdexofcanmove.add(str);
                }
                break BL;
            } else {
                i++;
                j--;
                String str = "[" + i + "," + (j + 2) + "]";
                this.Intdexofcanmove.add(str);
            }
        }
        i = this.CurrentPositionRow;
        j = this.CurrentPositionCol;
        TR: while (i > 1 && i < brd.board.length && j < brd.board.length && j > 1) {
            if (brd.board[i][j] != null) {
                break TR;
            }
            i--;
            j++;
            String str = "[" + i + "," + j + "]";
            this.Intdexofcanmove.add(str);
        }
        i = this.CurrentPositionRow - 2;
        j = this.CurrentPositionCol - 2;
        boolean istrue = true;
        TL: while (i > 0 && i < brd.board.length && j < brd.board.length && j > 0) {
            if (istrue) {
                String str = "[" + (i + 1) + "," + (j + 1) + "]";
                this.Intdexofcanmove.add(str);
                istrue = false;
            }
            if (brd.board[i][j] != null) {
                break TL;
            } else {
                String str = "[" + i + "," + j + "]";
                this.Intdexofcanmove.add(str);
            }
            i--;
            j--;
        }
    }
}
