package Class;

import java.util.Scanner;

class Classroom {

    String name;
    int numseats;
    boolean nProj;
    boolean nVisual;
    boolean nSmart;
    boolean nCam;

    public Classroom(String name, int numseats, boolean nProj, boolean nVisual, boolean nSmart, boolean nCam) {
        this.name = name;
        this.numseats = numseats;
        this.nProj = nProj;
        this.nVisual = nVisual;
        this.nSmart = nSmart;
        this.nCam = nCam;
    }

    boolean isAvailable(int numseats, boolean nProj, boolean nVisual, boolean nSmart, boolean nCam) {
        boolean value = true;
        if (this.numseats - numseats < 0){
            value = false;
        }
        if (nProj == true && nProj != this.nProj){
            value = false;
        }
        if (nVisual == true && nVisual != this.nVisual){
            value = false;
        }
        if (nSmart == true && nSmart != this.nSmart){
            value = false;
        }
        if (nCam == true && nCam != this.nCam){
            value = false;
        }
        
        return value;            
    }

    boolean reserve(int numseats, boolean nProj, boolean nVisual, boolean nSmart, boolean nCam) {
        if (isAvailable(numseats, nProj, nVisual, nSmart, nCam)){
            this.numseats = 0;
            return true;
        }else {
            return false;
        }
    }
}

public class Classroom1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Classroom[] rooms = new Classroom[n];
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int numSeats = scan.nextInt();
            int nProj = scan.nextInt();
            int nVisual = scan.nextInt();
            int nSmart = scan.nextInt();
            int nCam = scan.nextInt();

            // You may need to create boolean from int here.
            //?????
            boolean nP = (nProj == 1) ? true : false;
            boolean nV = (nVisual == 1) ? true : false;
            boolean nS = (nSmart == 1) ? true : false;
            boolean nC = (nCam == 1) ? true : false;

            // Then, create an object and keep it in array
            //?????
            //System.out.println(nP + " " + nV + " " + nS + " " + nC);
            rooms[i] = new Classroom(name, numSeats, nP, nV, nS, nC);
        }

        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            int numSeats = scan.nextInt();
            int nProj = scan.nextInt();
            int nVisual = scan.nextInt();
            int nSmart = scan.nextInt();
            int nCam = scan.nextInt();

            //?????
            boolean nP = (nProj == 1) ? true : false;
            boolean nV = (nVisual == 1) ? true : false;
            boolean nS = (nSmart == 1) ? true : false;
            boolean nC = (nCam == 1) ? true : false;
            
            boolean reserve = false;
            for (int j=0; j<n; j++) {
                //?????
                if(rooms[j].reserve(numSeats, nP, nV, nS, nC)){
                    System.out.println(rooms[j].name);
                    reserve = true;
                    break;
                }
                
            }
            if (!reserve) {
                //?????
                System.out.println("classroom not available");
            }
        }

    }
}
