
package Stringlearn;

import java.util.Scanner;

public class SubMatch2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String target = scan.next();              
        int i=2;
        int start = 0;
        while (i < target.length()){
            int end = start + 3;
            String text = target.substring(start, end);
            //System.out.println(text);
            int show = str.indexOf(text);
            if (show == -1){
                System.out.println("No");
            }else {
                System.out.println(show+1);
            }                               
            //System.out.println(start + " " + end);
            start++;           
            i++;
        }
    }
}
