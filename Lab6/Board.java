/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Anuphong_PC
 */
public class Board {

    Figure[][] board = new Figure[8][8];
    private int L1 ,L2;

    
    
    void SetBoard() {
        System.out.print("\n\nSet A New Borad...");
        board[0][0] = new Pawn("Pawn1", "W", 1, 2);
        board[0][1] = new Pawn("Pawn2", "W", 1, 2);
        board[7][0] = new Pawn("Pawn1", "B", 1, 2);
        board[7][1] = new Pawn("Pawn2", "B", 1, 2);

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
               if (board[i][j] == null){
                   board[i][j] = new Pawn("  x  ", "z", i, j);
               } else {
                   continue ;
                }
            }
        }
    }

    void display() {
        System.out.print("\n       1         2         3         4         5         6         7         8       \n");
        System.out.print("----------------------------------------------------------------------------------\n");
        //System.out.println(" ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + 1 + "  ");
            for (int j = 0; j < board[1].length; j++) {
                System.out.print("| " + board[i][j].getName() + " | ");
            }
            System.out.println(" ");
            //System.out.println("\n-----------------------------------------------------------------------------------------------------");
        }

    }

    void FreeMove(String Name, String Bang ,int Lc1, int Lc2) {
        String Sum;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((board[i][j].Bang.equals(Bang)) && (board[i][j].Name.equals(Name))) {
                  this.L1 = i;
                  this.L2 = j;
                    break;
                }
            }
        }
  
         
      if (((L1 + Lc1) > board.length) && ((L2 + Lc2) > board.length)) {
            System.out.print("\nCan't Move It Because You Move Over Than Table... ");
        } else if ("  x  " == board[L1 + Lc1][L2 + Lc2].getName()) {

            Sum = board[L1 + Lc1][L2 + Lc2].getName();    
            System.out.print(Sum);
            board[L1 + Lc1][L2 + Lc2].setName(board[L1][L2].getName());    
            board[L1+Lc1][L2+Lc2].setName(Sum);
        }
        else{
            System.out.print("\nCan't Move It Because There Are Already Others..."); 
        } 
      
      display(); 
    
    }

}
