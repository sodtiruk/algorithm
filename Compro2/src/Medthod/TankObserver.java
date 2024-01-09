
package Medthod;

import java.util.Scanner;

class WaterTank{
    int capacity;
    int volume;
    
    public WaterTank(int width, int lenght, int height){
        this.capacity = width * lenght * height;
        this.volume = 0;
    }
    
    int fill (int amount){
        if (amount + volume > capacity){       
            System.out.println("Cannot fill the tank");
            return -1;
        }else {
            volume += amount;
            return volume;
        }
    }
    
}

public class TankObserver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        WaterTank tank = new WaterTank(width, length, height);
        
        for(int i = 0; i < 5; ++i) {
            int amount = scan.nextInt();
            System.out.println(tank.fill(amount));
        }
    }
}
