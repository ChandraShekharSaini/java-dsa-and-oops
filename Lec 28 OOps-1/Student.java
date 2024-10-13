
public class Student {

    //Class ka Data Members
    String name;
    int age;

    public void Into_Your_Selfe() {
        //Method ka local variable
        int roll;

        System.out.println("My  name is  " + name + " and I am " + age + " years old");

    }

    public void sayHi(String name) {
        System.out.println(this.name + "Say Hi To" + name);

    }

    public static void SAYHI_TO_Mentor() {

        System.out.println("Hello Mentor Chandra Shekhar");

       
    }

    static {
        System.out.println("Hello Mentor Chandra Shekhar");
    }

}
