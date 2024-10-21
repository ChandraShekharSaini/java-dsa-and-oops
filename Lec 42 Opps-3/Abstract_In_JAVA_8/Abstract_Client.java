
public class Abstract_Client {

    public static void main(String[] args) {

        Payment_Method sc = new Payment_Method();

        sc.Abstract_Method();

        sc.Cart();

        sc.NewMethod();

        //In Java 8 you can make object of Abstract Class
        //In Java 8 you can make object of Abstract Class

        //Anonymous Way  //Anonymous   Way    //Anonymous   Way    //Anonymous  Way   //Anonymous   Way

        Abstract_Demo sc1 = new Abstract_Demo() {
            @Override
            public int Abstract_Method() {

                return 0;
            }

            @Override
            public void Cart() {

            }
        };

    }
}
