package QAP1;

public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Call nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display the final times for t1 and t2
        System.out.println("Final time for t1: " + t1.toString());
        System.out.println("Final time for t2: " + t2.toString());
    }
}
