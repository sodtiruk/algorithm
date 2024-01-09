
package Tumbol2;

import java.util.Scanner;

public class Tumbol {
    String name;
    int longitude;
    int latitude;
    int poppulation;
    int availBudget;
    public Tumbol(String name, int latitude, int longitude, int poppulation){
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.poppulation = poppulation;
        this.availBudget = this.poppulation * 5000;
    }
    
    int allocateBudget(int[] projects){
        int remainBudget = this.availBudget;
        for(int i=1; i<projects.length; i++){
            int requestbudget = projects[i];
            if (requestbudget < remainBudget){
                remainBudget -= requestbudget;
                System.out.print(i + " ");
            }
        }
        if (remainBudget == this.availBudget){
            System.out.println("none");
        }else {
            System.out.println("");
        }
        return this.availBudget - remainBudget;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Tumbol[] tumbols = new Tumbol[k];
        for(int i=0; i<k; i++){
            String name = sc.next();
            int latitude = sc.nextInt();
            int longitude = sc.nextInt();
            int poppulation = sc.nextInt();
            Tumbol tumbol = new Tumbol(name, latitude, longitude, poppulation);
            tumbols[i] = tumbol;
            
        }
        int total = 0;
        for(int i=0; i<k; i++){
            int n = sc.nextInt();
            int[] projects = new int[n+1];
            for(int j=1; j<projects.length; j++){
                projects[j] = sc.nextInt();
            }
            int budget = tumbols[i].allocateBudget(projects);
            total+=budget;
        }
        System.out.println(total);
    }
}
