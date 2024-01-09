
package compro2teach;

import java.util.Scanner;

public class Box1 { 

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] capacity = new int[n+1];
        int[] box = new int[n+1];
        for(int i=1; i<n+1; i++){
            capacity[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int cmd = scan.nextInt();
            int q = scan.nextInt();
            int b = scan.nextInt();
            
            if (cmd == 1){
                if (box[b]+q <= capacity[b]){
                    box[b] += q;
                    System.out.println(box[b]);
                }else {
                    System.out.println("-1");
                }
            }
            if (cmd == 2){
                if (box[b] >= q){
                    box[b] -= q;
                    System.out.println(box[b]);
                }else {
                    System.out.println("-1");
                }
            }
        }
        
    }
}
