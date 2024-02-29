package Lab7;

public class Chessgame {
   
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate();
        brd.Display();
        brd.FreeMove("Pa1",true,6,2);
        brd.Display();
        brd.MoveFigure("Pa1", true , 7, 2);
        brd.Display();
        brd.MoveFigure("Pa1", true , 8, 2);
        brd.Display();
        // brd.FreeMove("Pawn2",true,6,3);
        // brd.Display();
        // brd.FreeMove("Pawn2",true,6,2);
        // brd.Display();
        // brd.FreeMove("Pawn2", false, 6, 2);
        // brd.Display();
    }
    
}
