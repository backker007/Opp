package Lab5;

public class Board {
    Figure[] board = new Figure[10];

    void Setstart() {
        System.out.print("\n\nSet A New Borad...");
        board[0] = new Pawn("Pawn1");
        board[1] = new Pawn("Pawn2");
        board[2] = new Pawn(" xx ");
        board[3] = new Pawn(" xx ");
        board[4] = new Figure(" xx ");
        board[5] = new Figure(" xx ");
        board[6] = new Figure(" xx ");
        board[7] = new Figure(" xx ");
        board[8] = new Figure(" xx ");
        board[9] = new Figure(" xx ");
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
        if ((index + move) > board.length) {
            System.out.println("\n\nCan't Move it");
        } else {

            System.out.print("\nMove " +board[index].getName() + " Amount :  " + move + "  Position");
            Sum = board[index + move].getName();
            board[index + move].setName(board[index].getName());
            board[index].setName(Sum);
        }
        Display();

    }

    void Display() {
        System.out.println("\n-------------------------------------------------------------------------------------------");
        for (int i = 1 ; i <= board.length; i++){
            System.out.printf ("    %d    ",i);
        }
        System.out.println(" ");
        for (int i = 0; i < board.length; i++) {
            
            System.out.print("| " + board[i].getName() + " | ");
        }
        System.out.println(" ");
        //System.out.println("\n-----------------------------------------------------------------------------------------------------");
    }

}
