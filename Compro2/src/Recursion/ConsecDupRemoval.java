
package Recursion;

import java.util.Scanner;

public class ConsecDupRemoval {
    String dupRemove(String str) {
        int length = str.length();
        if (length == 1){
            return str;
        }
        if (str.charAt(0) == str.charAt(1)){
            return dupRemove(str.substring(1, length));
        }else {
            return str.charAt(0) + dupRemove(str.substring(1, length));
        }
    }

 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = (new ConsecDupRemoval()).dupRemove(str);
        System.out.print(result);
    }
}
