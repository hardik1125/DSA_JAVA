import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int spaces = 0;
        int stars = n;

        for (int i = 1; i <= n; i++) {

            // for spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print("	");
            }
            // for stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*	");
            }
            spaces++;
            stars--;
            System.out.println();
        }

    }
}