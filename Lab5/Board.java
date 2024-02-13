package Lab5;

public class Board {
    Figure[] board = new Figure[10];

    void Setstart() {
        System.out.print("\n\nSet A New Borad...");
        board[0] = new Pawn("Pawn1");
        board[1] = new Pawn("Pawn2");
        board[2] = new Pawn(" xxx ");
        board[3] = new Pawn(" xxx ");
        board[4] = new Figure(" xxx ");
        board[5] = new Figure(" xxx ");
        board[6] = new Figure(" xxx ");
        board[7] = new Figure(" xxx ");
        board[8] = new Figure(" xxx ");
        board[9] = new Figure(" xxx ");
    }

    int Searchname(String Name) {
        int i;
        for (i = 0; i < board.length; i++) {
            if (board[i].getName().equals(Name)) {
                break;
            }

        }
        return i;

    }

    void Move(String Name, int move) {

        String Sum;
        int index;
        index = Searchname(Name); // หาตำแหน่งตัวที่จะเดิน
        System.out.print("\nMove " +board[index].getName() + " Amount :  " + move + "  Position");
        if ((index + move) > board.length) {
            System.out.print("\nCan't Move It Because You Move Over Than Table... ");
        } else if (board[index + move].getName() == "  xxx  ") {

            Sum = board[index + move].getName();
            board[index + move].setName(board[index].getName());
            board[index].setName(Sum);
        }
        else{
            System.out.print("\nCan't Move It Because There Are Already Others..."); 
        }
        Display();

    }

    void Display() {
        System.out.println("\n---------------------------------------------------------------------------------------------------");
        System.out.print("    1         2         3         4         5         6         7         8         9        10");
        System.out.println(" ");
        for (int i = 0; i < board.length; i++) {
            
            System.out.print("| " + board[i].getName() + " | ");
        }
        System.out.println(" ");
        //System.out.println("\n-----------------------------------------------------------------------------------------------------");
    }

}
