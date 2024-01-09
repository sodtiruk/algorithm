
package Stringtrain;

import java.util.Scanner;

public class LongestCount {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int max = -1;
        int number = 0;
        int strnumber = 1;
        while(true){
            String str = scan.nextLine();
            number = str.length();
            if (number == 0){
                break;
            }
            if (number == max){
                strnumber++;
            }
                
            if (number > max){
                max = number;
                strnumber = 1;
            }
        }
        System.out.println(max);
        System.out.println(strnumber);
        
    }
}
