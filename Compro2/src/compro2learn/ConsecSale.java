
package compro2learn;

import java.util.Scanner;

public class ConsecSale {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        int consec = 0;
        int maxconsec = -1;
        int[] arr = new int[n+1];
        if (p == 1){
            for(int i=0; i<k; i++){
                int x = scan.nextInt();
                if (x < p || x > n){
                    continue;
                }
                arr[x]++;
            }
           
            for(int i=1; i<arr.length; i++){
                if (arr[i] == 0){
                    count++;
                    consec++;
                }else if (arr[i] > 0){
                    consec = 0;
                }
                if (consec > maxconsec){
                    maxconsec = consec;
                }
            }
        }else {
            for(int i=0; i<k; i++){
                int x = scan.nextInt();
                if (x < p || x > p+n-1){
                    continue;
                }
                int fact = x-p+1;
                arr[fact]++;
            }
            for(int i=1; i<arr.length; i++){
                if (arr[i] == 0){
                    count++;
                    consec++;
                }else if (arr[i] > 0){
                    consec = 0;
                }
                if (consec > maxconsec){
                    maxconsec = consec;
                }
            }
            
        }
        System.out.println(count);
        System.out.println(maxconsec);
        /*System.out.println("-----------------------------");
        for(int i=1; i<arr.length; i++){
            System.out.println(arr[i]);
        }*/
        
    }
}
