
package Array2Dtrain;

import java.util.Scanner;

public class NumTable1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int[][] arr = new int[r+1][c+1];
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x >= 1 && x <= r && y >= 1 && y <= c){
                System.out.print(arr[x][y]);
            }else {
                System.out.print("-");
            }
        }
        
    }
}
