
package Recursion;

import java.util.Scanner;

public class GoInside {
    
    String goInside(String str, boolean front) {
        // You can enter your code here, and only here.
        int n = str.length();
        if (n == 1){
            return str;
        }
        if (n == 2 && front == true){
            return str;
        }
        if (n == 2 && front == false){
            return str.charAt(n-1) + "" + str.charAt(0);
        }
        if (front){
            return str.charAt(0) + "" + str.charAt(n-1) + "" + goInside(str.substring(1, n-1), false);
        }else {
            return str.charAt(n-1) + "" + str.charAt(0) + "" + goInside(str.substring(1, n-1), true);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}
