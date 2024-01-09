package compro2teach;

import java.util.Scanner;

public class Howlongest {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scan.nextInt();
        }

        int maxlength = -1;
        for (int sonjai = 1; sonjai < n; sonjai++) {
            int length = 0;
            for (int i = sonjai; i <= n; i++) {
                if (arr[i] == 1) {
                    ++length;
                } else {
                    break;
                }
            }
            //System.out.print(length + " ");
            if (length > maxlength) {
                maxlength = length;
            }
        }
        System.out.println(maxlength);

        for (int sonjai = 1; sonjai < n; sonjai++) {
            int length = 0;
            for (int i = sonjai; i <= n; i++) {
                if (arr[i] == 1) {
                    ++length;
                } else {
                    break;
                }
            }

            if (length == maxlength) {
                System.out.print(sonjai + " ");
            }
        }
    }
}
