
package Stringlearn;

import java.util.Scanner;

public class CardPair2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            String hand1 = scan.next();
            String hand2 = scan.next();

            char c1 = hand1.charAt(0);
            char c2 = hand1.charAt(1);
            char d1 = hand2.charAt(0);
            char d2 = hand2.charAt(1);
            if (c1 == c2 && d1 != d2){
                System.out.print("W");
            }else if(c1 != c2 && d1 == d2){
                System.out.print("L");
            }else {
                char h1 = (c1 < c2)? c1: c2;
                char h2 = (d1 < d2)? d1: d2;

                if (h1 == h2){
                    System.out.print("D");
                }else if (h1 < h2){
                    System.out.print("W");
                }else if (h1 > h2){
                    System.out.print("L");
                }
            }
        }
    }
}
