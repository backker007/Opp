package Lab6;

 public class Figure  {
    public Figure(String name, String bang, int lc1, int lc2) {
        Name = name;
        Bang = bang;
        Lc1 = lc1;
        Lc2 = lc2;
    }

    String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    String Bang;

    public String getBang() {
        return Bang;
    }

    // public void setBang(String bang) {
    // Bang = bang;
    // }

    int Lc1, Lc2;

    public int getLc1() {
        return Lc1;
    }

    // public void setLc1(int lc1) {
    // Lc1 = lc1;
    // }

    public int getLc2() {
        return Lc2;
    }

    // public void setLc2(int lc2) {
    // Lc2 = lc2;
    // }
   

    void FreeMove(Figure board) {
            
    }

}
