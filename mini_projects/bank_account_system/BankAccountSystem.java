import java.util.Scanner;

abstract class BankAccount {
    private int balance;

    void deposit(int money) {
        this.balance += money;
    }
    abstract void withdraw(int money);
    int checkBalance() {
        return this.balance;
    }
    void setBalance(int balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    @Override
    void withdraw(int money) {
        if ((checkBalance() - money) < 1000) {
            System.out.println("Money cannot be withdrawn as the balance can not be less than 1000 !!");
        }
        else {
            System.out.println(money + " rupees is withdrawn from the Savings account");
            setBalance(checkBalance() - money);
        }
    }
}

class CurrentAccount extends BankAccount {
    @Override
    void withdraw(int money) {
        if ((checkBalance() - money) < -10000) {
            System.out.println("Money cannot be withdrawn as the overdraft limit is 10000 rupees !!");
        }
        else {
            System.out.println(money + " rupees is withdrawn from the account");
            setBalance(checkBalance() - money);
        }
    }
}

public class BankAccountSystem {
    static int inputMoney(Scanner sc) {
        while (true) {
            try {
                System.out.print("Enter the amount of money in rupees: ");
                int money = sc.nextInt();
                if (money < 1) {
                    throw new Exception();
                }
                sc.nextLine();
                System.out.println();
                return money;
            }
            catch (Exception e) {
                System.out.println("Invalid input\n");
                sc.nextLine();
                continue;
            }
        }
    }

    static void work(String x, SavingsAccount SA, CurrentAccount CA, Scanner sc) {
        System.out.println("You have selected " + x + " account.\n");
        int choice2 = 0;
        while (true) {
            System.out.println("- Enter 1 for Deposit Money");
            System.out.println("- Enter 2 for Withdraw Money");
            System.out.println("- Enter 3 for Check balance");
            System.out.println("- Enter 4 for Exit");
            try {
                System.out.print("Enter your choice: ");
                choice2 = sc.nextInt();
                if ((choice2 != 1) && (choice2 != 2) && (choice2 != 3) && (choice2 != 4)) {
                    throw new Exception();
                }
                sc.nextLine();
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Invalid input\n");
                sc.nextLine();
                continue;
            }   

            if (choice2 == 1) {
                int money = inputMoney(sc);
                
                if (x.equals("Savings")) {
                    SA.deposit(money);
                }
                else {
                    CA.deposit(money);
                }
                System.out.println(money + " rupees deposited to your " + x + " Account\n");
            }
            
            else if (choice2 == 2) {
                int money = inputMoney(sc);
                if (x.equals("Savings")) {
                    SA.withdraw(money);
                }
                else {
                    CA.withdraw(money);
                }
                System.out.println();
            }

            else if (choice2 == 3) {
                if (x.equals("Savings")) {
                    System.out.println("Saving account has: " + SA.checkBalance() + " rupees\n"); 
                }
                else {
                    System.out.println("Current account has: " + CA.checkBalance() + " rupees\n");
                }
            }

            else {
                System.out.println("Exiting the " + x + " Account\n");
                // sc.nextLine();
                break;
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SavingsAccount SA = new SavingsAccount();
        CurrentAccount CA = new CurrentAccount();
        System.out.println("Welcome to Bank Account System");
        
        while (true) {
            System.out.println("Choose account type: ");
            System.out.println("- Enter 1 for Savings Account");
            System.out.println("- Enter 2 for Current Account");
            System.out.println("- Enter 3 for Exit");
            int choice = 0;
            try{
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                if ((choice != 1) && (choice != 2) && (choice != 3)) {
                    throw new Exception();
                }
                sc.nextLine();
                System.out.println();
            }
            catch (Exception e) {
                System.out.println("Invalid input\n");
                sc.nextLine();
                continue;
            }
            if (choice == 1) {
                work("Savings", SA, CA, sc);
            }   
            else if (choice == 2) {
                work("Current", SA, CA, sc);
            }
            if (choice == 3) {
                System.out.println("Thanks for using Bank Account System");
                break;
            }
        }
        sc.close();
    }
}