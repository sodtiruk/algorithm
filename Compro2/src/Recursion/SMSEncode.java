
package Recursion;

import java.util.Scanner;


public class SMSEncode {
    void suEncode(String sentence, char ichar){
        int len = sentence.length();
        if (len > 1){
            int num1 = (sentence.charAt(0) - ichar);
            int num2 = (sentence.charAt(len-1) - sentence.charAt(0));
            System.out.println(num1 + " " + num2);                
            suEncode(sentence.substring(1, len-1), sentence.charAt(0));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        SMSEncode sms = new SMSEncode();
        sms.suEncode(str, '@'); // The problem not tell input @ you
        
    }
}
