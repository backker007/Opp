package Lab7;

public class Pawn extends Figure {


   

    public Pawn(String Name, boolean iswhite, int CurrentPositionRow, int CurrentPositionCol) {
        super(Name, iswhite, CurrentPositionRow, CurrentPositionCol);
        //TODO Auto-generated constructor stub
    }



    @Override
    void MoveFigure(Board board,int targetRow, int targetCol) {
       
        
            String sum ; 
            sum = this.movableList.get(0);
            System.out.println(sum);
            System.out.println(sum);
            System.out.println(sum);
            System.out.println(sum);
            System.out.println(sum);
            System.out.println(sum);
          
            // if(){
                
            // }else if (this.iswhite == false){
            
            // }
            // }else{
            // System.out.println("Command : Move figure is not move !!!");
            // }
    
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
