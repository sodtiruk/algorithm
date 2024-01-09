
package Stringlearn;

import java.util.Scanner;

public class WordStats1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] count = new int[26];
        final int n = scan.nextInt();
        for(int i=0; i<n; i++){
            String str = scan.next();
            char c = str.charAt(0);
            int index = c - 'A';
            count[index] += 1;
        }
        
        for(int i=0; i<26; i++){
            if (count[i] != 0){
                System.out.println((char)(i + 'A') + " " + count[i]);
            }
        }
            
    }
}
