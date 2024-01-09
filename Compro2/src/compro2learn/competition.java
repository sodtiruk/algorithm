package compro2learn;
import java.util.Scanner;
public class competition {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] team1 = new int[n];
        int[] team2 = new int[n];
        int score1 = 0;
        int score2 = 0;
        for(int i=0; i<n; i++){
            team1[i] = scan.nextInt();
        }
        for(int i=0; i<n; i++){
            team2[i] = scan.nextInt();
        }
        
        for(int i=0; i<n; i++){
            if (team1[i] > team2[i]){
                score1 += 2;
            }else if(team1[i] < team2[i]){
                score2 += 2;
            }else {
                score1++;
                score2++;
            }
        }
        
        if (score1 > score2){
            System.out.println("Team 1 wins");
            System.out.println("Score " + score1 + " to " + score2);
        }else if (score1 < score2){
            System.out.println("Team 2 wins");
            System.out.println("Score " + score2 + " to " + score1);
        }else {
            System.out.println("Draw game");
            System.out.println("Score " + score1 + " to " + score2);
        }
    }
}
