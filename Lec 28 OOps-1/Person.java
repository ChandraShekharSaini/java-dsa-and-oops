
public class Person {

    String name = "Chandra";
    int age = 25;
    protected int roll = 90;
    private int marks = 80;
    boolean bnm;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void Data() {
        System.out.println("Name: " + name + "and" + age);
         
    }

    public void setMarks(int age) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

}
