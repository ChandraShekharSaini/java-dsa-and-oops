class C extends P {

    int d = 1;
    int d1 = 10;
    String name = "Chandra";

    public void fun() {
        System.out.println("I am fun of Pjj");

    }

    @Override
    public int override() {
        System.out.println("I am fun of C");
        System.out.println("This method is Override");
        System.out.println("Inheritance is must to override any method");
        System.out.println("Name , return type always same of overide method");
        System.out.println("Implementation may be different");
        return 1;

    }

    public void fun1() {
        System.out.println("I am fun1 of C");
    }
}
