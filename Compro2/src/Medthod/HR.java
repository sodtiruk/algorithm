
package Medthod;

import java.util.Scanner;

class Employee {
    String name;
    String ID;
    int type;
    int wage;
    
    int exWork = 0;
    int opWork = 0;
    
    public Employee(String name, String ID, int type, int wage){
        this.name = name;
        this.ID = ID;
        this.type = type;
        this.wage = wage;
    }
    
    boolean workExecutive(int hour){
        if (hour > 0){
            this.exWork += hour;
            return true;
        }else {
            System.out.println("Invalid hour for executive work");
            return false;
        }
    }
    
    boolean workOperation(int hour){
        if (hour > 0){
            this.opWork += hour;
            return true;
        }else {
            System.out.println("Invalid hour for operation work");
            return false;
        }
    }
    
    int calPayment(){
        int sum = 0;
        if (this.type == 1){
            int sum1 = this.exWork * wage;
            int sum2 = (this.opWork * wage)*2;
            sum = sum1+sum2;
        }else if (this.type == 2){
            int sum1 = (this.exWork * wage)*2;
            int sum2 = this.opWork * wage;
            sum = sum1+sum2;
        }
        return sum;
    }
    
    void printStats(){
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.name);
        if (this.type == 1){
            System.out.println("Position: Executive");
        }else {
            System.out.println("Position: Operation");
        }
        System.out.println("Ex Hour: " + this.exWork);
        System.out.println("Op Hour: " + this.opWork);
        System.out.println("Wage: " + this.wage);
        int payment = calPayment();
        System.out.println("Payment: " + payment);
    }
}

public class HR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String ID = scan.next();
        int type = scan.nextInt();
        int wage = scan.nextInt();
        Employee employee = new Employee(name, ID, type, wage);
        
        final int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int workType = scan.nextInt();
            int hour = scan.nextInt();
            if (workType == 1){
                boolean x = employee.workExecutive(hour);
                System.out.print(x + " " + employee.calPayment());
            }else {
                boolean x = employee.workOperation(hour);
                System.out.print(x + " " + employee.calPayment());
            }
            System.out.println("");
        }
        employee.printStats();

    }
}
