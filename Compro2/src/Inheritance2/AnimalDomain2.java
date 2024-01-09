
package Inheritance2;

import java.util.ArrayList;
import java.util.Scanner;

class Animal {
    String name;
    int lifeExpect;
    int age = 0;
    
    public Animal(String name, int lifeExpect){       
        this.name = name;
        this.lifeExpect = lifeExpect;
        System.out.println(this.name + " was born with life expectancy " + this.lifeExpect + " year(s)");
    }
    
    void live(int year){       
        if (age + year < lifeExpect){
            if (year == 1){
                System.out.println(this.name + " lived " + year + " more year");
            }else {
                System.out.println(this.name + " lived " + year + " more years");
            }
        }else if (age + year > lifeExpect){
            if (lifeExpect-age <= 3 && lifeExpect-age > 1){
                System.out.println(this.name + " lived " + (lifeExpect-age) + " more years and died");
            }else if (lifeExpect-age == 1){
                System.out.println(this.name + " lived " + (lifeExpect-age) + " more year and died");
            }else if (lifeExpect-age <= 0){
                System.out.println(this.name + " died earlier");
            }else {
                System.out.println(this.name + " lived " + (lifeExpect-age) + " more years and died");
            }
        }else {
            if (year == 1){
                System.out.println(this.name + " lived " + year + " more year and died");
            }else {
                System.out.println(this.name + " lived " + year + " more years and died");
            }
        }
        this.age += year;
    }
    
    boolean isAlive(){
        if (age < lifeExpect){
            System.out.println(this.name + " is alive");
            return true;
        }else {
            System.out.println(this.name + " is dead");
            return false;
        }     
    }
    
    void vaccine(){
        System.out.println(this.name + " life expectancy is now " + this.lifeExpect + " year(s)");
    }
    
}

class Dog extends Animal{
    
    public Dog(String name){
        super(name, 8); 
    }
    
    @Override
    void vaccine(){
        this.lifeExpect *= 2;
        super.vaccine();
    }
}

class Turtle extends Animal{
    
    public Turtle(String name){
        super(name, 50);
    }
}

class Salmon extends Animal{
    
    public Salmon(String name){
        super(name, 4);
    }
}

public class AnimalDomain2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        ArrayList<Dog> dog = new ArrayList<>();
        ArrayList<Turtle> tur = new ArrayList<>();
        ArrayList<Salmon> sal = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            int action = scan.nextInt();          
            if (action == 1){
                int type = scan.nextInt();
                String name;
                
                if (type == 1){
                    
                }else if (type == 2){
                    
                }else if (type == 3){
                    
                }
            }else if (action == 2){
                
            }
            
        }
    }
}
