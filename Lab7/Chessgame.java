package Lab7;

public class Chessgame {
   
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate();
        brd.Display();
        brd.FreeMove("Bi1",false,5,7);
        brd.Display();
      
    }
    
}
