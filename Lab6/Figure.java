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
 abstract public  class Figure {
    String Name;
    String Bang;
    int lc1,lc2;

    public Figure(String Name, String Bang, int lc1, int lc2) {
        this.Name = Name;
        this.Bang = Bang;
        this.lc1 = lc1;
        this.lc2 = lc2;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setLc1(int lc1) {
        this.lc1 = lc1;
    }

    public void setLc2(int lc2) {
        this.lc2 = lc2;
    }

    public String getName() {
        return Name;
    }

    public String getBang() {
        return Bang;
    }

    public int getLc1() {
        return lc1;
    }

    public int getLc2() {
        return lc2;
    }
         
}
