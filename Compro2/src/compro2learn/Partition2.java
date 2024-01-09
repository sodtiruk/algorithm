
package compro2learn;

import java.util.Scanner;


public class Partition2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);      
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int count = 0;
        int middle = arr[n/2+1];
        for(int i=1; i<arr.length; i++){
            if (arr[i] <= middle){
                count++;
            }else {
                arr[i] = -1;
            }
        }          
        int[] arr2 = new int[count+1];       
        int check=0;
        for(int i=1; i<arr.length; i++){
            if (arr[i] == -1){
                continue;
            }else {
                arr2[check] = arr[i];
                check++;
            }
        }      
        int middle2 = count/2;
        for(int i=0; i<count; i++){
            if (arr2[i] <= arr2[middle2]){
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println("");
        for(int i=0; i<count; i++){
            if (arr2[i] > arr2[middle2]){
                System.out.print(arr2[i] + " ");
            }
        }
        
    }
}
