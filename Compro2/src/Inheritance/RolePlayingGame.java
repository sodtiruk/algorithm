
package Inheritance;

import java.util.Scanner;

class GameCharacter{
  String name;
  int attack;
  int defense;
  int level;
  
  public GameCharacter(String name){
      this.name = name;
  }
  
  void stat(){
      System.out.println(this.name + " " + this.level + " " + this.attack + " " + this.defense);
  }
}

class Hero extends GameCharacter{
    
    Hero(String name){ 
        super(name);
        super.attack = 10;
        super.defense = 5;
        super.level = 1;
    }
    void hit(Monster x){
        int levelx = x.score/100;
        if (levelx != 0){
            super.attack += 3*levelx;
            super.defense += 2*levelx;
            super.level += levelx;
        }
    }
}

class Monster extends GameCharacter{
    int score;
    Monster(String name, int level, int score){
        super(name);
        super.level = level;
        this.score = score;
        super.attack = 2*level;
        super.defense = 3*level;
    }
}

public class RolePlayingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        Hero[] heroes = new Hero[M];
        for(int i=0;i<M;i++){
          String name = scan.next();
          heroes[i] = new Hero(name);
        }
        int N = scan.nextInt();
        Monster[] monster = new Monster[N];
        boolean[] alive = new boolean[N];
        for(int i=0;i<N;i++){
          int level = scan.nextInt();
          int score = scan.nextInt();
          monster[i] = new Monster(Integer.toString(i+1), level , score);
        }
        int K = scan.nextInt(); 
        for(int i=0;i<K;i++){ 
          int iHero = scan.nextInt()-1;
          int iMonster = scan.nextInt()-1;
          if (!alive[iMonster]){
            heroes[iHero].hit(monster[iMonster]); 
            alive[iMonster] = !alive[iMonster];
          }
        }
        for(int i=0;i<M;i++){
          heroes[i].stat(); 
        }
    }
}
