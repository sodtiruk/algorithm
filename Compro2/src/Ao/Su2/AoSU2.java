package Ao.Su2;
import java.util.Scanner;

class Hero {
    String name;
    int hp;
    int attkType;
    int attackDmg;
    int phyDef;
    int magDef;

    public Hero(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef) {
        if (hp < 0 || attkType < 0 || attkDmg < 0 || phyDef < 0 || magDef < 0){
            System.out.println("warning: value cannot be negative");
        }
        this.name = name;
        this.hp = hp;
        this.attkType = attkType;
        this.attackDmg = attkDmg;
        this.phyDef = phyDef;
        this.magDef = magDef;
    }
    
    void printInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.hp);
        if (this.attkType == 1){
            System.out.println("Attack: " + this.attackDmg + " (physical)");
        }else {
            System.out.println("Attack: " + this.attackDmg + " (magical)");
        }
        System.out.println("Defense: " + this.phyDef + " (physical), " + this.magDef + " (magical)");
        checKAndWarn();
    }
    
    boolean checKAndWarn(){
        if (hp < 0 || attkType < 0 || attackDmg < 0 || phyDef < 0 || magDef < 0){
            System.out.println("warning: value cannot be negative");
            return false;
        }
        return true;
    }
}

class Team {
    
    Hero[] members;
    
    public Team(Hero[] members) {
        
        this.members = members.clone();
        
    }
    
    boolean is5MemberTeam(int[] members){
        if (members.length < 5){
            System.out.println("member is missing");
            return false;
        }else if (members.length == 5){
            System.out.println("full team");
            return true;
        }else {
            System.out.println("too many members");
            return false;
        }
    }
    
    boolean isValid(Hero[] members){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                
            }
        }
    }
    
}

public class AoSU2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        ________ members ________;
        if (________) {
            members = new ________;
            for (int i = 0; i < N; ++i) {
                String name = scan.next();
                int hp = scan.nextInt();
                int attkType = scan.nextInt();
                int attkDmg = scan.nextInt();
                int phyDef = scan.nextInt();
                int magDef = scan.nextInt();
                ________ = new Hero(name, hp, attkType, attkDmg, phyDef, magDef);
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
    }
}
