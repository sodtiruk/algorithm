
package Stringtrain;

import java.util.Scanner;

public class StringMerge1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int minlength = str1.length() < str2.length() ? str1.length() : str2.length();
        int n = sc.nextInt();
        if (n == 1){
            for(int i=0; i<minlength; i++){
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                boolean ch1upper = Character.isUpperCase(ch1);
                boolean ch2upper = Character.isUpperCase(ch2);
                if (ch1upper == false && ch2upper == true){
                    System.out.print(ch2);
                }else {
                    System.out.print(ch1);
                }
                
            }
        }else {
            for(int i=0; i<minlength; i++){
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                boolean ch1upper = Character.isUpperCase(ch1);
                boolean ch2upper = Character.isUpperCase(ch2);
                if (ch1upper == true && ch2upper == false){
                    System.out.print(ch1);
                }else {
                    System.out.print(ch2);
                }
                
            }
        }
    }
}
