
package compro2teach;

import java.util.Scanner;

public class Howlong {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        final int n = scan.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = scan.nextInt();
        }
        
        for(int rnd=0; rnd<3; rnd++){
            int sonjai = scan.nextInt();
            int length = 0;
            for(int i=sonjai; i<=n; i++){
                if(arr[i] == 1){
                    ++length;
                }else {
                    break;
                }
            }
        System.out.println(length);
        }
    }
}
