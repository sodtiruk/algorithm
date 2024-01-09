
package compro2teach;
import java.util.Scanner;
public class SlotRsv {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextByte();
        int[] arr1 = new int[n+1];
        int[] arr2 = new int[n+1];
        int k = scan.nextByte();
        int p = scan.nextByte();
        for(int i=0; i<p; i++){
            int index = scan.nextInt();
            if (arr1[index] < k) {
                System.out.println("1");
                arr1[index] += 1;
            }else {
                System.out.println("2");
                arr2[index] += 1;
            }
        }
        for(int i=1; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("");
        for(int i=1; i<arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println("");
    }
}
