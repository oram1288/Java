package QAP1;

    // Account.java
public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account() {
        this.id = "Acc1";
        this.name = "John";
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return amount + balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            amount -= balance;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            another.balance += amount;
            System.out.println("$" + amount + " transferred from Account " + id + " to Account " + another.id);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    public String toString() {
        return("[id = " + this.id + ", balance = " + this.balance + "]");
    }
}

