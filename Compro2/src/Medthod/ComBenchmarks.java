
package Medthod;

import java.util.Scanner;

class ComAndBench{
    int cpuPow;
    int ramAmt;
    int gpuPow;
    int cpuPrc;
    int gpuPrc;
    int ramPrc;
    int totalPrice;
    
    int WindStrike;
    int PastMark;
    int Soreal;
    int SiSandro;

    public ComAndBench(int cpuPow, int ramAmt, int gpuPow, int cpuPrc, int gpuPrc, int ramPrc) {
        this.cpuPow = cpuPow;
        this.ramAmt = ramAmt;
        this.gpuPow = gpuPow;
        this.cpuPrc = cpuPrc;
        this.gpuPrc = gpuPrc;
        this.ramPrc = ramPrc;
        this.totalPrice = cpuPrc+ramPrc+gpuPrc;
    }
    
    void runWindStrike(){
        int score = this.cpuPow + this.gpuPow;
        if (this.ramAmt <= 4){
            score/=2;
        }else if (this.ramAmt > 8){
            score*=2;
        }
        this.WindStrike = score;
    }
    
    void runPastMark(){
        int score = Math.max(this.cpuPow, this.gpuPow);
        this.PastMark = score;
    }
    
    void runSoreal(){
        int score = this.gpuPow + (this.cpuPow/2);
        if (this.PastMark < 300){
            score/=2;
        }
        this.Soreal = score;
    }
    
    boolean runSiSandro(){
        int score = (this.ramAmt * 100)+this.cpuPow;
        if (this.ramAmt < 4){
            System.out.println("SiSandro Failed");
            return false;
        }
        this.SiSandro = score;
        return true;
    }
    
    void runAllBenches(){
        this.runWindStrike();
        this.runPastMark();
        this.runSoreal();
        boolean isSiValid = this.runSiSandro();
        System.out.println("WindStrike: " + this.WindStrike);
        System.out.println("PastMark: " + this.PastMark);
        System.out.println("Soreal: " + this.Soreal);
        if (isSiValid){
            System.out.println("SiSandro: " + this.SiSandro);
        }else {
            System.out.println("SiSandro: Failed");
        }      
    }
    
    void reportPerfPerPrice(){
        int score = (this.WindStrike + this.PastMark + this.Soreal)/this.totalPrice;
        System.out.println("Performance per Price = " + score);
    }
}

public class ComBenchmarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cpuPow = scan.nextInt();
        int gpuPow = scan.nextInt();
        int ramAmt = scan.nextInt();
        int cpuPrc = scan.nextInt();
        int gpuPrc = scan.nextInt();
        int ramPrc = scan.nextInt();
        
        ComAndBench cab = new ComAndBench(cpuPow, ramAmt, gpuPow, cpuPrc, ramPrc, gpuPrc);
        cab.runAllBenches();
        cab.reportPerfPerPrice();
    }
}
