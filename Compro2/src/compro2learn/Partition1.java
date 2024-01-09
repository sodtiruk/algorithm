
package compro2learn;

import java.util.Scanner;

public class Partition1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int middle = arr[n/2+1];
        for(int i=1; i<arr.length; i++){
            if (arr[i] <= middle){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("");
        for(int i=1; i<arr.length; i++){
            if (arr[i] > middle){
                System.out.print(arr[i] + " ");
            }
        }
        
        //System.out.println(middle);
        
    }
}
