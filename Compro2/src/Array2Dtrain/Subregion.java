
package Array2Dtrain;

import java.util.Scanner;

public class Subregion {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r+1][c+1];
        int p = sc.nextInt();
        int q = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();
        if (p <= 0 || p > r || q <= 0 || q > c || p+h > r+1 || q+w > c+1){
            System.out.println("invalid input");
        }else {
            for(int i=p; i<p+h; i++){
                for(int j=q; j<q+w; j++){
                    arr[i][j] = 1;
                }
            }  
            for(int i=1; i<=r; i++){
                for(int j=1; j<=c; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
