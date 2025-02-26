import java.util.Scanner;

class Atm {
    Scanner sc = new Scanner(System.in);
    int pin;
    int balance;

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public void setAmt(int balance) {
        this.balance = balance;
    }

    public int getAmt() {
        return balance;
    }

    public void setDep(int deposit) {
        balance += deposit;
    }

    public void setWith(int withdraw) {
        if (withdraw > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= withdraw;
            System.out.println("Withdrawal successful!");
        }
    }

    public void print() {
        System.out.println("\nEnter any of the following options:");
        System.out.println("1. Check Current Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public boolean validatePin() {
        System.out.print("Enter your 4-digit PIN: ");
        int enteredPin = sc.nextInt();
        if (enteredPin == getPin()) {
            return true;
        } else {
            System.out.println("Incorrect PIN! Try again.");
            return false;
        }
    }

    public void checking(int n) {
        if (!validatePin()) return; 

        while (true) {
            if (n == 1) {
                System.out.println("Current balance: " + getAmt());
            } else if (n == 2) {
                System.out.print("Enter amount to deposit: ");
                int depo = sc.nextInt();
                setDep(depo);
                System.out.println(" New Balance: " + getAmt());
            } else if (n == 3) {
                System.out.print("Enter amount to withdraw: ");
                int with = sc.nextInt();
                setWith(with);
                System.out.println("Updated Balance: " + getAmt());
            } else {
                System.out.println("Thank you!");
                return; 
            }
            print(); 
            n = sc.nextInt();
        }
    }
}

public class Que1 {
    public static void wlcm() {
        System.out.println("\nEnter any of the following options:");
        System.out.println("1. Create Account");
        System.out.println("2. Existing Account");
        System.out.println("3. Exit");
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        Scanner sc = new Scanner(System.in);

        while (true) {
            wlcm();
            int a = sc.nextInt();

            if (a == 1) {
                int pin;
                while (true) {
                    System.out.print("Set PIN (must be 4 digits): ");
                    pin = sc.nextInt();
                    if (pin >= 1000 && pin <= 9999) break;
                    System.out.println("Error: PIN should be exactly 4 digits!");
                }

                atm.setPin(pin);
                System.out.print("Enter the Amount: ");
                int amount = sc.nextInt();
                atm.setAmt(amount);
                System.out.println("Account Created Successfully!");
            } else if (a == 2) {
                atm.print();
                int b = sc.nextInt();
                atm.checking(b);
            } else {
                System.out.println("Thank you Visit again!!");
                
            }
        }
    }
}
