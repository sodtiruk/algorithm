
import java.util.Scanner;

public class CharSelector {

    String selectChar(String s, int[] k) {
        int len = s.length();
        if (len == 1){
            return s;
        }
        
        String sub = s.substring(0, len-1);
        String ans = selectChar(s.substring(0, len-1), k);
        
        int shift = k[len-1] % len;
        int pos = (len-1) - shift;
        return ans + s.charAt(pos);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        final int N = s.length();
        int[] k = new int[N];

        for (int i = 0; i < N; ++i) {
            k[i] = scan.nextInt();
        }

        CharSelector selector = new CharSelector();
        String ans = selector.selectChar(s, k);
        System.out.println(ans);
    }
}
