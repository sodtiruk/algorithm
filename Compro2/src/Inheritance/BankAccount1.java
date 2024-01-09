
package Inheritance;

import java.util.Scanner;

class Account {
    String name;
    String code;
    double balance;
    boolean active;
    
    public Account(String name, String code, double balance){
        this.name = name;
        this.code = code;
        this.balance = balance;
        this.active = true;
        System.out.println("Open account");
    }
    
    void printInfo(){
        System.out.print(this.name + ", " + this.code + ", " + this.balance);
        if (this.active){
            System.out.println(", active");
        }else {
            System.out.println(", inactive");
        }
    }
    
    double checkBalance(){
        return this.balance;
    }
    
    void closeAccount(){
        this.active = false;
        this.printInfo();
    }
    
    boolean deposit(double money){
        if (this.active){
            this.balance += money;
            System.out.print(this.balance);
            return true;
        }else {
            return false;
        }
    }
    
    boolean withdrawn(double money){
        if (this.active && this.balance - money >= 0){            
                this.balance -= money;
                System.out.print(this.balance);
                return true;
        }
        return false;
    }    
}

public class BankAccount1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        Account ac = new Account(name, code, money);
        
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int action = scan.nextInt();
            if (action == 1){
                ac.printInfo();
            }else if (action == 2){
                double balance = ac.checkBalance();
                System.out.println(balance);
            }else if (action == 3){
                ac.closeAccount();
            }else if (action == 4){
                double amt = scan.nextDouble();
                boolean success = ac.deposit(amt);
                if (success){
                    System.out.println(" true");
                }else {
                    System.out.println("false");
                }
            }else if (action == 5){
                double amt = scan.nextDouble();
                boolean success = ac.withdrawn(amt);
                if (success){
                    System.out.println(" true");
                }else {
                    System.out.println("false");
                }
            }
        }
    }
}
