public  class StackClient implements StackI {
    @Override
    public void Push(int iteam) {
    }

    @Override
    public void Pop() {

    }

    @Override
    public int Pull() {
        return 0;
    }
   
   // StackI.num  = 50; value updation not possible
    @Override       
    public int Peek() {
        return 0;
    }

    //You can make your own Method also
    public void NewMethod() {

    }

    public static void main(String[] args) {
        StackClient stackClient = new StackClient();
        System.out.println(StackI.name);
        System.out.println(StackI.num);
    }
}
