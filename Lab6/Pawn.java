/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Anuphong_PC
 */
public class Pawn extends Figure{

    @Override
    public int getLc2() {
        return super.getLc2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getLc1() {
        return super.getLc1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getBang() {
        return super.getBang(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLc2(int lc2) {
        super.setLc2(lc2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLc1(int lc1) {
        super.setLc1(lc1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String Name) {
        super.setName(Name); //To change body of generated methods, choose Tools | Templates.
    }

    public Pawn(String Name, String Bang, int lc1, int lc2) {
        super(Name, Bang, lc1, lc2);
    } 
}
