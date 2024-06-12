package Week7;

public class Dog extends Animal{
    
    Dog (String n) {
        super(n);
    }

    public void greet() {
        System.out.println("Woof Woog");
    }

    public void eat() {
        System.err.println("I eat bones");
    }
}
