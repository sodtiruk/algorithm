package Class;
import java.util.Scanner;

class Truck {
    double weight;
    double amount;
    
    Truck(double weight, double amount){      
        this.weight = weight;
        this.amount = amount;
    }
    
    double calFeul(double distance){
        double F = (this.weight + distance)/10;
        return Math.ceil(F);
    }
}

public class TestTruck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Truck[] t = new Truck[n]; 
        for (int i = 0; i < n; i++) {
            t[i] = new Truck(in.nextInt(), in.nextInt());
            
        }
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int x = in.nextInt();
            int distance = in.nextInt();
            //call method and show the answer
            double volumn = t[x-1].calFeul(distance);
            System.out.println(volumn);
        }
    }
}
