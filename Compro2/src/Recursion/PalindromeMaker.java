
package Recursion;

import java.util.Scanner;

public class PalindromeMaker {
    
    String makePalindrome(String str) {
        int len = str.length();
        if (len <= 1){
            return str;
        }
        if (str.charAt(0) == str.charAt(len-1)){
            return str.charAt(0) + makePalindrome(str.substring(1,len-1)) + str.charAt(len-1);
        }else {
            return makePalindrome(str.substring(1,len-1));
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        PalindromeMaker maker = new PalindromeMaker();
        String result = maker.makePalindrome(text);
        System.out.println(result);
    }
}
