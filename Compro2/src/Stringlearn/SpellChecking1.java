
package Stringlearn;

import java.util.Scanner;

public class SpellChecking1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int trueorfalse = 0;
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i] = scan.next();
        }
        for(int i=0; i<10; i++){
            String check = scan.next();
            for(int j=0; j<n; j++){
                if (check.equals(str[j])){
                    trueorfalse = 1;
                    break;
                }
            }
            System.out.print(trueorfalse);
            trueorfalse = 0;
        }
        
        
    }
}
