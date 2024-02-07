package Lab4;

public class Breeding {

  public static void main(String[] args) throws InterruptedException {
    Mynabird F = new Mynabird();
    F.setName("David"); // Set name father
    F.setGender("Male"); // Set gender fater
    Mynabird M = new Mynabird();
    M.setName("Maria"); // Set name mother
    M.setGender("Female"); // Set gernder mother
    child C1 = new child(); // child1
    M.getName();
    M.getGender();
    F.getName();
    F.getGender();
    F.Breed(M, C1); // breeing [F]ather and [M]other [C1]child 1
    
    child C2 = new child(); // child2;
    C1.Breed(F, C2); // breedind [C1]child and [F]ather
   
    child C3 = new child();
    C1.Breed(C2, C3); // breeding [C1]child1 and [C2]child2 [C3]child3
   

    System.out.println("\n\nJava Program End...");

  }

}
