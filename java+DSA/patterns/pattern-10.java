import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int ispaces = -1;
        int ospaces = n / 2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= ospaces; j++) {

                System.out.print("	");

            }
            System.out.print("*	");

            for (int j = 1; j <= ispaces; j++) {

                System.out.print("	");
            }

            if (i > 1 && i < n) {
                System.out.print("*	");
            }

            if (i <= n / 2) {
                ospaces--;
                ispaces += 2;
            } else {
                ospaces++;
                ispaces -= 2;

            }

            System.out.println();
        }

    }
}