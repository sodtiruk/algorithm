
package Stringtrain;

import java.util.Scanner;

public class LognestString2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int max = -1;
        int number = 0;
        String longestStr = " ";
        for(int i=0; i<5; i++){
            String str = scan.nextLine();
            number = str.length();
            if (number > max){
                max = number;
                longestStr = str;
            }
        }
        System.out.println(longestStr);
        
        
    }
}
