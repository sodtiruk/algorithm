
package Array2Dtrain;

import java.util.Scanner;

public class NumTable2 {

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
        int consec_ = -1;
        int consecnum = -1;
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x >= 1 && x <= r && y >= 1 && y <= c){
                if (arr[x][y] != consecnum){
                    System.out.print(arr[x][y]);
                    consecnum = arr[x][y];
                    consec_ = 0;
                }else{
                    System.out.print("*");
                    consec_ = 0;
                }
                
            }else {
                if (consec_ == 0){
                    System.out.println("");
                    consec_ = 1;
                    consecnum = -1;
                }
            }
        }
    }
}
