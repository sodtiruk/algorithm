package Queue;
import java.util.Scanner;

public class OddEvenQueue {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            Queue evenq = new Queue();
            Queue oddq = new Queue();
            int n = (int)((Math.random()*11)+10);
                System.out.println("--- Random numbers [" + n + "] ---");
            for(int i=0; i<n; i++){
                int number = (int)(Math.random()*101);
                if(number%2==0){
                    evenq.enQueue(number);
                }else {
                    oddq.enQueue(number);
                }
                System.out.print(number + " ");
            }
            System.out.println("");
            
            System.out.println("--- Even Queue [" + evenq.getSize() + "] ---");
            System.out.print("[ ");
            for(int i=0; i<evenq.getSize(); i++){
                Object del = evenq.deQueue();
                evenq.enQueue(del);
                System.out.print(del + " ");
            }
            System.out.println("]");
            
            System.out.println("--- Odd Queue [" + oddq.getSize() + "] ---");
            System.out.print("[ ");
            for(int i=0; i<oddq.getSize(); i++){
                Object del = oddq.deQueue();
                oddq.enQueue(del);
                System.out.print(del + " ");
            }
            System.out.println("]");
            
            
            int Round = 0;
            int winE = 0;
            int winO = 0;
            
            while(true){
                if (evenq.getSize() == 0){
                    System.out.println("===> Winner is Even!");
                    break;
                }else if(oddq.getSize() == 0){
                    System.out.println("===> Winner is Odd!");
                    break;
                }
                               
                if((int)evenq.front() > (int)oddq.front()){
                    evenq.deQueue();
                    Object z = oddq.deQueue();
                    oddq.enQueue(z);
                    winE++;
                }else if ((int)evenq.front() < (int)oddq.front()){
                   oddq.deQueue();
                   Object z = evenq.deQueue();
                   evenq.enQueue(z);
                   winO++;
                }
                Round++;            
            }
                     
            System.out.print("Round="+Round+", ");
            System.out.printf("Win=(E:%d,O:%d), ", winE, winO);           
            if (evenq.getSize() > oddq.getSize()){
                System.out.println("Even Left="+evenq.getSize());
            }else {
                System.out.println("Odd left="+oddq.getSize());
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
