
package compro2learn;
import java.util.Scanner;

public class Auction1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int round = scan.nextInt();
        int[] arrprice = new int[n];
        int[] maxcolumn = new int[n];
        for(int i=0; i<n; i++){
            maxcolumn[i] = -2000000000; 
        }
        
        for(int i=0; i<round; i++){
            for(int j=0; j<n; j++){
                int pramoon = scan.nextInt();
                if (pramoon == -1){
                    pramoon = arr[j];
                }
                if (pramoon < arr[j]){
                    pramoon = arr[j];
                }
                if (pramoon > maxcolumn[j]){
                    maxcolumn[j] = pramoon;
                }
                arrprice[j] = maxcolumn[j];
                
            }
            
            for(int z=0; z<n; z++){
                System.out.print(arrprice[z] + " ");
            }
            System.out.println("");
            
        }
        
        
    }
}
