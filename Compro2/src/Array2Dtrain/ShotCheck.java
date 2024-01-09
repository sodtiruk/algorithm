
package Array2Dtrain;

import java.util.Scanner;

public class ShotCheck {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        //int[][] arr = new int[row][col];
        int n = scan.nextInt();
        
        int shotinside = 0;
        int shotoutside = 0;
        for(int i=0; i<n; i++){
            int x = scan.nextInt();           
            int y = scan.nextInt();          
            if ((x < 1 || x > row) || (y < 1 || y > col)){
                shotoutside++;
            }else {
                shotinside++;
            }
        }
        System.out.println(shotinside);
        System.out.println(shotoutside);
    }
}
