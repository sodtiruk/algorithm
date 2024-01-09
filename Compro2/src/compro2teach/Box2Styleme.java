
package compro2teach;

import java.util.Scanner;

public class Box2Styleme {

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
                int count = 0;
                int lastbox = 0;
                for(int x=1; x<n+1; x++){
                    if(count + box[x] > q){
                        count+=q;
                        box[x]-=q;
                        q=0;
                        lastbox = x;
                    }else {
                        count+=box[x];
                        box[x]=0;
                        q-=box[x];
                    }
                    if(q==0){
                        break;
                    }
                }
                if(q!=0){
                    System.out.println(n + " 0");
                }else {
                    System.out.println(lastbox);
                }
            }
        }
    }
}
