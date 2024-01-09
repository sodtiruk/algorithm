package Class;

import java.util.Scanner;

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

public class PriceRange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int N = scan.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = scan.nextInt();
        }
        ProductInfo pInfo = new ProductInfo(name, prices);
        pInfo.printInfo();
    }
}
