
public class Interface_Client implements DSA {

    //In this extended class until and unless you will
    //write abstract methods implementation ,
    //it will give error
    @Override
    public void push() {

    }

    //fun method DynamicStack and Stack Class me be he ,
    //per jo fun interface_Client me lika gaya he vo hi iimplement ho ga
    @Override
    public void fun() {

    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public static void main(String[] args) {
        //create object of extened class
        Interface_Client obj = new Interface_Client();

    }

}
