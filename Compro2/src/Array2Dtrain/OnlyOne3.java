
package Array2Dtrain;

import java.util.Scanner;

public class OnlyOne3 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r+1][c+1];
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int x = sc.nextInt();
        if (x > r){
            x = r;
        }else if (x < 1){
            x = 1;
        }
        int y = sc.nextInt();
        if (y > c){
            y = c;
        }else if (y < 1){
            y = 1;
        }
        //System.out.println("x = " + x);
        //System.out.println("y = " + y);
        for(int i=1; i<=c; i++){
            if (arr[x][i] == 1){
                count++;
            }
        }
        for(int i=1; i<=r; i++){
            if (arr[i][y] == 1){
                count++;
            }
        }
        if (arr[x][y] == 1){
            count -= 1;
        }
        System.out.println(count);
    }
}
