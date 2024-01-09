
package Stringtrain;

import java.util.Scanner;

public class CharAt {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int target = scan.nextInt();
        //System.out.println(str.length());
        if (target <= 0 || target > str.length()){
            System.out.println("invalid position");
        }else {
            System.out.println(str.charAt(target-1));
        }
    }
}
