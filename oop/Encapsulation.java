package oop;

public class Encapsulation {
    static class BankAccount {

        private double balance = 50000;

        // Getter
        public double getBalance() {
            return balance;
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        System.out.println(account.getBalance());

        account.deposit(5000);

        account.withdraw(2000);

        System.out.println(account.balance);
    }
}
