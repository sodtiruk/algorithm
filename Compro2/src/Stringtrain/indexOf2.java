package Stringtrain;

import java.util.Scanner;

public class indexOf2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str2 = scan.nextLine();
        int[] box = new int[1000];
        int max = -1;
        int count = 0;
        int k = 0;
        for(int i=0; i<str.length(); i++){
            k = str.indexOf(str2, i)+1;
            if (k > 0){
                box[k] = k;
                count++;
            }
            if (k > max){
                max = k;
            }
        }
        if (count > 0){
            for(int i=0; i<1000; i++){
                if (box[i] != 0){
                    System.out.print(box[i] + " ");
                }
            }
        }else {
            System.out.println("string not found");
        }
    }
}
