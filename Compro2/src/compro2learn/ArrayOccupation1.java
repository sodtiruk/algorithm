package compro2learn;
import java.util.Scanner;
public class ArrayOccupation1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] A = new int[n+1];
        int jongmaidai = 0;
        int jongdai = 0;
        int some = 0;
        for(int i=1; i<=k; i++){
            int x = scan.nextInt();
            if (x < 1 || x > n){
                jongmaidai++;
                continue;
            }
            A[x]++;           
        }
        int sum = 0;
        int max = -1;
        for(int i=1; i<=n; i++){
            if (A[i] > 0){
                jongdai++;
            }
            sum += A[i];
            if (max < A[i]){
                max = A[i];
            }
        }
        System.out.println(jongdai);
        System.out.println(jongmaidai);
        System.out.println(sum - jongdai);
        //System.out.println(max);
        for(int i=1; i<=n; i++){
            if (A[i] == max){
                System.out.print(i + " ");
            }
        }

        
    }
}
