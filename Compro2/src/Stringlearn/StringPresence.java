
package Stringlearn;

import java.util.Scanner;

public class StringPresence {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }       
        String str2 = scan.next();
        
        boolean found = false;
        for(int i=0; i<n; i++){
            if (str2.indexOf(str[i]) != -1){
                System.out.print(str[i] + " ");
                found = true;
            }
        }
        if (found == false){
            System.out.println("none");
        }
    }
}
