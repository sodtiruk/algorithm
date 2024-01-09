package compro2learn;
import java.util.Scanner;
public class NumberOccurrence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int count = 0;
        for(int i=0; i<n; i++){
            array[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        
        for(int i=0; i<n; i++){
            if (target == array[i]){
                count++;
            }
        }
        if (count != 0){
            for(int i=0; i<n; i++){
                if (target == array[i]){
                    System.out.print(i+1 + " ");
                }
            }
        }else {
            System.out.println(0); 
       }
    }
}
