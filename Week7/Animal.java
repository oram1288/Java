package Week7;

public abstract class Animal implements AnimalInter, MarketInter, FunctionInter{
    // abstract key word is a non access modifier, you 
    // cannot instantiate your abstract class

    // can have attributes, instance and class both
    // Abstract can have constructors
    // can have methods both instance and static
    // can have abstract methods
    private String name;
    private static int count = 0;

    public Animal(String name) {
        this.name = name;
        count ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public void breath() {
        System.out.println("All animals can breath");
    }

    public abstract void greet();
    public abstract void eat();

    public String toString() {
        return ("Animal name = " + this.name + " Number of animals = " + count);
    }
}
