package Circle;

public class TestCircle {
    public static void main(String[] args) {
        MyCircle C1 = new MyCircle();
        
        System.out.println(C1);
        System.out.println(C1.getArea());
        System.out.println(C1.getCircumference());

        MyCircle C2 = new MyCircle(4,8,2);
        System.out.println(C1.distance(C2));
    }
}
