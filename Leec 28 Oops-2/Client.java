
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
        // System.out.println(obj1.d);
        // System.out.println(obj1.d1);
        System.out.println("-------------Case-3-End-------------------");

        System.out.println("-------------Case-4-End-------------------");
        C obj2 = new C();
        System.out.println(obj2.d);//1
        System.out.println(obj2.d1);//10
        System.out.println(obj2.name);//Chandra
        System.out.println(((P)(obj2)).d);//11

        obj2.fun();
        obj2.fun1();
        obj2.fun2();
        ((P)(obj2)).fun(); //jo method common he C and P me , C ke he call hoge Type Cast karne ke baad

        System.out.println("-------------Case-4-End-------------------");
    }
}
