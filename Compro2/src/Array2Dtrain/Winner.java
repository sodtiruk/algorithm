
package Array2Dtrain;

import java.util.Scanner;

public class Winner {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int ships = 0;
        int[][] arr = new int[row+1][col+1];
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                arr[i][j] = scan.nextInt();
                if (arr[i][j] == 1){
                    ships++;
                }
            }
        }
        
        final int k = scan.nextInt();
        final int HIT = 2;
        final int MISS = -1;
        int hit = 0;
        int miss = 0;
        int duphit = 0;
        int dupmiss = 0;
        int out = 0;
        int firsthit = -1;
        int lasthit = -1;
        
        for(int i=1; i<=k; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            if ((x >= 1 && x <= row) && (y >= 1 && y <= col)){
                if (arr[x][y] == 1){
                    hit++;
                    arr[x][y] = HIT;
                    if (firsthit == -1){
                        firsthit = i;
                    }
                    lasthit = i;
                }else if (arr[x][y] == 0){
                    miss++;
                    arr[x][y] = MISS;
                }else if (arr[x][y] == HIT){
                    duphit++;
                }else if (arr[x][y] == MISS){
                    dupmiss++;
                }
            }else {
                out++;
            }
        }
        System.out.println(hit);
        System.out.println(miss);
        System.out.println(duphit);
        System.out.println(dupmiss);
        System.out.println(out);
        if (hit == ships){
            System.out.println("attacker " + lasthit);
        }else {
            System.out.println("battleship " + firsthit);
        }
    }
}
