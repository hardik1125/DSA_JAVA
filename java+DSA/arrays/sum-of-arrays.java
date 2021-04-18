import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            a1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scn.nextInt();
        }

        int sizeOfSum = n1 >= n2 ? n1 + 1 : n2 + 1;
        int[] sum = new int[sizeOfSum];
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = sum.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int digit = carry;
            if (i >= 0) {
                digit += a1[i];
            }
            if (j >= 0) {
                digit += a2[j];
            }
            carry = digit / 10;
            digit = digit % 10;
            sum[k] = digit;
            i--;
            j--;
            k--;
        }

        int idx = 0;
        for (int p = 0; p < sum.length; p++) {
            if (sum[p] != 0) {
                idx = p;
                break;
            }
        }

        for (int p = idx; p < sum.length; p++) {
            System.out.println(sum[p]);
        }

    }

}
