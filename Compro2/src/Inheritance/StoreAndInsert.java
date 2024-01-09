package Inheritance;

import java.util.Scanner;
import java.util.ArrayList;

class ProductInfo {
    String name;
    int cheapprices;
    int expensiveprices;

    public ProductInfo(String name, int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            if (prices[i] >= max){
                max = prices[i];
            }
            if (prices[i] <= min){
                min = prices[i];
            }
        }
        this.name = name;
        this.cheapprices = min;
        this.expensiveprices = max;
    }
    
    void printInfo(){
        System.out.println(this.name + " " + this.cheapprices + " " + this.expensiveprices);
    }
}

class Store {
    private ArrayList<ProductInfo> products = new ArrayList<>();
    
    
    void enterProductInfo(Scanner scan) {
        String name = scan.next();
        int n = scan.nextInt();
        int[] prices = new int[n];
        for(int i=0; i<n; i++){
            prices[i] = scan.nextInt();
        }
        ProductInfo pro = new ProductInfo(name, prices);
        products.add(pro);
        
        
    }
    
    void printAllProductInfo(){
        for (int i=0; i<products.size(); i++){
            products.get(i).printInfo();
        }
        
    }

    
}

public class StoreAndInsert {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Store store = new Store();
        int K = scan.nextInt();
        for (int i = 0; i < K; ++i) {
            store.enterProductInfo(scan);
        }
        store.printAllProductInfo();
    }
}
