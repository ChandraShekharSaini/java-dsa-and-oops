
public class Student_Client {

    public static void main(String[] args) {

        Student sc1 = new Student();

        System.out.println(sc1.name);
        System.out.println(sc1.age);
        sc1.Into_Your_Selfe();

        System.out.println("------------------------------");

        Student sc2 = new Student();

        sc2.name = "John";
        sc2.age = 20;
        sc2.Into_Your_Selfe();

        sc2.sayHi("Kamlesh");

        sc2.SAYHI_TO_Mentor();
        //Static method accessed useing class name 
        Student.SAYHI_TO_Mentor();
    }

  static {
    System.out.println("Static block 2");
  }
  
    
}
