package QAP1;

    // Account.java
public class Account {
    private String id;
    private double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void transfer(Account destination, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            destination.balance += amount;
            System.out.println("$" + amount + " transferred from Account " + id + " to Account " + destination.id);
        } else {
            System.out.println("Transfer failed: Insufficient funds");
        }
    }
}

