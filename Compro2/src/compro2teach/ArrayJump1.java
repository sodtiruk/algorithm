
package compro2teach;
import java.util.Scanner;

public class ArrayJump1 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt(); 
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = scan.nextInt();
        }       
        int pos = 1; // keep position
        for(int i=0; i<5; i++){
            if(pos > n){
                System.out.println("out of bounds");
                break;
            }
            int jump = arr[pos]; //distance jump
            System.out.println(pos + " " + jump);
            pos += jump;            
        }                              
    }
}
