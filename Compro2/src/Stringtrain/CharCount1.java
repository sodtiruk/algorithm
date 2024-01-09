
package Stringtrain;

import java.util.Scanner;

public class CharCount1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] arr = new int[26+1];
        for(int i=0; i<str.length(); i++){
            int num = str.charAt(i);
            num -= 64;
            arr[num]++;
        }
        
        for(int i=1; i<arr.length; i++){
            if (arr[i] > 0){
                int change = i+64;
                System.out.print((char)change + " " + arr[i] + "\n");
            }
        }
    }
}
