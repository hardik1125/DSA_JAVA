import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }

    public static int getDifference(int b, int n1, int n2) {
        int ans = 0;
        int pow = 1;
        int carry = 0;
        while (n2 != 0) {
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            int digit = dig2 - dig1 + carry;
            if (digit < 0) {
                digit += b;
                carry = -1;
            } else {
                carry = 0;
            }
            n2 = n2 / 10;
            n1 = n1 / 10;
            ans = ans + (digit * pow);
            pow = pow * 10;
        }
        return ans;
    }

}