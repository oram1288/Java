package Week6;

public class FeeAccount extends BankAccount{
    private static final double FEE = 4.00;

    // override our deposit and withdraw methods of the parent BankAccount class
    // we need to change fee on each transaction

    public FeeAccount() {
        super();
    }

    public FeeAccount (double amount) {
        super(amount);
    }

    public void withdraw(double amount) {
        super.withdraw(amount + FEE);
    }

    public void deposit(double amount) {
        super.deposit(amount - FEE);
    }

    public void test() {

    }

    public String toString() {      // OVERRIDING
        return ("Fee: $" + FEE);
    }
}
