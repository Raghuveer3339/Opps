interface Wallet {
    void addFunds(double amount);
    void spendFunds(double amount);
}

class DigitalWallet implements Wallet {
    private double balance;

    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void spendFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class WalletTest {
    public static void main(String[] args) {
        DigitalWallet myWallet = new DigitalWallet();
        myWallet.addFunds(1000);
        myWallet.spendFunds(300);
        myWallet.addFunds(200);
        myWallet.spendFunds(1000);

        System.out.println("Final Balance: " + myWallet.getBalance());
    }
}
