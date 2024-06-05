package Week6;

public class Demo {
    public static void main(String[] args) {
        BankAccount BA1 = new BankAccount(0.0);
        Object BA2 = new BankAccount();
        System.out.println(BA1);
        BA1.setMyBal(1000.00);
        System.out.println(BA1);
        BA1.deposit(1050);
        System.out.println(BA1);
        BA1.withdraw(1000);
        System.out.println(BA1);
        BA1.withdraw(5000);
        System.out.println(BA1);

        CheckingAccount CA1 = new CheckingAccount(0.5);
        System.out.println(CA1);
        CheckingAccount CA2 = new CheckingAccount(0.3);
        System.out.println(CA2);
        
        TransactionFeeCheckingAccount TFCA = new TransactionFeeCheckingAccount(100, 04);
        System.out.println(TFCA);
        TFCA.chargeFee();
        System.out.println(TFCA);
    }
}
