
package Stringlearn;

import java.util.Scanner;

public class PPAP {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if (str.indexOf("PPAP") == -1){
            System.out.println("clean");
        }else {
            int firstgod = str.indexOf("GOD");
            int lastgod = str.lastIndexOf("GOD");
            int firstppap = str.indexOf("PPAP");
            int lastppap = str.lastIndexOf("PPAP");
            if (firstgod < firstppap && lastgod > lastppap){
                System.out.println("safe");
            }else {
                System.out.println("danger");
            }
            
        }
        
    }
}
