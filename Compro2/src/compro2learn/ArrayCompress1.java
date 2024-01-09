
package compro2learn;

import java.util.Scanner;

public class ArrayCompress1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        
        int sum = 0;
        for(int i=0; i<n; i++){
            if (a[i] != target){
                sum += a[i];
            }
            if (a[i] == target){
                System.out.print(sum + " ");
                System.out.print(target + " ");
                sum = 0;
            }
        }
        System.out.println(sum);
        
    }
}
