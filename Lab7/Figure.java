package Lab7;

import java.util.ArrayList;

public class Figure {
    private String Name = "";
    private int CurrentPositionRow = 0;
    private int CurrentPositionColum = 0;
    private boolean iswhite = true;
    ArrayList<String> movableList = new ArrayList<String>();
    public Figure(String name, int currentPositionRow, int currentPositionColum, boolean iswhite) {
        Name = name;
        CurrentPositionRow = currentPositionRow;
        CurrentPositionColum = currentPositionColum;
        this.iswhite = iswhite;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public int getCurrentPositionRow() {
        return CurrentPositionRow;
    }
    public void setCurrentPositionRow(int currentPositionRow) {
        CurrentPositionRow = currentPositionRow;
    }
    public int getCurrentPositionColum() {
        return CurrentPositionColum;
    }
    public void setCurrentPositionColum(int currentPositionColum) {
        CurrentPositionColum = currentPositionColum;
    }
    public boolean getIswhite() {
        return iswhite;
    }
    public void setIswhite(boolean iswhite) {
        this.iswhite = iswhite;
    }
  
    void Freemove () {}

    void Move (){}

   
}
