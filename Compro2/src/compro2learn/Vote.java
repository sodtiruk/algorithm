package compro2learn;
import java.util.Scanner;
public class Vote {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int n = scan.nextInt();
        int[] array = new int[n];
        int max = -2000000000;
        int count = 0;
        int maxnumber = 0;
        for(int i=0; i<n; i++){
            array[i] = scan.nextInt();
        }
        
        for(int i=1; i<=size; i++){
            for(int j=0; j<n; j++){
                if (array[j] == i){
                    count++;
                }
                if (count > max){
                    max = count;
                    maxnumber = i;
                }
           }
            count = 0;
        }
        System.out.println(maxnumber);
        System.out.println(max);
        
    }
}
