
package Array2Dtrain;

import java.util.Scanner;

public class NumTable3 {

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
        int longest = 0;
        int maxlongest = -1;
        int howmany = 0;
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x >= 1 && x <= r && y >= 1 && y <= c){
                if (arr[x][y] != consecnum){
                    //System.out.print(arr[x][y]);
                    longest++;
                    consecnum = arr[x][y];
                    consec_ = 0;
                }else{
                    //System.out.print("*");
                    longest++;
                    consec_ = 0;
                }
                if (longest > maxlongest) {
                    maxlongest = longest;
                    howmany = 1;
                }else if (longest == maxlongest){
                    maxlongest = longest;
                    howmany++;
                }
                
            }else {
                if (consec_ == 0){
                    //System.out.println("");
                    longest = 0;
                    consec_ = 1;
                    consecnum = -1;
                }
            }
        }
        System.out.println(maxlongest);
        System.out.println(howmany);
    }
}
