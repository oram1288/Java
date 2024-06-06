package Week6;

public class TransactionFeeCheckingAccount extends CheckingAccount{
    private static final double FEE = 2.00;

    public TransactionFeeCheckingAccount(double interest) {
        super(interest);
    }

    public TransactionFeeCheckingAccount(double bal, double interest) {
        super(bal, interest);
    }

    public void chargeFee() {
        super.withdraw(FEE);
    }

    public void withdraw(double amount) {
        super.withdraw(amount + FEE);
    }

    public void deposit(double amount) {
        super.deposit(amount - FEE);
    }

    public String toString() {
        return (super.toString() + "Transaction Fee = " + FEE);
    }
}
