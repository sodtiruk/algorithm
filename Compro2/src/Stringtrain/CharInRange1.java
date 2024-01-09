
package Stringtrain;

import java.util.Scanner;

public class CharInRange1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char a1 = scan.next().charAt(0);
        char a2 = scan.next().charAt(0);
        char a3 = scan.next().charAt(0);
        char a4 = scan.next().charAt(0);
        char a5 = scan.next().charAt(0);
        char a6 = scan.next().charAt(0);
        
        //boolean found = false;
        for(int i=0; i<3; i++){
            char target = scan.next().charAt(0);
            boolean found = false;
            if (target >= a1 && target <= a2 || target <= a1 && target >= a2){
                System.out.print("1 ");
                found = true;
            }
            if (target >= a3 && target <= a4 || target <= a3 && target >= a4){
                System.out.print("2 ");
                found = true;
            }
            if (target >= a5 && target <= a6 || target <= a5 && target >= a6){
                System.out.print("3");
                found = true;
            }
            if (found == false){
                System.out.print("0");             
            }
            System.out.println("");
        }
        
    }
}
