package Stringlearn;

import java.util.Scanner;

public class FavorName {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String day1 = scan.next(); //DAY 1
        int P = scan.nextInt();
        char[] posChar1 = new char[P];
        for (int i = 0; i < P; ++i) {
            posChar1[i] = scan.next().charAt(0);
        }

        int N = scan.nextInt();
        char[] negChar1 = new char[N];
        for (int i = 0; i < N; ++i) {
            negChar1[i] = scan.next().charAt(0);
        }
        
        String day2 = scan.next(); //DAY 2
        int P1 = scan.nextInt();
        char[] posChar2 = new char[P1];
        for (int i = 0; i < P1; ++i) {
            posChar2[i] = scan.next().charAt(0);
        }

        int N1 = scan.nextInt();
        char[] negChar2 = new char[N1];
        for (int i = 0; i < N1; ++i) {
            negChar2[i] = scan.next().charAt(0);
        }
        
        
    }
}
