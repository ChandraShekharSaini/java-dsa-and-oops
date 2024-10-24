
public class BinaryT0Decimal {

    public static void main(String[] args) {

        int num = 1010;
        int mul = 1;
        int sum = 0;

        while (num > 0) {
            int rem = num%10;
             sum = sum + rem * mul;
            mul = mul * 2;
            num /= 10;
        }
       System.out.println(sum);
    }
}
