
package Stringlearn;

import java.util.Scanner;
public class SplitCount {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int i = 0;
        int count = 0;
        while(true){
            int first = str.indexOf("AB", i);
            if (first == -1){
                break;
            }
            int last = str.indexOf("CD", first+1);
            if (last == -1){
                break;
            }           
            //System.out.println(first);
            //System.out.println(last);           
            String checkstr = str.substring(first+2, last);
            //System.out.println(checkstr);                       
            if (checkstr.indexOf("AB") == -1 && checkstr.indexOf("CD") == -1){
                count++;
            }              
            //System.out.println("count = " + count);
            i = first+1;                           
        }
        System.out.println(count);
          
    }
}
