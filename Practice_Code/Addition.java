package Practice_Code;
// import java.util.Scanner;
import java.util.*;

public class Addition{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;
        System.out.println("Please enter the value of a: ");
        a = input.nextInt();
        System.out.println("Please enter the value of b: ");
        b = input.nextInt();

        int c = a + b;

        System.out.println(a + " + " + b + " = " + c);

        System.out.printf("%d + %d + %d", a,b,c);

        // float f = 2.5;
    }
}