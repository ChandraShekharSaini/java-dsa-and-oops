
public interface StackI {

    public void Push(int iteam);

    public void Pop();

    public int Pull();

    public int Peek();

    //In Java 8 , Agar method static he tab method ko body de sakte he interface me
    static void Method() {
        System.out.println("");
    }

    //In Java 8 , Agar method default he tab method ko body de sakte he interface me
    default void Method1() {
        System.out.println("Method1");
    }

    //In Java 9 , gar method private he tab method ko body de sakte he interface me
    private void Method3() {
        System.out.println("Method3");
    }

    //initialise karna he padega variable ko ,by default zero or null value nahi hote allocate
    // int x; //will give error 
    String name = "Stack";
    public static final int num = 90;

}
