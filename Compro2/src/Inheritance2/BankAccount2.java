
package Inheritance2;

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

class Saving extends Account{
    String id;
    String tel;
    boolean promptPay;
    
    public Saving(String name, String code, double balance){
        super(name, code, balance);
        this.promptPay = false;
        System.out.println("Saving account");        
    }
    
    @Override
    void printInfo(){
        System.out.print(this.name + ", " + this.code + ", " + this.balance);
        if (this.active){
            System.out.println(", active");
        }else {
            System.out.println(", inactive");
        }
        
        if (this.promptPay){
            if (this.id != null && this.tel == null){
                System.out.println("PromptPay, " + this.id);
            }else if (this.id == null && this.tel != null){
                System.out.println("PromptPay, " + this.tel);
            }else if (this.id != null && this.tel != null){
                System.out.println("PromptPay, " + this.id + ", " + this.tel);
            }
        }else {
            System.out.println("no PromptPay");
        }
    }
    
    boolean openPromptPay(int option, String idortel){
        if (option == 1){
            if (idortel.length() == 13){
                this.id = idortel;
                this.promptPay = true;
                return true;
            }
        }else if (option == 2){
            if (idortel.length() == 10){
                this.tel = idortel;
                this.promptPay = true;
                return true;
            }
        }
        return false;
    }
}

public class BankAccount2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String code = scan.nextLine();
        double money = scan.nextDouble();
        /* Your Code: create Saving object*/
        Saving sv = new Saving(name, code, money);      
      
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i) {
            int action = scan.nextInt();
            if (action == 1){
                sv.printInfo();
            }else if (action == 2){
                double balance = sv.checkBalance();
                System.out.println(balance);
            }else if (action == 3){
                sv.closeAccount();
            }else if (action == 4){
                double amt = scan.nextDouble();
                boolean success = sv.deposit(amt);
                if (success){
                    System.out.println(" true");
                }else {
                    System.out.println("false");
                }
            }else if (action == 5){
                double amt = scan.nextDouble();
                boolean success = sv.withdrawn(amt);
                if (success){
                    System.out.println(" true");
                }else {
                    System.out.println("false");
                }
            }else if (action == 6){
                int subMenu = scan.nextInt();
                String number = scan.nextLine().strip();
                boolean success = sv.openPromptPay(subMenu, number);
                if (success){
                    System.out.println("true");
                }else {
                    System.out.println("false");
                }
            }
        }
    }
}
