
package Stringtrain;

import java.util.Scanner;

public class indexOf {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = scan.nextLine();
        if (str.indexOf(str2)+1 == 0){
            System.out.println("string not found");
        }else {
            System.out.println(str.indexOf(str2)+1);
        }
    }
}
