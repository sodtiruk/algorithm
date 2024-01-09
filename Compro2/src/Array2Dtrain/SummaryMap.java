
package Array2Dtrain;

import java.util.Scanner;

public class SummaryMap {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r+1][c+1];
        int round = sc.nextInt();
        int check = 0;
        for(int i=0; i<round; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int h = sc.nextInt();
            int w = sc.nextInt();
            if (x+h > r+1 || y+w > c+1 || x <= 0 || x > r || y <= 0 || y > c){
                continue;
            }
            for(int j=x; j<x+h; j++){
                for(int k=y; k<y+w; k++){
                    if (arr[j][k] != 0){
                        check++;
                    }
                }
            }
            if (check == 0){
                for(int j=x; j<x+h; j++){
                    for(int k=y; k<y+w; k++){
                        arr[j][k] = 1;
                    }
                }
            }
            check = 0;
        }
        
        
        
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
