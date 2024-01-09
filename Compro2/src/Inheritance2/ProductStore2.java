package Inheritance2;

import java.util.Scanner;

class Product {

    String name;
    String sku;
    double price;
    int weight;
    boolean valid;

    public Product(String name, String sku, double price, int weight) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }

    boolean checkValidity() {
        this.valid = true;
        if (this.name.length() == 0 || this.name == null) {
            System.out.println("name is invalid");
            this.valid = false;
        }
        if (this.sku.length() == 0 || this.sku == null) {
            System.out.println("sku is invalid");
            this.valid = false;
        }
        if (this.price < 0) {
            System.out.println("price is invalid");
            this.valid = false;
        }
        if (this.weight < 0) {
            System.out.println("weight is invalid");
            this.valid = false;
        }

        return this.valid;
    }

    void printInfo() {
        System.out.print(this.name + ", ");
        System.out.print(this.sku + ", ");
        System.out.print(this.price + ", ");
        if (this.valid) {
            System.out.print(this.weight);
        } else {
            System.out.print(this.weight + ", Invalid");
        }
        System.out.println("");
    }
}

class Shoe extends Product {
    int gender;
    int size;
    int type;
    String brand;
    
    public Shoe(String name, String sku, double price, int weight, int gender, int size, int type, String brand){
        super(name, sku, price, weight);
        this.gender = gender;
        this.size = size;
        this.type = type;
        this.brand = brand;    
    }
    
    @Override
    void printInfo(){
        super.printInfo();
        if (this.gender == 1){
            System.out.print("female, ");
        }else {
            System.out.print("male, ");
        }
        System.out.print(size + ", ");
        if (this.type == 1){
            System.out.print("sport, ");
        }else if (this.type == 2){
            System.out.print("formal, ");
        }else if (this.type == 3){
            System.out.print("casual, ");
        }
        System.out.println(this.brand);
    }

}

public class ProductStore2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        /* Your Code */
        Shoe[] shoes = new Shoe[N];
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            int gender = scan.nextInt();
            int size = scan.nextInt();
            int type = scan.nextInt();
            String brand = scan.next();
            shoes[i] = new Shoe(name, sku, prices, weight, gender, size, type, brand);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            /* Your Code */
            boolean valid = shoes[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            /* Your Code */
            shoes[i].printInfo();
        }
    }
}
/*
3
Toon BSlam
AERAS
720
0
2 12 1 Niko
Working
1SFJURF
0
-100
1 8 2 Munchen
RongTuaTae

65.75
100
1 6 3 Satellite

 */
