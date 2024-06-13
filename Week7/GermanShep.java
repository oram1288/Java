package Week7;

public class GermanShep extends Dog{
    GermanShep (String n) {
        super(n);
    }

    public void moveable(){}
    public void sleep(){}

    public void greet() {
        System.out.println("Woof Woog");
    }

    public void eat() {
        System.err.println("I eat bones");
    }
}
