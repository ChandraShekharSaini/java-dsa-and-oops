public class Abstract_Client {
    public static void main(String[] args) {

        //You canot make Object of Abstract Class bec in
        // abstract  class there is abstract method(no implementation) 
        //that why you canot make  object of abstract class
        // Abstract_Demo sc = new Abstract_Demo();

      //if there no written code for  abstract method then it is 
       //impossible to use it by making object of abstract method
        // sc.Abstract_Method()
       
       Payment_Method sc = new Payment_Method();

        sc.Abstract_Method();

        sc.Cart();

        sc.NewMethod();

    }
}
