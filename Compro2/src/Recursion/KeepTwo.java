
package Recursion;

import java.util.Scanner;

public class KeepTwo {
    
    String keepTwo(String str) {
        if (str.length() == 1){
            return str;
        } 
        char lastC = str.charAt(str.length() - 1);
        String pre = str.substring(0, str.length()-1);
        
        int firstIndex = pre.indexOf(lastC);
        int lastIndex = pre.lastIndexOf(lastC);
        if (firstIndex == lastIndex){
            return keepTwo(pre) + lastC;
        }else {
            return keepTwo(pre);
        }
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
    }
}
/*
ABKGBAKFCABKKZG
*/