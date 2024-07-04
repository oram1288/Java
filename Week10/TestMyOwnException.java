package Week10;

public class TestMyOwnException {

    public static void Empage (int age) throws MyOwnException {
        if (age < 0) {
            throw new MyOwnException("Age cannot be less than 0");
        } else {
            System.out.println("Age is valid");
        }
    }
    public static void main(String[] args) {
        try {
            Empage(-2);
        } catch (MyOwnException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
