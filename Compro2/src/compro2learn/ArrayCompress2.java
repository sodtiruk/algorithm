
package compro2learn;

import java.util.Scanner;

public class ArrayCompress2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();
        int found = 0;
        for(int i=0; i<arr.length; i++){
            if (found == 1){
                if (arr[i] == x1 || arr[i] == x2 || arr[i] == x3){
                    continue;
                }else {
                    sum += arr[i];
                    found = 0;
                }
                
            }else {
                if (arr[i] == x1 || arr[i] == x2 || arr[i] == x3){
                    found = 1;
                    if (sum != 0){
                        System.out.print(sum + " ");
                        sum = 0;
                    }else if (sum == 0 && i > 0){
                        System.out.print(sum + " ");
                    }
                    System.out.print(arr[i] + " ");
                }else {
                    sum += arr[i];
                }
            }
        }
        if (sum != 0){
            System.out.print(sum);
        }
    }
}
