package Week6;

// SUPER - refers to its parent!

public class CheckingAccount extends BankAccount{
    private double myInterest;
    public CheckingAccount(double interest) {
      super();
      this.myInterest = interest;
      }
      public CheckingAccount(double amount, double interest)
      {
        super(amount);
        this.myInterest = interest;  
    }

    public void setMyInterest(double myInterest) {
        this.myInterest = myInterest;
    }

    public double getMyInterest() {
        return myInterest;
    }

    public void applyInterest() {
      //we have interest rate
      //we need to find interest on the current balance
      double currentInterst = (super.getMyBal() * this.myInterest/100);
      super.deposit(currentInterst);
    }
  
    public void withdraw(double amount){
        super.withdraw(amount);
        System.out.println("I am in Checking Account class");
    }

    public String toString(){
        return (super.toString() + " Interest rate = " + this.myInterest);
    }
    
}
