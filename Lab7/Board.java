package Lab7;

import javax.swing.plaf.TreeUI;

public class Board {
    Figure board[][] = new Figure[8][8];

    void boardInitiate() {
        board[0][0] = new Figure("A", 0, 0, true);
        board[7][0] = new Figure("B", 7, 0, true);

    }

    void display() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j].getName() != null) {
                    if ((board[i][j].getIswhite() == true) || (board[i][j].getIswhite() == false)) {
                        System.out.print("| " + board[i][j].getName() + "  | ");
                    }
                } else {
                    System.out.print("|  xx  |");
                }
            }
        }
    }

}
