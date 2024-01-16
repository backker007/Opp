package Lab3;

public class Glass {
    public static final String g2 = null;
    private int water, name, volume;

    public Glass(int Nameglass, int Volume, int Water) {
        this.name = Nameglass;
        if (Volume <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than 0 only.");
        }
        this.volume = Volume;
        if (Water < 0 || water > Volume) {
            throw new IllegalArgumentException("Water can't be negative or greater than capacity.");
        }
        this.water = Water;

        System.out.printf("This is a glass %d ;Have volume : %d ml. ;have a water : %d ml.\n", name, volume, water);
    }

    public void status() {
        System.out.printf("This is a glass %d ;Have a water : %d ml.\n", name, water);
    }

    int Fillwaterall() {
        System.err.printf("Add a water full glass %d\n",name);
        water = volume;
        status();
        return water;
    }

    int Fillwater(int Water) {
        System.out.printf("Add a water : %d ml. ; In glass %d\n", Water, name);
        if ((water + Water) >= volume) {
            System.out.printf("Add a Water more than volume!!!\n");
            water = volume;
        } else {
            water += Water;
        }
        status();
        return water;
    }

    int Pourallonthefloor (){
        System.out.printf("Pour water all in glass %d\n",name);
        water = 0;
        status();
        return water;
    }
    int Pourwawteronthefloor(int Water){
        System.out.printf("Pour water %d ml. in glass %d\n",Water,name);
        if(Water > water){
            System.out.printf("Pour water more than available!! ");
            water = 0;
        }
        else{
            water -= Water;
        }
        status();
        return water;
    }
    

   
    int Pouranotherglass(Glass anotherGlass,int Water) {
        System.out.printf("Pour water glass %d to glass %d\n",name,anotherGlass.name);
        Pourwawteronthefloor(Water);
        anotherGlass.Fillwater(Water);
        return water;
    }

    int Pourallontherglassall(Glass anotherGlass){
        System.out.printf("Pour water glass %d all to glass %d\n",name,anotherGlass.name);
        anotherGlass.Fillwater(water);
        Pourallonthefloor();
        return water;
    }

	


}
