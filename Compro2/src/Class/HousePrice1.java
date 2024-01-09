
package Class;

import java.util.Scanner;

class House{
    int landSize;
    int quality;
    int floors;
    int houseArea;
    int price;
    public House(int landSize, int quality, int floors, int houseArea){
        this.landSize = landSize;
        this.quality = quality;
        this.floors = floors;
        this.houseArea = houseArea;
        this.price = computePrice(landSize, quality, floors, houseArea);
    }
    int computePrice(int landSize, int quality, int floors, int houseArea){
        landSize = landSize * 10000;
        int keep = 0;
        if (quality == 1){
            keep = 10000*houseArea;
        }else if (quality == 2){
            keep = 8000*houseArea;
        }else if (quality == 3){
            keep = 5000*houseArea;
        }
        int f = 0;
        if (floors == 1){
            floors = 0;
        }else {
            f = (floors - 1)*200000;
            floors = f;
        }
        return landSize+keep+floors;
    }
}
public class HousePrice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int landSize = scan.nextInt();
        int quality = scan.nextInt();
        int floors = scan.nextInt();
        int houseArea = scan.nextInt();
 
        House house = new House(landSize, quality, floors, houseArea);
        System.out.println(house.landSize + " " + house.quality + " " + house.floors + " " +  house.houseArea);
        System.out.println(house.price);
    }
}
