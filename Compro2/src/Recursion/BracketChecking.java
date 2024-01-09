
package Recursion;

import java.util.Scanner;

public class BracketChecking {
    
    public static boolean CheckBracket(String s){       
        int first = s.indexOf("{");
        int last = s.lastIndexOf("}");
        if (first > last){
            int bank = first;
            first = last;
            last = bank;
        }
        if (first == -1 && last == -1){
            return true;
        }
        if (first == -1 || last == -1){
            return false;
        }
        String s1 = s.substring(0, first);
        String s2 = s.substring(first+1, last);
        String s3 = s.substring(last+1);
        String sum = s1+s2+s3;
        //System.out.println(sum);
        if (sum.indexOf("{") >= 0 || sum.lastIndexOf("}") >= 0){
            return CheckBracket(sum);
        }else {
            return true;
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(CheckBracket(str));
    }
}
