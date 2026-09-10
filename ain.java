// package Problem1;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Withdraw method
    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Withdrawal cannot be completed."
            );
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful.");
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Remaining balance: " + balance);
    }
}

public class main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount("ACC12345", 5000);

        try {

            // Attempt withdrawal
            account.withdraw(6000);

        } catch (InsufficientBalanceException e) {

            System.out.println("Transaction Failed!");
            System.out.println(e.getMessage());
        }
    }
}
