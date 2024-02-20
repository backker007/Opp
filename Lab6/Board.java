/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6;

/**
 *
 * @author Anuphong_PC
 */
public class Board {

    private int L1, L2;
    Figure[][] board = new Figure[8][8];

    void SetBoard() {
        System.out.print("\n\nSet A New Borad...");
        board[0][0] = new Pawn("Pawn1", "W", 1, 2);
        board[0][1] = new Pawn("Pawn2", "W", 1, 2);
        board[7][0] = new Pawn("Pawn1", "B", 1, 2);
        board[7][1] = new Pawn("Pawn2", "B", 1, 2);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == null) {
                    board[i][j] = new Pawn("  x  ", "z", i, j);
                } else {
                    continue;
                }
            }
        }
    }

    void display() {
        System.out.print("\n       1         2         3         4         5         6         7         8       \n");
        System.out.print("----------------------------------------------------------------------------------\n");
        // System.out.println(" ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < board[1].length; j++) {
                if (board[i][j].getBang() == "z") {
                    System.out.print("| " + board[i][j].getName() + "  | ");
                } else {
                    System.out.print("| " + board[i][j].getName() + board[i][j].getBang() + " | ");
                }
            }
            System.out.println(" ");
            // System.out.println("\n-----------------------------------------------------------------------------------------------------");
        }

    }

    void FreeMove(String Name, String Bang, int Lc11, int Lc22) {
        System.out.printf("\n\nFreeMove %s%s To Row %d ; Col %d", Name, Bang, Lc11, Lc22);
        int Lc1, Lc2;
        Lc1 = Lc11 - 1;
        Lc2 = Lc22 - 1;

        String Sum;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((board[i][j].getBang().equals(Bang)) && (board[i][j].getName().equals(Name))) {
                    this.L1 = i;
                    this.L2 = j;
                    break;
                }
            }
        }

        if ((Lc1 > board.length) && (Lc2 > board.length)) {
            System.out.print("\nCan't Move It Because You Move Over Than Table... ");
        } else if (board[Lc1][Lc2].getName().equals("  x  ")) {
            Sum = board[Lc1][Lc2].getName();
            board[Lc1][Lc2].setBang(Bang);
            board[Lc1][Lc2].setName(board[L1][L2].getName());
            board[L1][L2].setName(Sum);
            board[L1][L2].setBang("z");
        } else if (board[L1][L2].getBang() != board[Lc1][Lc2].getBang()) {
            System.out.print("\nEating !!! " + board[L1][L2].getName() + board[L1][L2].getBang() + " Eat "
                    + board[Lc1][Lc2].getName() + board[Lc1][Lc2].getBang());
            board[Lc1][Lc2].setName("  x  ");
            board[Lc1][Lc2].setBang("z");

        } else {
            System.out.print("\nI can't walk because I'm on the same side.");
        }

        display();

    }

    // void CheckEating(int L1, int L2, int Lc1, int Lc2) {

    //     if (board[L1][L2].getBang() != board[Lc1][Lc2].getBang()) {
    //         System.out.print("\nEating !!! " + board[L1][L2].getName() + board[L1][L2].getBang() + " Eat "
    //                 + board[Lc1][Lc2].getName() + board[Lc1][Lc2].getBang());
    //         board[Lc1][Lc2].setName("  x  ");
    //         board[Lc1][Lc2].setBang("z");

    //     } else {
    //         System.out.print("\nI can't walk because I'm on the same side.");
    //     }

    // }

}
