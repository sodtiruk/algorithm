
package Stringtrain;

import java.util.Scanner;

public class LongestString4 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int max = -1;
        int number = 0;
        String longestStr = " ";
        while(true){
            String str = scan.nextLine();
            number = str.length();
            if (number == 0){
                break;
            }
            if (number >= max){
                max = number;
                longestStr = str;
            }
        }
        System.out.println(longestStr);
    }
}
