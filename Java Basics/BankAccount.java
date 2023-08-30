

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public void withdrawal(int amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Withdrawal amount is greater than current balance");
        }
        balance -= amount;
        System.out.println(amount + " has been withdrawn successfully");
    }
    public class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
       public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdrawal(500);
            account.withdrawal(700);
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
