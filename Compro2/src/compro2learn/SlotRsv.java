
package compro2learn;
import java.util.Scanner;

public class SlotRsv {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int p = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int songnai = 0;
        for(int i=0; i<p; i++){
            int x = scan.nextInt();
            arr1[x-1] += 1;
            songnai = 1;
            if (arr1[x-1] > k){
                arr1[x-1] -= 1;
                arr2[x-1] += 1;
                songnai = 2;
            }
            System.out.println(songnai);
            songnai = 0;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        for(int i=0; i<n; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
