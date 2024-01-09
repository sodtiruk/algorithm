
package Array2Dtrain;
import java.util.Scanner;
public class HotSpot {
    static int[] sumCols(int[][] a, final int R, final int C, final int target){
        int[] colSums = new int[C+1];
        // Enter your code here
        
        return colSums;
    }
    static int[] sumRows(int[][] a, final int R, final int C, final int target){
        int[] rowSums = new int[R+1];
        // Enter your code here
        return rowSums;
    }
   
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int count = 0;
        int[][] A = new int[row+1][col+1];
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                A[i][j] = scan.nextInt();
                if (A[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("count = " + count);
        int[] num = new int[count];
        int maxtarget = -1;
        int sum = 0;
        int r = 0;
        int c = 0;
        //int target = scan.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if (A[i][j] == 7){
                    r = i;
                    c = j;
                    System.out.println(r + " " + c);
                    for(int round=0; round<count; round++){
                        int sum1 = 0;
                        int sum2 = 0;
                        
                        
                    }
                }
                
            }           
        }      
        //System.out.println(sum);
    }
}
