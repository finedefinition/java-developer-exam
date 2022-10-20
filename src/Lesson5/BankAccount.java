package Lesson5;

public class BankAccount {
    int id;
    double balance;

    BankAccount(int accountNumber, double amountBalance) {
        id = accountNumber;
        balance = amountBalance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(12, 1000.00);
        b.refill(100.00);
        b.withdraw(350.00);
    }

    void refill(double changeBalance) {
        System.out.println("Balance: " + balance);
        System.out.println("Refill: " + changeBalance);
        balance += changeBalance;
        System.out.println("New Balance: " + balance);
        System.out.println();

    }

    void withdraw(double changeBalance) {
        System.out.println("Balance: " + balance);
        System.out.println("Refill: " + changeBalance);
        balance -= changeBalance;
        System.out.println("New Balance: " + balance);
        System.out.println();
    }
}
