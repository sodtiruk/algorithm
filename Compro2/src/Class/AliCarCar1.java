package Class;

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

public class AliCarCar1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Car[] cars = new Car[N];
        
        int count = 1;
        for (int i=0; i<N; ++i){
            String name = scan.next();
            int price = scan.nextInt();
            int labor = scan.nextInt();
            if (Car.check(name, price, labor)) {  
                cars[count] = new Car(count, name, price, labor);
                count++;
                System.out.println("valid");
            } else {
                System.out.println("invalid");
            }
        }

        for(int i=1; i<count; i++){
            System.out.println(i + " " + cars[i].name);
        }
    }
}
/*
7
Swift 50 200
Ciaz 65 0
Yaris -1 180
Vios 0 260
Tiana 80 290
Sunny 80 -5
Leopard 200 350

*/