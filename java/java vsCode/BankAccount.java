public class BankAccount {
    // Field to store the account balance
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to check the current balance
    public double getBalance() {
        return balance;
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating a BankAccount object with an initial balance
        BankAccount account = new BankAccount(1000.00);

        // Displaying initial balance
        System.out.println("Initial Balance: $" + account.getBalance());

        // Depositing funds
        account.deposit(500.00);
        System.out.println("Current Balance: $" + account.getBalance());

        // Withdrawing funds
        account.withdraw(200.00);
        System.out.println("Current Balance: $" + account.getBalance());

        // Trying to withdraw more than available balance
        account.withdraw(1500.00);

        // Displaying final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
