package Inheritance3;
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

class FixedDeposit extends Account{
// Enter Your Code Here.
    double fixedAmount;
    public FixedDeposit(String name, String code, double balance, double fixedAmount){
        super(name, code, balance);
        this.fixedAmount = fixedAmount;
        System.out.println("FixedDeposit account with " + fixedAmount);
    }
    
    @Override
    boolean deposit(double money){
        if (money >= this.fixedAmount){
            boolean check = super.deposit(money);
            if (check == true){
                System.out.println(" "+ check);
            }else {
                System.out.println(check);
            }
            return check;
        }else {
            System.out.println("deposit less than " + this.fixedAmount + " false");
            return false;
        }
    }
}
class CurrentAccount extends Account{
    // Enter Your Code Here.
    double overDraft;
    public CurrentAccount(String name, String code, double balance, double overDraft){
        super(name, code, balance);
        this.overDraft = overDraft;
        System.out.println("Current account with overdraft " + overDraft);
    }
    
    @Override
    boolean withdrawn(double money){
        if (super.active){
            super.balance -= money;
        }
        if (Math.abs(super.balance) <= this.overDraft && super.active == true){
            if (super.balance < 0){
                System.out.print(super.balance + " overdraft");              
            }else {
                System.out.print(super.balance);
            }
            return true;
        }else {
            return false;
        }
    }
}
public class BankAccount3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Saving sAcc = null;
        FixedDeposit fAcc = null;
        CurrentAccount cAcc = null;
        for (int t = 1; t <= 3; t++) {
            String name = scan.nextLine();
            String code = scan.nextLine();
            double money1 = scan.nextDouble();
            if (t == 1) {
                scan.nextLine();
                sAcc = new Saving(name, code, money1);
            } else if (t == 2) {
                double money2 = scan.nextDouble();
                scan.nextLine(); //Skip the remainder of the double line.
                fAcc = new FixedDeposit(name, code, money1, money2);

            } else if (t == 3) {
                double money2 = scan.nextDouble();
                scan.nextLine(); // Skip the remainder of the double line.
                cAcc = new CurrentAccount(name, code, money1, money2);
            }
        }
        int N = scan.nextInt();
        for (int i = 0; i < N; ++i) {
            int bAC = scan.nextInt();
            if (bAC == 1){
                int action = scan.nextInt();
                if (action == 1){
                    sAcc.printInfo();
                }else if (action == 2){
                    double balance = sAcc.checkBalance();
                    System.out.println(balance);
                }else if (action == 3){
                    sAcc.closeAccount();
                }else if (action == 4){
                    double amt = scan.nextDouble();
                    boolean success = sAcc.deposit(amt);
                    if (success){
                        //System.out.println(" true");
                    }else {
                        System.out.println("false");
                    }
                }else if (action == 5){
                    double amt = scan.nextDouble();
                    boolean success = sAcc.withdrawn(amt);
                    if (success){
                        System.out.println(" true");
                    }else {
                        System.out.println("false");
                    }
                }else if (action == 6){
                    int subMenu = scan.nextInt();
                    String number = scan.nextLine().strip();
                    boolean success = sAcc.openPromptPay(subMenu, number);
                    if (success){
                        System.out.println("true");
                    }else {
                        System.out.println("false");
                    }
                }
            }else if (bAC == 2){
                int action = scan.nextInt();
                if (action == 1){
                    fAcc.printInfo();
                }else if (action == 2){
                    double balance = fAcc.checkBalance();
                    System.out.println(balance);
                }else if (action == 3){
                    fAcc.closeAccount();
                }else if (action == 4){
                    double amt = scan.nextDouble();
                    boolean success = fAcc.deposit(amt);
                    if (success){
                        //System.out.println(" true");
                    }else {
                        //System.out.println("false");
                    }
                }else if (action == 5){
                    double amt = scan.nextDouble();
                    boolean success = fAcc.withdrawn(amt);
                    if (success){
                        System.out.println(" true");
                    }else {
                        System.out.println("false");
                    }
                }
            }else if (bAC == 3){
                int action = scan.nextInt();
                if (action == 1){
                    cAcc.printInfo();
                }else if (action == 2){
                    double balance = cAcc.checkBalance();
                    System.out.println(balance);
                }else if (action == 3){
                    cAcc.closeAccount();
                }else if (action == 4){
                    double amt = scan.nextDouble();
                    boolean success = cAcc.deposit(amt);
                    if (success){
                        System.out.println(" true");
                    }else {
                        System.out.println("false");
                    }
                }else if (action == 5){
                    double amt = scan.nextDouble();
                    boolean success = cAcc.withdrawn(amt);
                    if (success){
                        System.out.println(" true");
                    }else {
                        System.out.println("false");
                    }
                }
            }
            
            
        }
    }
}

/*
Harry Potter
001-1200
500
Hermione Granger
002-1100
500 1000.0
Ron Weasley
003-1111
500 1500.00
7
1 1
2 4 500.00
2 4 1000.00
2 1
3 5 500
3 5 1500
3 1
*/

/*
Harry Potter
001-1200
500
Hermione Granger
002-1100
500 1000.0
Ron Weasley
003-1111
500 1500.00
7
1 1
2 3
2 4 1000.00
2 1
3 3
3 5 1500
3 1
*/

/*

*/