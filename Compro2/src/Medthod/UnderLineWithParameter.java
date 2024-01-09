
package Medthod;

import java.util.Scanner;

public class UnderLineWithParameter {
    static void line(String str, int num){
        System.out.println(str);
        for(int i=0; i<num; i++){
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String str = scan.next();
            int num = scan.nextInt();
            line(str, num);
        }
    }
}
