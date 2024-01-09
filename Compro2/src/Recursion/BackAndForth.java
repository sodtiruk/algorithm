package Recursion;
import java.util.Scanner;

public class BackAndForth {

    String reorder(String s, boolean forward) {
        int len = s.length();
        
        if (len == 1){
            return s;
        }
        if (forward == true){
            char check = s.charAt(0);
            if (check == 'A'){
                return check + reorder(s.substring(1), false);
            }
            return check + reorder(s.substring(1), true);
        }else {
            char check = s.charAt(len-1);
            if (check == 'A'){
                return check + reorder(s.substring(0, len-1), true);
            }
            return check + reorder(s.substring(0, len-1), false);
            
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        BackAndForth baf = new BackAndForth();
        String answer = baf.reorder(s, true);
        System.out.print(answer);
    }
}
