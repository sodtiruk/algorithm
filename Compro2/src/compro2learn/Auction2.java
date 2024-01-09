
package compro2learn;

import java.util.Scanner;

public class Auction2 {


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
        int[] consec = new int[n];
        int[] maxconsec = new int[n];
        for(int i=0; i<n; i++){
            maxcolumn[i] = -2000000000; 
        }
        for(int i=0; i<n; i++){
            consec[i] = 1; 
        }
        for(int i=0; i<n; i++){
            maxconsec[i] = 0; 
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
                if (pramoon < maxcolumn[j]){
                    pramoon = maxcolumn[j];
                }
                    
                if (pramoon > maxcolumn[j]){
                    if (consec[j] < 4){
                        maxcolumn[j] = pramoon;
                        maxconsec[j] = pramoon;
                        arrprice[j] = maxcolumn[j];
                        consec[j] = 1;
                    }else {
                        arrprice[j] = maxconsec[j];
                    }
                }else if (pramoon == maxcolumn[j]){
                    consec[j]++;
                    if (consec[j] >= 4){
                        maxconsec[j] = maxcolumn[j];
                       
                    }
                }
                
                
            }
            
            for(int z=0; z<n; z++){
                System.out.print(arrprice[z] + " ");
            }
            System.out.println("");
            
        }
        
    }
}
