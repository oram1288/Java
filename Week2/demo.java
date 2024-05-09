package Week2;

public class demo {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.toString());

        Circle c2 = new Circle(5.0);
        System.out.println(c2);
        Circle c3 = new Circle("yellow");
        System.out.println(c3);
        Circle c4 = new Circle(7.0, "Pink");
        System.out.println(c4);

        Circle c5 = new Circle(c2);
        System.out.println(c5);

        c2.setColor("orange");
        c5.setColor("golden");

        System.out.println("c2: " + c2);
        System.out.println("c5: " + c5);
    
        System.out.println("c5 color is " + c5);

        // System.out.println(c1.getRadius());
        // System.out.println(c2.getRadius());
        // System.out.println(c3.getRadius());
        // System.out.println(c4.getRadius());

        // System.out.println(c1.getArea());
        // System.out.println(c2.getArea());
        // System.out.println(c3.getArea());
        // System.out.println(c4.getArea());


    }
}
