
public class Client {

    public static void main(String[] args) {

        System.out.println("-------------Case-1-Start-------------------");
        P sc = new P();
        System.out.println(sc.d);
        System.out.println(sc.d2);
        sc.fun();
        sc.fun2();
        System.out.println("-------------Case1-End--------------------");

        System.out.println("-------------Case-2-Start-------------------");
        P obj = new C();
        System.out.println("-------Parent class ke variable ko hi access kar sakte he");
        System.out.println(obj.d);
        System.out.println(obj.d2);
        System.out.println(((C) (obj)).d);
        System.out.println(((C) (obj)).d1);
        System.out.println(((C) (obj)).name);

        obj.fun2();
        ((C) (obj)).fun1();  // C class ke unique method ko call karna hai

        obj.fun();
        System.out.println("-------------Case-2-End-------------------");

        System.out.println("-------------Case-3-Start(Not Allowed In Java)-------------------");
        // C obj1 = new P();
        System.out.println(obj1.d);
        System.out.println(obj1.d1);
        System.out.println("-------------Case-3-End-------------------");
    }
}
