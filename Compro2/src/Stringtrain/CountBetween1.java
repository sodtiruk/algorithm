
package Stringtrain;

import java.util.Scanner;

public class CountBetween1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<arr.length; i++){
            arr[i] = scan.nextInt();
        }
        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();
        int countx = 0;
        int county = 0;
        for(int i=1; i<arr.length; i++){
            if (arr[i] >= x1 && arr[i] <= x2){
                countx++;
            }
        }
        System.out.println(countx);
        
        for(int i=1; i<arr.length; i++){
            if (arr[i] >= y1 && arr[i] <= y2){
                county++;
            }
        }
        System.out.println(county);
        System.out.println(n-(countx+county));
        
    }
}
