
package Medthod;

import java.util.Scanner;

public class TaskManager {
    
    static void reportLoad(int cpuAll, int ramAll, int cpuUsed, int ramUsed){
        //3a
        int cpupercent = (100*cpuUsed)/cpuAll;
        String line1 = String.format("CPU: %d/%d (%d%%)", cpuUsed, cpuAll, cpupercent);
        System.out.println(line1);
        
        //3b
        int rampercent = (100*ramUsed)/ramAll;
        String line2 = String.format("RAM: %d/%d (%d%%)", ramUsed, ramAll, rampercent);
        System.out.println(line2);
        
        //3c
        if (cpupercent >= 80){
            System.out.println("Limited CPU power");
        }
        if (rampercent >= 80){
            System.out.println("Limited RAM availability");
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cpuAll = scan.nextInt();
        int ramAll = scan.nextInt();
        int cpuUsed = scan.nextInt();
        int ramUsed = scan.nextInt();
        
        reportLoad(cpuAll, ramAll, cpuUsed, ramUsed);
    }
}
