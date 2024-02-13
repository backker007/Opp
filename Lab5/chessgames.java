package Lab5;
public class chessgames {
    public static void main(String[] args) {
        Board brd = new Board();
        //brd.Move();

         brd.Setstart();
         brd.Display();
         
         brd.Move("Pawn2" , 6);
        brd.Move("Pawn2" , 2);
        brd.Move("Pawn1" , 3);
        brd.Move("Pawn1" , 4);
        brd.Move("Pawn2" , 4);
        brd.Move("Pawn1" , 2);
        
        brd.Setstart();
        brd.Display();
    }
}
