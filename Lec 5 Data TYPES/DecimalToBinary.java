public class DecimalToBinary {
    public static void main(String[] args) {

        int sum = 0;
        int mul = 1;
        int num = 987;

        while (num > 0) {
            int rem = num % 2;
            sum = sum + rem * mul;
            num = num/ 2;
            mul=mul*10;
        }

        System.out.println(sum);
        System.out.println(1/2);
    }
}
