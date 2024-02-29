package Lab7;

public class Pawn extends Figure {

    public Pawn(String Name, boolean iswhite, int CurrentPositionRow, int CurrentPositionCol) {
        super(Name, iswhite, CurrentPositionRow, CurrentPositionCol);
        // TODO Auto-generated constructor stub
    }

    @Override
    void MoveFigure(Board brd, int targetRow, int targetCol) {

        String sum;
        sum = this.movableList.get(0);
        int IndexPositionsRow = Integer.valueOf(sum.substring(1, 2));
        int IndexPositionsCol = Integer.valueOf(sum.substring(3, 4));
        System.out.println(IndexPositionsRow + "" + IndexPositionsCol);
        System.out.println(targetRow + " " + targetCol);
        if ((IndexPositionsRow == targetRow) && (IndexPositionsCol == targetCol)) {
            if ((brd.board[targetRow - 1][targetCol - 1] != null)
                    && (this.iswhite == brd.board[targetRow - 1][targetCol - 1].iswhite)) {
                System.out.printf("The destination is being occupied by the same-side figure %s , Command abort!!!\n",
                        this.Name);
            } else if ((1 < targetRow) && (targetRow > 9)) {
                if ((targetCol < 1) && (targetRow > 9)) {
                    System.out.println("The speicified destination is out of range , Command abort!!! \n");
                }
            } else {
                brd.board[targetRow - 1][targetCol - 1] = this;
                brd.board[targetRow - 1][targetCol - 1].CurrentPositionRow = targetRow;
                brd.board[targetRow - 1][targetCol - 1].CurrentPositionCol = targetCol;
            }
        } else {
            System.out.println("Command : Move figure is not move !!!");
        }

    }

    @Override
    void FreeMove(Board brd, int targetPositionRow, int targetPositionCol) {
        super.FreeMove(brd, targetPositionRow, targetPositionCol);
    }

    @Override
    void updateMovableList(Board board) {

        this.movableList.clear();
        char sum[] = { '[', 'i', ',', 'j', ']' };
        if (this.Name.substring(0, 2).endsWith("Pa")) {
            if (this.iswhite == true) {
                if ((sum[1] < 9) && (sum[1] > 1)) {
                    sum[1] = ((char) (this.CurrentPositionRow + 49));
                    sum[3] = ((char) (this.CurrentPositionCol + 48));
                } else {
                    System.out.println("The speicified destination is out of range , Command abort!!! \n");
                }
            } else {
                if ((sum[1] > 1) && (sum[1] < 9)) {
                    sum[1] = ((char) (this.CurrentPositionRow + 47));
                    sum[3] = ((char) (this.CurrentPositionCol + 48));
                } else {
                    System.out.println("The speicified destination is out of range , Command abort!!! \n");
                }
            }

        } else {

        }
        String Str = String.valueOf(sum);
        this.movableList.add(Str);

    }

}
