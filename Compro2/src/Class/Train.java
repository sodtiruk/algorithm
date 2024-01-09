
package Class;
import java.util.Scanner;

class Carriage {
    int capa;
    int type;
    int id;
    int seats = 0;
    int stand = 0;
    boolean seatsfull = false;
    
    public Carriage(int capa, int type, int id){
        this.capa = capa;
        this.type = type;
        this.id = id;
    }
    
    void reserveSeats(int q){
        if (this.type == 1 || this.type ==2){
            if (q + seats <= this.capa){
                seats += q;
            }
        }else {          
            if (q + seats <= this.capa){
                seats += q;
            }else if (q + seats > this.capa && seatsfull == false){
                seatsfull = true;
                stand += (q + seats)-this.capa;
                seats += this.capa-seats;
            }else if (q + seats > this.capa && seatsfull == true && q + stand <= 10){
                stand += q;
            }
            
        }
    }
    
    void printStats(){
        if (this.type == 1 || this.type == 2){
            System.out.println(this.id + " " + this.type + " " + this.seats + " " + this.capa);
        }else {
            System.out.println(this.id + " " + this.type + " " + this.seats + " " + this.capa + " " + this.stand + " " + 10);
        }
    }
}

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        Carriage[] carr = new Carriage[N];
        for(int i=0; i<N; i++) {
            int type = scan.nextInt();
            int capa = scan.nextInt();
            int id = scan.nextInt();
            carr[i] = new Carriage(capa, type, id);
        }
        
        //System.out.println(carr[2].id);
        final int K = scan.nextInt();
        for(int i=0; i<K; i++) {
            int p = scan.nextInt();
            int q = scan.nextInt();
            carr[p-1].reserveSeats(q);            
        }
        
        for(int i=0; i<N; i++) {           
           carr[i].printStats();           
        }
    }
}
