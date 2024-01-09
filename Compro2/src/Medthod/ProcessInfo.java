
package Medthod;

import java.util.Scanner;

public class ProcessInfo {
    
    static boolean listProcesses(String[] names, int[] ramUsed, int ramAll){
        int L = names.length;
        int sum = 0;
        for(int i=0; i<L; i++){
            String name = names[i];
            int ramUse = ramUsed[i];
            if (ramUse >= 10){
                System.out.println(name + "* " + ramUse);
            }else {
                System.out.println(name + " " + ramUse);
            }
            sum += ramUse;
        }
        String line1 = String.format("RAM used = %d out of %d", sum , ramAll);
        System.out.println(line1);
        if (sum <= ramAll){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        String[] names = new String[N];
        int[] ramUses = new int[N];
        for(int i=0; i<N; i++){
            names[i] = scan.next();
            ramUses[i] = scan.nextInt();          
        }
        int ramAll = scan.nextInt();
        boolean check = listProcesses(names, ramUses, ramAll);
        if (check){
            System.out.println("Sufficient RAM");
        }else {
            System.out.println("Not enough RAM");
        }
    }
}
