package QAP1;

public class TestAccount {
    // TestAccount.java
    public static void main(String[] args) {
        // Create two accounts
        Account acc1 = new Account("Acc1", "John", 5000);
        Account acc2 = new Account("Acc2", "James", 4000);

        // Display balance of both accounts
        System.out.println("Balance of Acc1: $" + acc1.getBalance());
        System.out.println("Balance of Acc2: $" + acc2.getBalance());

        // Transfer $1000 from acc1 to acc2
        acc1.transferTo(acc2, 1000);

        // Display balance of both accounts after transfer
        System.out.println("Balance of Acc1 after transfer: $" + acc1.getBalance());
        System.out.println("Balance of Acc2 after transfer: $" + acc2.getBalance());
    }
}

