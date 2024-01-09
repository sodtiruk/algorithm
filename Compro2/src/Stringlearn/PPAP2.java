
package Stringlearn;
import java.util.Scanner;

public class PPAP2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int pos = 0;
        while (true){
            int firstppap = str.indexOf("PPAP", pos);
            int secondppap = str.indexOf("PPAP", firstppap+1);
            int god = str.indexOf("GOD", firstppap);
            
            //System.out.println(firstppap);
            //System.out.println(secondppap);
            //System.out.println(god);
            
            if (god == -1 || god > secondppap){
                System.out.println(secondppap+4);
                break;
            }
            pos = secondppap;
        }
        
    }
}
