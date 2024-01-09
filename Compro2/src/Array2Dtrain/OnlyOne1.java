
package Array2Dtrain;

import java.util.Scanner;

public class OnlyOne1 {

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
        
        int value = 0;
        int maxvalue = -1;
        int column = 0;
        for(int i=1; i<=c; i++){
            for(int j=1; j<=r; j++){
                if (arr[j][i] == 1){
                    value++;
                }
            }
            if (value >= maxvalue){
                maxvalue = value;
                column = i;
            }
            value = 0;
        }
        System.out.println(maxvalue);
        System.out.println(column);
    }
}
