
package Stringtrain;

import java.util.Scanner;

public class DivideString {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String pimlek = "";
        String pimyai = "";
        String error = "";
        for(int i=0; i<str.length(); i++){
            if ((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122){
                pimlek += str.charAt(i);
            
            }else if ((int)str.charAt(i) >= 65 && (int)str.charAt(i) <= 90){
                pimyai += str.charAt(i);
            }else {
                error += str.charAt(i);
            }
        }
        System.out.println(pimlek);
        System.out.println(pimyai);
        System.out.println(error);
        
    }
}
