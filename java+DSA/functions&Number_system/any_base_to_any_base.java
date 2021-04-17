import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();

        int deciValue = anyBaseToDecimal(n, sourceBase);
        int finalValue = decimalToAnyBase(deciValue, destBase);
        System.out.print(finalValue);

    }

    public static int anyBaseToDecimal(int a, int b1) {
        int pow = 1;
        int ans = 0;
        while (a != 0) {
            int dig = a % 10;
            ans = ans + (dig * pow);
            a = a / 10;
            pow = pow * b1;
        }

        return ans;
    }

    public static int decimalToAnyBase(int a, int b2) {
        int pow = 1;
        int ans = 0;
        while (a != 0) {
            int dig = a % b2;
            ans = ans + (dig * pow);
            a = a / b2;
            pow = pow * 10;
        }
        return ans;
    }

}