package Stringlearn;

import java.util.Scanner;

public class StringCut {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String target = scan.next();
        int start = 0;
        int end = str.length();
        int pos = str.indexOf(target);
        int print = 0;
        int notprint = 0;
        if (pos == -1) {
            System.out.println("no target character found");
        } else {
            while (pos != -1) {
                String text = str.substring(start, pos);
                if (start != pos) {
                    System.out.println(text);
                    print++;
                } else {
                    notprint++;
                }
                start = pos + 1;
                pos = str.indexOf(target, start);

            }
            if (start < end) {
                System.out.println(str.substring(start, end));
            }
        }
        if (print == 0 && notprint > 0){
            System.out.println("no output");
        }
    }
}
