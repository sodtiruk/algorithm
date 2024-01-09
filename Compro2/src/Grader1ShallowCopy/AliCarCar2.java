
package Grader1ShallowCopy;

import java.util.Scanner;

class Car {
    int id;
    String name;
    int price;
    int larbor;
    
    public Car(int id, String name, int price, int larbor){
        this.id = id;
        this.name = name;
        this.price = price;
        this.larbor = larbor;
    }
    
    static boolean check(String name, int price, int larbor){
        if (name.length() == 0){
            return false;
        }
        if (price <= 0){
            return false;
        }
        if (larbor <= 0){
            return false;
        }
        return true;
    }
}
class Factory {
    Car[] car;
    boolean[] create;
    int power;
    
    
    public Factory(Car[] car, boolean[] create, int power){
        this.car = car;
        this.create = create;
        this.power = power;
    }
}

public class AliCarCar2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N+1];
        
        int count = 1;
        for (int i=0; i<N; ++i){
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            if (Car.check(name, price, labor)) {  
                cars[count] = new Car(count, name, price, labor);
                count++;
                //System.out.println("valid");
            }
        }
        Factory[] fac = new Factory[5];
        for(int i=0; i<5; i++){
            int power = scan.nextInt();
            boolean[] create = new boolean[N];
            for(int j=0; j<N; j++){
                int x = scan.nextInt();
                if (x == 1){
                    create[j] = true;
                }else if (x == 2){
                    create[j] = false;
                }
            }
            fac[i] = new Factory(cars, create, power);
        }
        
        //System.out.println("count = " + (count-1));
        int k = scan.nextInt();
        for(int i=0; i<k; i++){
            int check = scan.nextInt();
            if (check < 1 || check > count-1){
                System.out.println("invalid model");
            }else {
                for(int j=0; j<5; j++){
                    if (fac[j].create[check-1] == true){
                        System.out.println("okay " + (j+1));
                        break;
                    }
                }
            }
        }
    }
}
