public class DemoGeneric {
    public static void main(String[] args) {
        // MyPoint<Double> dPoint = new MyPoint<>();
        // dPoint.setXY(1.5,2.6);
        // System.out.println(dPoint);

        // MyPoint<Integer> iPoint = new MyPoint<>();
        // iPoint.setXY(1,2);
        // System.out.println(iPoint);
        // genericDisplay(11);
        // genericDisplay("Hello world");
        // genericDisplay(5.4);

        GenericTest<Double> gt = new GenericTest<Double>(5.5);
        gt.display(3.3, "hello");
        gt.display(3.3, 1);
        gt.display(3.3, 4.4);

    }

    public static <T> void genericDisplay(T element)
    {
        System.out.println((element.getClass().getName() + " = " + element));

    }
    
}
