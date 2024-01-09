
package Stringtrain;

import java.util.Scanner;

public class LongestString1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int max = -1;
        int number = 0;
        for(int i=0; i<5; i++){
            String str = scan.nextLine();
            number = str.length();
            if (number > max){
                max = number;
            }
        }
        System.out.println(max);
    }
}
