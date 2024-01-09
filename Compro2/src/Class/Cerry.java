package Class;

import java.util.Scanner;

class Ship {
    int capacity;
    
    Ship(int cap){
        if (cap > 0){
            this.capacity = cap;
        }else {
            this.capacity = 10;
        }
    }
    
    int load(int[] weight, int first){
        int sum = 0;
        int last = 0;
        for(int i=first; i<weight.length; i++){
            if (sum + weight[i] <= this.capacity){
                sum += weight[i];
                last++;
            }else {
                break;
            }
        }
        return last;
    }
}

public class Cerry {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Ship[] ship = new Ship[m];
        for (int i = 0; i < m; i++) {
            int cap = in.nextInt();
            ship[i] = new Ship(cap);
        }
        int p1 = 0;
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = in.nextInt();
        }
        
        int start = 0;
        for(int i=0; i<m; i++){
            int lastcontain = ship[i].load(weight, start);
            //System.out.println("lastcon = " + lastcontain);
            p1 += lastcontain;
            start = p1;
        }
        
        
        // Do not change the following lines.
        System.out.print(p1 + " ");
        int sum_weight = 0;
        for (int i = 0; i < p1; i++) {
            sum_weight += weight[i];
        }
        System.out.println(sum_weight);
    }
}
