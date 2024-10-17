
// Method overloading in Java is the ability to define multiple
//  methods in the same class with the same name and same return type but different 
//  parameter types, numbers, or both, allowing the methods to 
//  perform similar but slightly different tasks.
public class Student {

    public static void main(String[] args) {

        //method overloadig   //method overloadig
        System.out.println(Add(1, 3));
        System.out.println(Add(1, 3, 4));
        System.out.println(Add(1, 3, 9));

    }

    //method overloadig
    public static int Add(int a, int b) {
        return a + b;
    }

    //method overloadig
    public static int Add(int a, int b, int c) {
        return a + b + c;
    }

    //method overloadig
    public static int Add(int a, int b, int c, int name) {
        return a + b + name;
    }

}
