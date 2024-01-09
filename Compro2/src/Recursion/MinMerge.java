
package Recursion;

import java.util.Scanner;

public class MinMerge {
    String merge(String str1, String str2){
        int length1 = str1.length();
        int length2 = str2.length();
        if (length1 == 0){
            return str2;
        }else if (length2 == 0){
            return str1;
        }
        if (str1.charAt(0) < str2.charAt(0)){
            return str1.charAt(0) + merge(str1.substring(1), str2.substring(1,length2));
            //havent to put paramiter "length" in substring
        }else {
            return str2.charAt(0) + merge(str1.substring(1,length1), str2.substring(1));
            //havent to put paramiter "length" in substring
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        MinMerge merger = new MinMerge();
        System.out.println(merger.merge(str1, str2));
    }
}
/*
NARUTO
OROCHIMARU
ANS = NAOCHIMARU

PIKACHU
DRATINI
ANS = DIAACHI

NARUTO
SASUKE
ANS = NARUKE

OROCHIMARU
NARUTO
ANS = NAOCHIMARU

LIVERPOOL
MANUTD
ANS = LANERDOOL

GERALT
VESEMIR
ANS = GERALIR
*/
