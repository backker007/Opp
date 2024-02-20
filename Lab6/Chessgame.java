package Lab6;

public class Chessgame {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Board brd = new Board ();
        brd.SetBoard();
        brd.display();
        brd.FreeMove("Pawn1" , "W",2,3);
        
    }
    
}
