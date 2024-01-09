
package compro2learn;

import java.util.Scanner;

public class test {

    public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       int[] list1 = new int[1500];
       int[] list2 = new int[1500];
       for(int i=0; i<1500; i++){
           list1[i] = scan.nextInt();
       }
       for(int i=0; i<1500; i++){
           list2[i] = scan.nextInt();
       }
       
       int check = 0;
       int[] found = new int[1500];
       for(int i=0; i<1500; i++){
           if (list1[i] == list2[i]){
               check++;
           }else {
               found[i] = i;
           }
       }
        System.out.println(check);
        for(int i=0; i<1500; i++){
            if (found[i] != 0){
                System.out.print(found[i] + " ");
            }
        }
    }
}
