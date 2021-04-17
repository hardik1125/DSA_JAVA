import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }

    public static int getSum(int b, int n1, int n2) {

        int pow = 1;
        int ans = 0;
        int carry = 0;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            int digsum = dig1 + dig2 + carry;
            int digit = digsum % b;
            carry = digsum / b;
            ans = ans + (digit * pow);
            n1 = n1 / 10;
            n2 = n2 / 10;

            pow = pow * 10;

        }

        return ans;

    }

}