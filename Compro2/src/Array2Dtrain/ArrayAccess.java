
package Array2Dtrain;

import java.util.Scanner;

public class ArrayAccess {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        int[][] arr = new int[n+1][];
        for(int i=1; i<=n; i++){
            int k = scan.nextInt();
            arr[i] = new int[k];
            for(int col=0; col<k; col++){
                arr[i][col] = scan.nextInt();
            }
        }
        
        int sum=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int error = 0;
        while(true){
            int row = scan.nextInt();
            if (row == 0){
                break;
            }
            if (row > n){
                continue;
            }
            int index = scan.nextInt();
            if (index >= arr[row].length){
                error++;
                continue;
            }
            if (max < index){
                max = index;
            }
            if (min > index){
                min = index;
            }
            sum+=arr[row][index];
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(error);
    }
}
