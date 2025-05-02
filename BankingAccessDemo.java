class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    private void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println("Interest calculated: $" + interest);
    }

    public void showInterest() {
        calculateInterest();
    }
}

public class BankingAccessDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(10000);
        account.showInterest();
        // account.checkBalance(); // Not accessible outside package in real-world scenario
        // account.withdraw(500);   // Would require subclass or same package
    }
}
