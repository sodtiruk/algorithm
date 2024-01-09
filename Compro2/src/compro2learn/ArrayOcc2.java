
package compro2learn;

import java.util.Scanner;

public class ArrayOcc2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] arr = new int[k+1];
        int[] arr2 = new int[n+1];
        int consec = 0;
        int maxconsec = -1;
        
        for(int i=1; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        
        
        for(int i=1; i<arr.length; i++){
            if (arr[i] < 1 || arr[i] > n){
                continue;
            }else {
                arr2[arr[i]]++;
            }
        }
        int start = 1;
        for(int i=1; i<arr2.length; i++){
            if (arr2[i] == 0){
                consec++;
            }else {
                consec = 0;                
            }
            if (maxconsec < consec){
                maxconsec = consec;               
            }
        }
        System.out.println(maxconsec);
        
        int test = 0;
        for(int i=1; i<arr2.length; i++){
            if (arr2[i] == 0){
                test++;
                if (test == maxconsec){
                    System.out.print(i + " ");
                }
            }else {
                test = 0;
            }
        }
       
    }
}
