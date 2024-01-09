package compro2learn;

import java.util.Scanner;

/**
 * Cumulation (Com Pro 2, 2559-3, Quiz 1)
 *
 * @author Pinyo Taeprasartsit
 */
public class TrainTicker {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int P = scan.nextInt();
        int K = scan.nextInt();
        int[] count = new int[N + 1];// To count the number of people for each station.
        for (int i = 1; i < N; ++i) // Not necessary in Java, but please do it for clarity.
        {
            count[i] = 0;
        }
        for (int i = 0; i < K; ++i) {
            int X = scan.nextInt();
            int Y = scan.nextInt();
            int Z = scan.nextInt();
// If seats are available throughout reservation course, 'okay' will be true.
// Note that the loop ends with station < Y, not station <= Y because
// passengers leave the train at Station Y and free space for others.
            boolean okay = true;
            for (int station = X; station < Y; ++station) {
                if (count[station] + Z > P) {
                    okay = false;
                }
            }
            if (okay) {
                for (int station = X; station < Y; ++station) {
                    count[station] += Z;
                }
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
