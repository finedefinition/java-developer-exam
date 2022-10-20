package Lesson5;

public class BankAccount {
    BankAccount(int accountNumber, double amountBalance) {
        id = accountNumber;
        balance = amountBalance;
    }
    int id;
    double balance;
    double refill(double changeBalance) {
        double refillAmount = changeBalance + balance;
        return refillAmount;
    }
    double withdraw(double changeBalance) {
        double withdrawAmount = balance - changeBalance;
        return withdrawAmount;
    }

    public static void main(String[] args) {
        BankAccount b  = new BankAccount(12, 1000);
        System.out.println("Refill: " + b.refill(300) + " Withdraw: " + b.withdraw(100));
    }


}
