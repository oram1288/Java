public class GenericTest<T> {
    private T side;

    GenericTest(T s)
    {
        this.side = s;
    }

    public<U> void display(T s, U a)
    {
        U temp = a;
        System.out.println("Instance variable " + this.side);
        System.out.println("Local Type Parameter " + temp);
        this.side = s;
        System.out.println("Instance variable updated " + this.side);

    }
}
