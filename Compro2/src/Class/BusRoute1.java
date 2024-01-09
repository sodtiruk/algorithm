
package Class;

import java.util.Scanner;

class Route {
    String[] name;
    int[] distances;
    
    public Route(String[] name, int[] distances){
        this.name = name;
        this.distances = distances;
    }
    
    void getStopInfo (int order){
        int limit = this.distances.length;
        if (order < 1 || order > limit){
            System.out.println("invalid number");
        }else {
            System.out.println(name[order-1] + " " + distances[order-1]);
        }
    }
}

public class BusRoute1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] name = new String[n];
        int[] distances = new int[n];
        
        for(int i=0; i<n; i++){
            name[i] = scan.next();
            distances[i] = scan.nextInt();         
        }
        
        Route route = new Route(name, distances);
        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int number = scan.nextInt();
            route.getStopInfo(number);          
        }
        
        
    }
}
