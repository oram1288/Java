package Week7;

public interface AnimalInter {
    // you cannot have instance variables/attributes/fields here
    // no contaructors or other methods are allowed here
    // you can only have static final constants in your interface

    public static final double g = 10.0;

    public abstract void moveable();
    public abstract void sleep(); // dont need public abstract from here down
    public abstract void greet();
    public abstract void eat();
}
