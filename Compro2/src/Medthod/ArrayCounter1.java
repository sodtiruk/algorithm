
package Medthod;

import java.util.Scanner;

public class ArrayCounter1 {
    static int countArrayOdds(int[] array){
        int count = 0;
        for(int i=0; i<array.length; i++){
            if (array[i] % 2 == 1 || array[i] % 2 == -1){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] Array = new int[n];
        for(int i=0; i<n; i++){
            Array[i] = scan.nextInt();
        }
        int result = countArrayOdds(Array);
        System.out.println(result);
    }
}
