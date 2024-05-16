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
        return balance = (amount + balance);
    }

    public int debit(int amount) {
        if (amount <= balance) {
            amount -= balance;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Had a little trouble with this if statement, not sure if there is a simplier way of doing it.
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.balance += amount;
            System.out.println("$" + amount + " transferred from Account " + id + " to Account " + another.id);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return (int) balance;
    }

    public String toString() {
        return("Account [id = " + this.id + ", name = " + this.name + ", balance = " + this.balance + "]");
    }
}

