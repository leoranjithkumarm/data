class BankAccount {
    // Fields
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Static field for bank name
    private static String bankName = "Global Bank";

    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Non-Static Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Non-Static Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Static Method to get the bank name
    public static String getBankName() {
        return bankName;
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Creating BankAccount objects
        BankAccount account1 = new BankAccount("123456", "Alice Smith", 1000.0);
        BankAccount account2 = new BankAccount("654321", "Bob Johnson", 500.0);

        // Performing deposit and withdrawal operations
        account1.deposit(200.0);
        account1.withdraw(150.0);

        account2.deposit(300.0);
        account2.withdraw(700.0);

        // Displaying the name of the bank
        System.out.println("Bank Name: " + BankAccount.getBankName());
    }
}
