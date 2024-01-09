
package Medthod;

import java.util.Scanner;

public class EncodingAlphabetwithNumber {
    static void Encoding(String str, int[] a){
        String result = "";
        for(int i=0; i<str.length(); i++){
            char x = str.charAt(i);
            x+=a[i];
            if (x > 90){
                x -= 26;
            }
            result += (char)x;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] a = new int[str.length()];
        for(int i=0; i<a.length; i++){
            a[i] = scan.nextInt();
        }    
        Encoding(str, a);
        
    }
}
