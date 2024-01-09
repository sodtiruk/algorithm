
package Medthod;

import java.util.Scanner;

public class ThreeNumber {
    static int find(int[] arr, int target){
        int result = 0;
        if (target == -1){
            int min = Integer.MAX_VALUE;
            for(int i=0; i<3; i++){
                if (arr[i] < min){
                    min = arr[i];
                }
            }
            result = min;
        }else if (target == 0){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int median = 0;
            for(int i=0; i<3; i++){
                if (arr[i] < min){
                    min = arr[i];
                }
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            for(int i=0; i<3; i++){
                if (arr[i] > min && arr[i] < max){
                    median = arr[i];
                }
            }
            result = median;
        }else if (target == 1){
            int max = Integer.MIN_VALUE;
            for(int i=0; i<3; i++){
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            result = max;
        }         
        return result;
    }
    

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = scan.nextInt();
        }
        
        int target = scan.nextInt();
        System.out.println(find(arr, target));
    }
}
