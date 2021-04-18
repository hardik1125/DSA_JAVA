import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }

    public static int getValueIndecimal(int n, int b) {
        int sum = 0;
        int power = 0;
        while (n != 0) {
            int dig = n % 10;

            sum += (dig * (int) Math.pow(b, power));
            n = n / 10;
            power++;

        }
        return sum;
    }
}