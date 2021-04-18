import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int tofind = scn.nextInt();
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == tofind) {
                idx = i;
                break;
            }
        }
        System.out.print(idx);
    }

}