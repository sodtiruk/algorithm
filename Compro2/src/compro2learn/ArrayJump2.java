
package compro2learn;

import java.util.Scanner;


public class ArrayJump2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int start = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int pos = start;
        for(int i=0; i<n; i++){
            if (pos > n){
                System.out.println("out of bounds");
                break;
            }
            int jump = arr[pos-1]; 
            System.out.println(pos + " " + jump);
            pos += jump;  
        }
        
    }
}
