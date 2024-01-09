
package Medthod;

import java.util.Scanner;

public class UnderLine1 {
    
    static void line(){
        System.out.println("--------------------");
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String str = scan.next();
            System.out.println(str);
            line();
            
        }
    }
}
