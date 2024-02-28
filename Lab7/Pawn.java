package Lab7;

public class Pawn {
   
    public void Pawn(String Name, boolean iswhite, int CurrentPositionRow, int CurrentPositionCol) {
        
    }

    @Override
    void MoveFigure(Board board, Board boardtarget ,int targetRow , int targetCol) {
      if((targetRow == 1)|| (targetCol == 1)){
          
      if(this.iswhite != ){
          
      }else if (this.iswhite == false){
      
      }
      }else{
      System.out.println("Command : Move figure is not move !!!");
      }
    }

    @Override
    void FreeMove(Board brd, int targetPositionRow, int targetPositionCol) {
        super.FreeMove(brd, targetPositionRow, targetPositionCol); // To change body of generated methods, choose Tools
                                                                   // | Templates.
    }

    @Override
    void updateMovableList(Board board) {

        this.movableList.clear();
        char sum[] = { '[', 'i', ',', 'j', ']' };
        if (this.Name.substring(0, 2).endsWith("Pa")) {
            if (this.iswhite == true) {
                sum[1] = ((char) (this.CurrentPositionRow + 49));
                sum[3] = ((char) (this.CurrentPositionCol + 48));

            } else {
                sum[1] = ((char) (this.CurrentPositionRow + 47));
                sum[3] = ((char) (this.CurrentPositionCol + 48));
            }

        } else {

        }
        String Str = String.valueOf(sum);
        this.movableList.add(Str);

    }

}
