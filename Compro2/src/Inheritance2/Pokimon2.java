
package Inheritance2;

import java.util.Scanner;

class PokiStats{
    int[] hps;
    int[] attks;
    int[] defends;
    
    public PokiStats(int[] hps, int[] attks, int[] defends){
        this.hps = new int[hps.length];
        this.attks = new int[attks.length];
        this.defends = new int[defends.length];
        
        for(int i=0; i<hps.length; i++){
            this.hps[i] = hps[i];
            this.attks[i] = attks[i];
            this.defends[i] = defends[i];         
        } // or use medthod clone                
    } 
}

class  Pokimon {
    // Enter your new code here and only here
    String name;
    int level;
    int energy;
    PokiStats stats;
    
    public Pokimon(PokiStats stats, String name, int level){
        this.name = name;
        this.level = level;
        this.stats = stats;
        this.energy = stats.hps[level];
    }
    
    int attack(){
        int attk = stats.attks[level];
        return attk;
    }
    
    int defend(){
        int def = stats.defends[level];
        return def;
    }
}


public class Pokimon2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        // Read PokiStats
        for(int level = 1; level <= 5; ++level)
            hps[level] = scan.nextInt();
        for(int level = 1; level <= 5; ++level)
            attks[level] = scan.nextInt();
        for(int level = 1; level <= 5; ++level)
            defends[level] = scan.nextInt();
        PokiStats stats = new PokiStats(hps, attks, defends);
        
        // Name, level and object creation
        String name = scan.next();
        int level = scan.nextInt();
        Pokimon mon = new Pokimon(stats, name, level);
        
        // Write output
        System.out.println(mon.name);
        System.out.println(mon.energy);
        System.out.println(mon.attack());
        System.out.println(mon.defend());
        
    }
}
