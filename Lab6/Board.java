package Lab6;

public class Board {
    static Figure[][] board = new Figure[8][8];

     void SetBoard () {
        System.out.print("\n\nSet A New Borad...");
        board[0][0] = new Pawn("Pawn1", "B", 0, 0);
        board[0][1] = new Pawn("Pawn2", "B", 0, 1);
        board[0][2] = new Pawn("Pawn3", "B", 0, 2);
        board[0][3] = new Pawn("Pawn4", "B", 0, 3);

        board[0][0] = new Pawn("Pawn1", "W", 0, 0);
        board[0][2] = new Pawn("Pawn2", "W", 0, 1);

    }

    void FreeMove() {
        board[0][0].FreeMove(board[0][1]);
        
    }

}
