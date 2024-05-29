package Week4.Array;

import java.util.ArrayList;

public class ArrayListPrac {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>(5);
        ArrayList<person> list2 = new ArrayList<person>();

        list1.add("One");
        list1.add("Two");
        list1.add("Three");
        System.out.println("size of list1 = " + list1.size());
        System.out.println("size of list2 = " + list2.size());

        System.out.println(list1);
        for (int i = 0 ; i<list1.size(); i++){
            System.out.println(list1.get(i));
        }

        person p1 = new person("Maz", "Radwan");
        list2.add(p1);
        list2.add(new person("Elliott", "Butt"));
        System.out.println(list2);
        list2.add(1,new person("Cody", "Oram"));
        System.out.println(list2);
        System.out.println("size of list2 = " + list2.size());
        list2.set(2, p1);
        System.out.println(list2);
    }
}
