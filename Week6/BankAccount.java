package Week6;

public class BankAccount{
    private double myBal;
    public BankAccount()
    {
        this.myBal = 0.0;
    }

    public BankAccount(double bal) 
    { 
        myBal = bal; 
    }
    public void setMyBal(double myBal) {
        this.myBal = myBal;
    }
    public double getMyBal() {
        return myBal;
    }

    public void deposit(double amount)
    {
        this.myBal = this.myBal + amount;
    }

    public void withdraw(double amount)
    {
        if(this.myBal>=amount)
        this.myBal = this.myBal - amount;
        else
        System.out.println("Do not have enough balance");


    }
    public String toString()
    {
        return ("Balance = " + this.myBal);
    }
}