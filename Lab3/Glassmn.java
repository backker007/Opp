
package Lab3;

public class Glassmn {
   
   public static void main(String[] args) {
   Glass g1 =  new Glass(1,500,200);
   Glass g2 =  new Glass(2,500,0);
   // test 1 add a water
   g1.Fillwater(120); // 1.1 :set volume 120 ml. add glass
   g1.Fillwaterall(); // 1.2 :add full glass
   System.out.println("\n");
   // test 2 pour a water
   // 2.1 pour on the floor
   g1.Pourwawteronthefloor(200); // 2.1.1 :pour water 200 ml. on the floor
   g1.Pourallonthefloor(); // 2.1.2 :pour water all glass on the floor
   System.out.println("\n");
   // 2.2 pour to another glass
   g1.Fillwaterall();
   g1.Pouranotherglass(g2, 300); // 2.2.1 pour water in glass 1 to glass 2 volume 300 ml.
   g1.Pourallontherglassall(g2); // 2.2.2 pour water in glass 1 to glass 2 all
   
}
}