package Lab4;

public class Mynabird {
    String Name, G;
    String Gender; // [M]ale , [F]emale
    String SonName;

    public void setName(String name) {
        this.Name = name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public void setGender(String gender) {
        G = gender.substring(0, 1).toUpperCase();
        if ((G.equals("F")) || (G.equals("M"))) {
            this.Gender = G + gender.substring(1);
        } else {
            System.out.println("Gender There is Male and Female Only");
        }
    }

    public String getName() {
        System.out.println("Name : " + Name);
        return Name;
    }

    public String getGender() {
        System.out.println("Gender : " + Gender);
        return Gender;
    }

    void Breed(Mynabird anotherBird, child son) throws InterruptedException {
        System.out.printf("==================================================\n");
        System.out.println(Name + " & " + anotherBird.Name);

        if ((!G.equals(anotherBird.G)) && (!G.equals(null)) && (!anotherBird.G.equals(null))) {
            System.out.println("Breeding is going to start soon.");
            for (int i = 5; i  >= 0; i--) {
                System.out.printf("Breeding  is coming to an end in %d \n", i);
                Thread.sleep(500);
            }
            System.out.println("Breeding Is Complete...\n");
            SonName = Name.substring(0, 1) + anotherBird.Name.substring(0, 1);
            son.setName(SonName);
            int r = (int) (Math.random() * 100) + 1;
            r = r % 2;
            if (r == 0) {
                son.setGender("Male");
            } else {
                son.setGender("Female");
            }
            System.out.println("Name The child & Gender"); // echo name child
            son.getName();
            son.getGender();
        } else {
            System.out.println("Can not breeding because be of the same gerder !!!");
        }

    }

}
