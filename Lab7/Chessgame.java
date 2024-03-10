package Lab7;

public class Chessgame {
   
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate();
        brd.Display();
        brd.FreeMove("Bi1", false, 4, 3);
        brd.Display();
        brd.FreeMove("Bi1",false,5,7);
        brd.Display();
        brd.FreeMove("Pa1", true, 2, 5);
        brd.Display();
        brd.MoveFigure("Bi1", false, 7, 5);
        brd.Display();
        brd.FreeMove("Pa1", true, 3, 1);
        brd.Display();
        brd.MoveFigure("Pa1", true, 4, 1);
        brd.Display();
        brd.MoveFigure("Pa1", true, 5, 1);
        brd.Display();
        brd.MoveFigure("Pa1", true, 6, 1);
        brd.Display();
        brd.MoveFigure("Pa1", true, 7, 1);
        brd.Display();
        brd.MoveFigure("Pa1", true, 8, 1);
        brd.Display();
       
    }
    
}
