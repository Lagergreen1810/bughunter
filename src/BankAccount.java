/* Skriv en klasse til at håndtere bankkonti */

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }
}
    double balance = 1000;

    void main() {
        BankAccount account = new BankAccount(1000);
        withdraw(1200);
        deposit(100);
        IO.println(balance);
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

