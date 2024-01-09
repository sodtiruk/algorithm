
package compro2learn;
import java.util.Scanner;

public class Crypto {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        int position = scan.nextInt();
        int key = scan.nextByte();
        
        int check1 = 0;
        int check2 = 0;
        if (arr[position]+key < 51743 || arr[position+1]-key > 7832){
            check1++;
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        
        if (arr[position+2]-key < 2394 || arr[position+3]+key > 9213){
            check2++;
            System.out.println("pass"); 
        }else {
            System.out.println("fail"); 
        }
        
        if (check1+check2 == 2){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}


