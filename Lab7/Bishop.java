package Lab7;


import java.util.ArrayList;

public class Bishop extends Figure {

    ArrayList<String> Intdexofcanmove = new ArrayList<>() ;
    

    public Bishop(String Name, boolean iswhite, int CurrentPositionRow, int CurrentPositionCol) {
        super(Name, iswhite, CurrentPositionRow, CurrentPositionCol);
        //TODO Auto-generated constructor stub
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
        BishopCanMove(this);
        this.movableList.clear();
        for (int i = 0; i < Intdexofcanmove.size(); i++) {
            String First = Intdexofcanmove.get(i);
            int row = Integer.parseInt(First.substring(1, 2));
            int col = Integer.parseInt(First.substring(3, 4));
            if ((row < 1 || row < board.board.length) && (col < 1 || col < board.board.length)) {
                if ((board.board[row][col] != null) && (board.board[row][col].iswhite == this.iswhite)) {
                    continue;
                } else if ((this.CurrentPositionRow != row) && (this.CurrentPositionCol != col)) {
                    this.movableList.add(First);
                }
            }
        }
    }

    void BishopCanMove(Bishop bishop) {
        Intdexofcanmove.clear();
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                boolean iscollect = false;
                int rowDiff = Math.abs(i - this.CurrentPositionRow );
                int colDiff = Math.abs(j - this.CurrentPositionCol );
                if (rowDiff == colDiff) {
                    iscollect = true;
                }
                if (iscollect == true) {
                    String position = "[" + Integer.toString(i) + "," + Integer.toString(j) + "]";
                    this.Intdexofcanmove.add(position);
                }
            }
        }
    }
}
