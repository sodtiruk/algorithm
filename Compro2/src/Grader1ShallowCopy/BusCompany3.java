
import java.util.Scanner;

    class Bus {
        String id;
        int type;
        private int seats;
        private int current;
        private boolean isactive;
        
        Bus(String id,int type,int seats){
            this.id = id;
            this.type = type;
            this.seats = seats;
            this.current = 0;
            this.isactive = true;
        }
        
        void printStats(){
            System.out.println(this.id);
            if(this.type==1){
                System.out.println("Fan");
            } else if(this.type==2){
                System.out.println("P1");
            } else if(this.type==3){
                System.out.println("VIP");
            }
            System.out.println(this.current +" "+ this.seats);
            if(this.isactive){
                System.out.println("Active");
            } else {
                System.out.println("Inactive");
            }
            
        }
        
        boolean reserve(int K){
            if(K <= 0){
                return false;
            } else if ((this.seats - this.current) < K){
                return false;
            } else if(this.isactive == false){
                return false;
            }
            this.current += K;
            return true;
        }
        
        void sendToRepair(){
            this.isactive = false;
        }
        
        void backToService(){
            this.isactive = true;
        }
}
public class BusCompany3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int Q = scan.nextInt();
    Bus[] buss = new Bus[Q];
    for(int i = 0; i < Q; ++i) {
        String id = scan.next();
        int type = scan.nextInt();
        int seats = scan.nextInt();
        buss[i] = new Bus(id, type, seats);
    }
    int N = scan.nextInt();
    for(int i = 0; i < N; ++i) {
        int P = scan.nextInt();
        int K = scan.nextInt();
        int T = scan.nextInt();
        if(P==1){
            boolean wasPrint = false;
            for(int j = 0; j < buss.length; ++j) {
                Bus b = buss[j];
                if(b.type == T){
                    boolean isServed = b.reserve(K);
                    if(isServed){
                        System.out.println(b.id);
                        wasPrint = true;
                        break;
                    }
                }
            }
            if(!wasPrint){
                System.out.println("sorry");
            }
        } else if(P==2){
            buss[T-1].sendToRepair();
        } else if(P==3){
            buss[T-1].backToService();
        }
    }
    }
}