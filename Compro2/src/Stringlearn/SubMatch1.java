
package Stringlearn;

import java.util.Scanner;

public class SubMatch1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String target = scan.next();
        
        String check1 = target.substring(0, 3);
        String check2 = target.substring(1, 4);
        String check3 = target.substring(2, 5);
        
        int result1 = str.indexOf(check1);
        int result2 = str.indexOf(check2);
        int result3 = str.indexOf(check3);
        if (result1 != -1){
            System.out.println(result1+1);
        }else {
            System.out.println("No");
        }
        if (result2 != -1){
            System.out.println(result2+1);
        }else {
            System.out.println("No");
        }
        if (result3 != -1){
            System.out.println(result3+1);
        }else {
            System.out.println("No");
        }
        
    }
}
