
package Stringtrain;

import java.util.Scanner;

public class IntToChar {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int code = scan.nextInt();
        if (code < 65 || code > 90){
            System.out.println("unsupported code");
        }else {
            System.out.println((char)code);
        }
        
    }
}
