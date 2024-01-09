
package Medthod;

import java.util.Scanner;

public class ArrayCounter2 {
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
        int n1 = scan.nextInt();
        int[] Array1 = new int[n1];
        for(int i=0; i<Array1.length; i++){
            Array1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] Array2 = new int[n2];
        for(int i=0; i<Array2.length; i++){
            Array2[i] = scan.nextInt();
        }
        int result1 = countArrayOdds(Array1);
        int result2 = countArrayOdds(Array2);
        System.out.println(result1 + result2);
        
    }
}
