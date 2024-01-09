
package Class;

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
    
    void allocateBudget(int[] projects){
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
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int latitude = sc.nextInt();
        int longitude = sc.nextInt();
        int poppulation = sc.nextInt();
        Tumbol tumbol = new Tumbol(name, latitude, longitude, poppulation);
        
        int n = sc.nextInt();
        int[] projects = new int[n+1];
        for(int i=1; i<projects.length; i++){
            projects[i] = sc.nextInt();
        }
        
        tumbol.allocateBudget(projects);
        
    }
}
