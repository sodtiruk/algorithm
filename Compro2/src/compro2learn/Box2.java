
package compro2learn;

import java.util.Scanner;

public class Box2 {

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
            
            if (cmd == 1){
                int b = scan.nextInt();
                if (box[b]+q <= capacity[b]){
                    box[b] += q;
                    System.out.println(box[b]);
                }else {
                    System.out.println("-1");
                }
            }
            if (cmd == 2){
                int sum = 0;
                for(int x=1; x<n+1; x++){                   
                    sum += box[x];
                    box[x] = 0;
                    if (sum < q && x == n){
                        for(int z=1; z<n+1; z++){
                            box[z] = 0;
                        }
                        System.out.println(x + " 0");
                    }
                    if (sum >= q){
                        sum -= q;
                        box[x] = sum;
                        int pos = x;
                        System.out.println(pos + " " + box[x]);
                        break;
                    }                    
                }                              
            }
        }
    }
}
