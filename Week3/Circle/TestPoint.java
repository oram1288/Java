package Circle;

public class TestPoint {
    public static void main(String[] args) {
        MyPoint P1 = new MyPoint(2, 4);

        System.out.println(P1);
        // P1.setXY(5, 10);
        // System.out.println(P1);

        // MyPoint P2 = new MyPoint(5, 10);
        // System.out.println(P1.distance(2, 4));
        // System.out.println(P1.distance(10, 20));

        System.out.println(P1.distance());
        System.out.println(P1.distance(0,0));
    }
}
