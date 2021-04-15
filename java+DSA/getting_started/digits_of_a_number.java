import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int temp = n;
        int digits = 0;

        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }
        int div = (int) Math.pow(10, digits - 1);

        while (div != 0) {
            int dig = n / div;
            System.out.println(dig);
            n = n % div;
            div = div / 10;

        }
    }
}