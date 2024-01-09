package Recursion;

import java.util.Scanner;

public class ShrinkAndExpand {

    String shrinkAndExpand(String s) {
        // You can enter your code here, and only here.
        int len = s.length();
        if (len == 1){
            return s+s;
        }
        if (len == 0){
            return "";
        }
        String cut = s.substring(1);
        if (cut.charAt(0) == s.charAt(0)){
            return "" + cut.charAt(0) + shrinkAndExpand(s.substring(2));
        }else {
            return "" + s.charAt(0) + s.charAt(0) + shrinkAndExpand(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        ShrinkAndExpand sae = new ShrinkAndExpand();
        String answer = sae.shrinkAndExpand(s);
        System.out.print(answer);
    }
}
