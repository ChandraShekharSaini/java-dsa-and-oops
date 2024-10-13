
public class PersonClient {

    public static void main(String[] args) {

        Person sc = new Person(12, "Ramu");

        System.out.println(sc.name);
        System.out.println(sc.age);
       System.out.println(sc.roll);

      // System.out.println(sc.marks); // It will give error
 
      //Setter
      sc.setMarks(890);

       //Getter
      System.out.println(sc.getMarks());

    }
}
