
public class threeDotArgu {

    public static void main(String[] args) {

        Add(5, 4, 5, 6, 6, 7, 7);
    }

//    one class can only have one three dot argument . 
//     So, we can't use three dot argument in this case.  We can use var
    public static void Add(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }

        System.err.println(sum);
    }

    // public static void Add(int x, int... args) {
    //     int sum = 0;
    //     for (int i = 0; i < args.length; i++) {
    //         sum += args[i];
    //     }
    //     System.out.println(sum);
    // }
}
