
package Class;

import java.util.Scanner;

public class LectRoom {
    int classCode;
    String name;
    int capacity;
    int currentSeats = 0;
    
    public LectRoom(int classCode, String name, int capacity){
        this.classCode = classCode;
        this.name = name;
        this.capacity = capacity;    
    }
    
    public boolean reserveSeats(int Seats){
        if (Seats+currentSeats <= capacity){
            currentSeats += Seats;
            return true;
        }else {
            return false;
        }
    }
}
class Lectroom1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        LectRoom[] rooms = new LectRoom[k];
        for(int i=0; i<k; i++){
            int classCode = scan.nextInt();
            String name = scan.next();
            int capacity = scan.nextInt();
            rooms[i] = new LectRoom(classCode, name, capacity);
        }
        
        int n = scan.nextInt();
        for(int i=0; i<n; i++){
            int classcode = scan.nextInt();
            int seats = scan.nextInt();
            boolean found = false;
            for(int j=0; j<k; j++){              
                if (classcode == rooms[j].classCode){
                    if (rooms[j].reserveSeats(seats)){
                        System.out.println(rooms[j].name);
                        found = true;
                        break;
                    }
                }
            }
            if (found == false){
                System.out.println("sorry");
            }
        }
    }
}
