package Week7;

public class Cat extends Animal{
    private String species;

    public Cat(String n) {
        super(n);
        this.species = "Siamese";
    }

    public void greet() {
        System.out.println("Meow Meow");
    }

    public void eat() {
        System.err.println("I eat meat");
    }

    public void moveable(){}
    public void sleep(){}

    public String toString() {
        return (super.toString() + "Species = " + this.species);
    }
}
