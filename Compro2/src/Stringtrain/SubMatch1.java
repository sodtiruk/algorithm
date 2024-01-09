
package Stringtrain;

import java.util.Scanner;

public class SubMatch1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String s1 = str2.substring(0, 3);
        String s2 = str2.substring(1, 4);
        String s3 = str2.substring(2, 5);
        
        System.out.println(str1.indexOf("AJKB"));
    }
}
