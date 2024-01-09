package Inheritance;

import java.util.Scanner;

class Product {
    String name;
    String sku;
    double price;
    int weight;
    boolean valid;
    
    public Product(String name, String sku, double price, int weight){
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }
    
    boolean checkValidity(){
        this.valid = true;
        if (this.name.length() == 0 || this.name == null){
            System.out.println("name is invalid");
            this.valid = false;
        }
        if (this.sku.length() == 0 || this.sku == null){
            System.out.println("sku is invalid");
            this.valid = false;
        }
        if (this.price < 0){
            System.out.println("price is invalid");
            this.valid = false;
        }
        if (this.weight < 0){
            System.out.println("weight is invalid");
            this.valid = false;
        }
        
        return this.valid;
    }
    
    void printInfo(){
        System.out.print(this.name + ", ");
        System.out.print(this.sku + ", ");
        System.out.print(this.price + ", ");
        if (this.valid){
            System.out.print(this.weight);
        }else {
            System.out.print(this.weight + ", Invalid");
        }
        System.out.println("");
    }
}

public class ProductStore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        /* Your Code */
        Product[] p = new Product[N];
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            /* Your Code */
            p[i] = new Product(name, sku, prices, weight);
            
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            /* Your Code */
            Boolean valid = p[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            p[i].printInfo();
        }
        
    }
}
/*
5
Pokemon Moon
AERAS1724
720
0
Free Water
1SFJUASRF
0
-100
JoJo

65.75
100
Witcher
FS124FA
2000
150

ADRQWR1276
-30
-1

*/