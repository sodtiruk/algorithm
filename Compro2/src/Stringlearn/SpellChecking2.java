
package Stringlearn;

import java.util.Scanner;

public class SpellChecking2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] dict = new String[n];
        for(int i=0; i<n; i++){
            dict[i] = scan.next();
        }
        int K = scan.nextInt();
        for(int k=0; k<K; k++){
            String word = scan.next();
            boolean isIn = false;
            for(int i=0; i<dict.length; i++){
                String word2 = dict[i];
                if (word.equals(word2)){
                    isIn = true;
                }
            }
            if (isIn){
                System.out.println(word);
            }else {
                int[] score = new int[dict.length];
                for(int i=0; i<dict.length; i++){
                    String word2 = dict[i];
                    int L = Math.min(word.length(), word2.length());
                    for(int j=0; j<L; j++){
                        char c1 = word.charAt(j);
                        char c2 = word2.charAt(j);
                        if (c1 == c2){
                            score[i]++;
                        }
                    }
                }
                int max_score = -1;
                int max_index = 0;
                for(int i=0; i<score.length; i++){
                    if(score[i] > max_score){
                        max_score = score[i];
                        max_index = i;
                    }
                }
                System.out.println(dict[max_index]);
            }
        }
            
        
    }
}
