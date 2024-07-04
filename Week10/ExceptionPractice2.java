package Week10;

public class ExceptionPractice2 {

    // try and catch
    // throw
    // throws
    // finally 

    public static void checkEligibility (int age, int weight) {
        if (age < 12 && weight < 40) {
            throw new ArithmeticException("Stduent is not eligible for registration");
        } else {
            System.out.println(" Student entry is valid");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to the registration process");
        try {
            checkEligibility(10, 39);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

