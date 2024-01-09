
package Class;

import java.util.Scanner;

class Bus {
    String id;
    int type;
    int seats;
    int reverseseats = 0;
    boolean isactive = true;
    public Bus(String id, int type, int seats){
        this.id = id;
        this.type = type;
        this.seats = seats;
    }
    
    void printStats(){
        System.out.println(this.id);
        if (this.type == 1){
            System.out.println("Fan");
        }else if (this.type == 2){
            System.out.println("P1");
        }else {
            System.out.println("VIP");
        }
        System.out.println(reverseseats + " " + this.seats);      
        if (isactive){
            System.out.println("Active");
        }else {
            System.out.println("Inactive");
        }       
    }
    
    boolean reserve(int k){
        if (k <= 0){
            return false;
        }
        if (this.seats - reverseseats <= k){
            return false;
        }
        if (this.isactive == false){
            return false;
        }
        this.reverseseats += k;
        return true;
    }
    
    void sendToRepair(){
        isactive = false;
    }
    void backToService(){
        isactive = true;
    }
}

public class BusCompany1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        Bus b = new Bus(id, type, seats);
        
        
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int P = scan.nextInt();
            int K = scan.nextInt();
            if (P == 1) {
                b.reserve(K);
            } else if (P == 2) {
                b.sendToRepair();
            } else if (P == 3) {
                b.backToService();
            }
            b.printStats();
        }  
    }
}
