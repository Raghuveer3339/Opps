import java.util.Scanner;

public class CustomerDemo {
    private double balance;

    public CustomerDemo() {
        this.balance = 0.0;
    }

    public void addBalance(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully added " + amount + " to balance.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void addBalance(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully added " + amount + " to balance.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    protected void deductBalance(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully deducted " + amount + " from balance.");
        } else {
            System.out.println("Invalid deduction amount or insufficient funds.");
        }
    }

    void showBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    public static void main(String[] args) {
        CustomerDemo customer = new CustomerDemo();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposit amount (double): ");
        double doubleDeposit = scanner.nextDouble();
        customer.addBalance(doubleDeposit);

        System.out.print("Enter deposit amount (int): ");
        int intDeposit = scanner.nextInt();
        customer.addBalance(intDeposit);

        customer.showBalance();

        System.out.print("Enter amount to deduct: ");
        double deduction = scanner.nextDouble();
        customer.deductBalance(deduction);

        customer.showBalance();
        scanner.close();
    }
}
