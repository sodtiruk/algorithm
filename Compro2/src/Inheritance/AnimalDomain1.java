package Inheritance;

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
    
}

public class AnimalDomain1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // Your Code
        ArrayList<Animal> animals = new ArrayList<>();
        
        for (int i = 0; i < N; ++i) {
            int type = scan.nextInt();
            if (type == 1) {
                String name = scan.next();
                int lifeExpect = scan.nextInt();
                // Your Code
                Animal animal = new Animal(name, lifeExpect);
                animals.add(animal);
                
                
            } else if (type == 2) {
                int id = scan.nextInt();
                int year = scan.nextInt();
                // Your Code
                animals.get(id-1).live(year);
                
            } else if (type == 3) {
                int id = scan.nextInt();
                // Your Code
                animals.get(id-1).isAlive();
            }
            
            
        }
    }
}
