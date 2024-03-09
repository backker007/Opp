package Lab7;

public class Pawn extends Figure {

    private boolean isFirstturn = true;

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

    }

    @Override
    void FreeMove(Board brd, int targetPositionRow, int targetPositionCol) {
        super.FreeMove(brd, targetPositionRow, targetPositionCol);
    }

    @Override
    void updateMovableList(Board board) {
        this.movableList.clear();
    
            if (this.isFirstturn == true) {
                if(this.iswhite == true) {
                    for (int i = 1; i <=  2; i++) {
                         if (((this.CurrentPositionRow -1) + i) < board.board.length) {
                            if (board.board[(this.CurrentPositionRow -1) + i ][this.CurrentPositionCol-1] != null && board.board[(this.CurrentPositionRow -1) + i ][this.CurrentPositionCol-1].iswhite != this.iswhite) {
                                String str = "[" + (this.CurrentPositionRow + i) + "," + this.CurrentPositionCol + "]";
                                this.movableList.add(str);                            
                            } 
                            if (board.board[(this.CurrentPositionRow -1) + i ][this.CurrentPositionCol-1] == null) {
                                String str = "[" + (this.CurrentPositionRow + i) + "," + this.CurrentPositionCol + "]";
                                this.movableList.add(str);                                    
                            }
                        }else{continue;}
                    }
                }else{
                    for (int i = 1; i <=  2; i++) {
                        if (((this.CurrentPositionRow -1)- i) >= 1) {
                            if (board.board[(this.CurrentPositionRow -1) - i ][this.CurrentPositionCol-1] != null && board.board[(this.CurrentPositionRow -1) - i ][this.CurrentPositionCol-1].iswhite != this.iswhite) {
                                String str = "[" + (this.CurrentPositionRow - i) + "," + this.CurrentPositionCol + "]";
                                this.movableList.add(str);                            
                            } else if (board.board[this.CurrentPositionRow -1 -i][this.CurrentPositionCol -1] == null) {
                                String str = "[" + (this.CurrentPositionRow - i) + "," + this.CurrentPositionCol + "]";
                                this.movableList.add(str);                                   
                            }    
                        }else{continue;}
                    }
                }
            }else{
                    System.out.println("is second turn");
                if (this.iswhite == true) {
                   
                }else{
                   
                }
            }
        }
    
}

