package Lab7;

import java.util.*;

public class Pawn extends Figure {

    private boolean isFirstturn = true;
    Scanner inputStr = new Scanner(System.in);
    boolean iscannewfigure = false;
    int boardrow, boardcol;
    String ChangeFigure;
    String Newname;

    public Pawn(String Name, boolean iswhite, int CurrentPositionRow, int CurrentPositionCol) {
        super(Name, iswhite, CurrentPositionRow, CurrentPositionCol);
        // TODO Auto-generated constructor stub
    }

    @Override
    void MoveFigure(Board brd, int targetRow, int targetCol) {
        boolean iscanmove = false;
        for (int i = 0; i < this.movableList.size(); i++) {
            String First = this.movableList.get(i);
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
            this.isFirstturn = false;
        } else {
            System.out.println("Command : Can not move it!!!");
        }
        if (brd.board[targetRow - 1][targetCol - 1].iswhite == true) {
            if (targetRow == 8) {
                ChangeFigure(brd);
                brd.board[targetRow-1][targetCol-1] = null;
            }
        } else {
            if (targetRow == 1) {
                ChangeFigure(brd);
                brd.board[targetRow-1][targetCol-1] = null;
            }
        }
    }

    void ChangeFigure(Board brd) {
         S1 : do {
        System.out.println("Change Pawn To Queen Rook Bishop Knight");
        this.ChangeFigure = inputStr.nextLine();
        System.out.println(this.ChangeFigure);
        if (ChangeFigure.equals("Queen")) {
            System.out.println("Nummer of Queen : Do not repeat existing ones.");
            this.Newname = inputStr.nextLine();
            generateinfotmation(brd);
            brd.board[boardrow - 1][boardcol - 1] = new Figure(this.ChangeFigure.substring(0, 2) + this.Newname,
                    this.iswhite, boardrow, boardcol);
            break S1;
        } else if (ChangeFigure.equals("Rook")) {
            System.out.println("Nummer of Rook : Do not repeat existing ones.");
            this.Newname = inputStr.nextLine();
            generateinfotmation(brd);
            brd.board[boardrow - 1][boardcol - 1] = new Figure(this.ChangeFigure.substring(0, 2) + this.Newname,
            this.iswhite, boardrow,
            boardcol);
            break S1;
        } else if (ChangeFigure.equals("Bishop")) {
            System.out.println("Nummer of Bishop : Do not repeat existing ones.");
            this.Newname = inputStr.nextLine();
            generateinfotmation(brd);
            brd.board[boardrow - 1][boardcol - 1] = new Bishop(this.ChangeFigure.substring(0, 2) + this.Newname,
            this.iswhite, boardrow,
            boardcol);
            break S1;
        } else if (ChangeFigure.equals("Knight")) {
            System.out.println("Nummer of Knight : Do not repeat existing ones.");
            this.Newname = inputStr.nextLine();
            generateinfotmation(brd);
            brd.board[boardrow - 1][boardcol - 1] = new Figure(this.ChangeFigure.substring(0, 2) + this.Newname,
            this.iswhite, boardrow,
            boardcol);
            break S1;
        } else {
            System.out.println("Please print only in accordance with such information.>>");
        }

    }while(true);
}



    void generateinfotmation(Board brd) {
        do {
            System.out.println("Input Location in board Row : Colume");
            System.out.println("Row");
            this.boardrow = inputStr.nextInt();
            System.out.println("Colume");
            this.boardcol = inputStr.nextInt();
            if ((boardrow >= 1 && boardrow <= 8) && (boardcol >= 1 && boardcol <= 8)) {
                if (brd.board[this.boardrow - 1][this.boardcol - 1] == null) {
                    this.iscannewfigure = true;
                }
            } else {
                System.out.println("Please select a vacant board position...");
            }
        } while (this.iscannewfigure == false);

    }

    @Override
    void FreeMove(Board brd, int targetPositionRow, int targetPositionCol) {
        isFirstturn = false;
        if (this.iswhite == true) {
            if (targetPositionRow == 8) {
                ChangeFigure(brd);
            }
        } else {
            if (targetPositionRow == 1) {
                ChangeFigure(brd);
            }
        }
        super.FreeMove(brd, targetPositionRow, targetPositionCol);
    }

    @Override
    void updateMovableList(Board board) {
        this.movableList.clear();

        if (this.isFirstturn == true) {
            if (this.iswhite == true) {
                for (int i = 1; i <= 2; i++) {
                    if (((this.CurrentPositionRow - 1) + i) < board.board.length) {
                        if (board.board[(this.CurrentPositionRow - 1) + i][this.CurrentPositionCol - 1] != null
                                && board.board[(this.CurrentPositionRow - 1) + i][this.CurrentPositionCol
                                        - 1].iswhite != this.iswhite) {
                            String str = "[" + (this.CurrentPositionRow + i) + "," + this.CurrentPositionCol + "]";
                            this.movableList.add(str);
                        }
                        if (board.board[(this.CurrentPositionRow - 1) + i][this.CurrentPositionCol - 1] == null) {
                            String str = "[" + (this.CurrentPositionRow + i) + "," + this.CurrentPositionCol + "]";
                            this.movableList.add(str);
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                for (int i = 1; i <= 2; i++) {
                    if (((this.CurrentPositionRow - 1) - i) >= 1) {
                        if (board.board[(this.CurrentPositionRow - 1) - i][this.CurrentPositionCol - 1] != null
                                && board.board[(this.CurrentPositionRow - 1) - i][this.CurrentPositionCol
                                        - 1].iswhite != this.iswhite) {
                            String str = "[" + (this.CurrentPositionRow - i) + "," + this.CurrentPositionCol + "]";
                            this.movableList.add(str);
                        } else if (board.board[this.CurrentPositionRow - 1 - i][this.CurrentPositionCol - 1] == null) {
                            String str = "[" + (this.CurrentPositionRow - i) + "," + this.CurrentPositionCol + "]";
                            this.movableList.add(str);
                        }
                    } else {
                        continue;
                    }
                }
            }
        } else {
            if (this.iswhite == true) {
                if (((this.CurrentPositionRow - 1) + 1) < board.board.length) {
                    if (board.board[(this.CurrentPositionRow - 1) + 1][this.CurrentPositionCol - 1] == null) {
                        String str = "[" + (this.CurrentPositionRow + 1) + "," + this.CurrentPositionCol + "]";
                        this.movableList.add(str);
                    } else if (board.board[(this.CurrentPositionRow - 1) + 1][this.CurrentPositionCol - 1] != null
                            && (board.board[(this.CurrentPositionRow - 1) + 1][this.CurrentPositionCol
                                    - 1].iswhite != this.iswhite)) {
                        String str = "[" + (this.CurrentPositionRow + 1) + "," + this.CurrentPositionCol + "]";
                        this.movableList.add(str);
                    }
                }
            } else {
                if (((this.CurrentPositionRow - 1) - 1) >= 1) {
                    if (board.board[(this.CurrentPositionRow - 1) - 1][this.CurrentPositionCol] == null) {
                        String str = "[" + (this.CurrentPositionRow - 1) + "," + this.CurrentPositionCol + "]";
                        this.movableList.add(str);
                    } else if (board.board[(this.CurrentPositionRow - 1) + 1][this.CurrentPositionCol - 1] != null
                            && (board.board[(this.CurrentPositionRow - 1) + 1][this.CurrentPositionCol
                                    - 1].iswhite != this.iswhite)) {
                        String str = "[" + (this.CurrentPositionRow - 1) + "," + this.CurrentPositionCol + "]";
                        this.movableList.add(str);
                    }
                }
            }
        }
    }
}
