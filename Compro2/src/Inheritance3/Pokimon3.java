
package Inheritance3;

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

class WaterPokimon extends Pokimon {

    public WaterPokimon(PokiStats stats, String name, int level) {
        super(stats, name, level);
    }
    
    int attack(WaterPokimon opponent){
        return super.attack();
    }
    
    int attack(FirePokimon opponent){
        return super.attack()*2;
    }
    
    int attack(ElectricPokimon opponent){
        return super.attack();
    }
    
}
class FirePokimon extends Pokimon {
    
    public FirePokimon(PokiStats stats, String name, int level) {
        super(stats, name, level);
    }
    
    int attack(WaterPokimon opponent){
        return super.attack();
    }
    
    int attack(FirePokimon opponent){
        return super.attack();
    }
    
    int attack(ElectricPokimon opponent){
        return super.attack()*2;
    }
    
}
class ElectricPokimon extends Pokimon {
    
    public ElectricPokimon(PokiStats stats, String name, int level) {
        super(stats, name, level);
    }
    
    int attack(WaterPokimon opponent){
        return super.attack()*2;
    }
    
    int attack(FirePokimon opponent){
        return super.attack();
    }
    
    int attack(ElectricPokimon opponent){
        return super.attack();
    }
    
}

public class Pokimon3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] hps = new int[6];
        int[] attks = new int[6];
        int[] defends = new int[6];
        WaterPokimon water = null;
        FirePokimon fire = null;
        ElectricPokimon electric = null;
        // Read PokiStats
        for(int t = 1; t <= 3; ++t) {
            for(int level = 1; level <= 5; ++level)
                hps[level] = scan.nextInt();
            for(int level = 1; level <= 5; ++level)
                attks[level] = scan.nextInt();
            for(int level = 1; level <= 5; ++level)
                defends[level] = scan.nextInt();
            PokiStats stats = new PokiStats(hps,attks,defends);
        // Name, level and object creation
            String name = scan.next();
            int level = scan.nextInt();
        
        if(t == 1)
            water = new WaterPokimon(stats, name, level);
        else if(t == 2)
            fire = new FirePokimon(stats, name, level);
        else if(t == 3)
            electric = new ElectricPokimon(stats, name, level);
        }
        
        // Write output
        System.out.println(water.attack(water) + " " + water.attack(fire) + " " + water.attack(electric));
        System.out.println(fire.attack(water) + " " + fire.attack(fire) + " " + fire.attack(electric));
        System.out.println(electric.attack(water) + " " + electric.attack(fire) + " " + electric.attack(electric));
        
    }
}
//