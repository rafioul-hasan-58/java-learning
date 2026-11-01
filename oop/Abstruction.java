
package oop;

// Abstract Parent Class
abstract class ATM {

    // Abstract method (no implementation)
    abstract void withdraw(double amount);

    // Concrete method (has implementation)
    public void checkBalance() {
        System.out.println("Checking your balance...");
    }
}

// Child Class
class MyATM extends ATM {

    private double balance = 50000;

    @Override
    void withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Withdrawn amount: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void showBalance() {
        System.out.println("Current balance: " + balance);
    }
}

// Main Class
public class Abstruction {

    public static void main(String[] args) {

        // Parent reference, Child object
        ATM atm = new MyATM();

        atm.checkBalance();

        atm.withdraw(5000);

        // Access child-specific method
        MyATM myATM = (MyATM) atm;
        myATM.showBalance();
    }
}
