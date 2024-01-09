
package Stringlearn;

import java.util.Scanner;

public class SpellChecking1byteacher {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] dict = new String[n];
        for(int i=0; i<dict.length; i++){
            dict[i] = scan.next();
        }
        
        for(int i=0; i<10; i++){
            String word = scan.next();
            boolean isIn = false;
            for(int j=0; j<dict.length; j++){
                String word2 = dict[j];
                if (word.equals(word2)){
                    isIn = true;
                    break;
                }
            }
            if (isIn){
                System.out.print("1");
            }else {
                System.out.print("0"); 
            }
        }
    }
}
