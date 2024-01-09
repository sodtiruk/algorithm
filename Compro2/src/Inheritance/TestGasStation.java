
package Inheritance;

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

class GasStation{
    int k;
    double[] amount;

    public GasStation(double[] amount) {
        this.k = amount.length;
        this.amount = amount.clone();
//        this.amount = new double[k];
//        for(int i=0; i<k; i++){
//            this.amount[i] = amount[i];
//        }
    }
    
    void fillTank(int Type, Truck truck, double distance){
        double fuel = truck.calFeul(distance);
        if (fuel <= amount[Type-1]){
            amount[Type-1] -= fuel;
        }else {
            System.out.println(Type + " out of gasoline");
        }
        
    }
    
    void refuel(double[] amount){
        for(int i=0; i<k; i++){
            this.amount[i] += amount[i];
        }
    }
    
    void print(){
        for(int i=0; i<k; i++){
            System.out.print(this.amount[i] + " ");
        }
        System.out.println("");
    }
    
}

public class TestGasStation {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Truck[] t = new Truck[n]; 
        for (int i = 0; i < n; i++) {
            t[i] = new Truck(scan.nextInt(), scan.nextInt());          
        }
        
        int k = scan.nextInt();
        double[] amount = new double[k];
        for(int i=0; i<k; i++){
            amount[i] = scan.nextDouble();
        }
        GasStation station = new GasStation(amount);
        
        int m = scan.nextInt();
        for(int i=0; i<m; i++){
            int menu = scan.nextInt();
            if (menu == 0){
                int A = scan.nextInt();
                int T = scan.nextInt();
                double D = scan.nextDouble();
                //call filltank
                station.fillTank(T, t[A-1], D);
                station.print();
            }
            if (menu == 1){
                for(int j=0; j<k; j++){
                    amount[j] = scan.nextDouble();
                }
                //call refuel
                station.refuel(amount);
                station.print();
            }
        } 
    }
}
