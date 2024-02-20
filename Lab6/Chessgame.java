package Lab6;

public class Chessgame {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Board brd = new Board ();
        brd.SetBoard();
        brd.display();
        brd.FreeMove("Pawn1" , "W",5,3);
        brd.FreeMove("Pawn1" , "W",1,4);
        brd.FreeMove("Pawn1" , "W",3,1);
        brd.FreeMove("Pawn1" , "B",4,1);
        brd.FreeMove("Pawn1" , "W",4,1);
        brd.FreeMove("Pawn2" , "W",4,1);
    }
    
}
