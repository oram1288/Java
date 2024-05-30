package Week4.Hash;

import java.util.*;

public class HashtablePrac {
    public static void main(String[] args) {
        
        // HASH
        Hashtable<word,String> ht1 = new Hashtable<>();

        word w1 = new word("Apple");
        word w2 = new word("Potatoe");
        word w3 = new word("Banana");

        ht1.put(w1," Its a healthy fruit");
        ht1.put(w2," Its an all carb vegtable");
        ht1.put(w2," Its an all carb, very healthy vegtable"); // will update previous one
        ht1.put(w3," Its a high energy fruit");

        String definition = ht1.get(w1);
        System.out.println(definition);
        definition = ht1.get(w2);
        System.out.println(definition);
        definition = ht1.get(w3);
        System.out.println(definition);

        System.out.println(ht1);

        // TO REMOVE
        ht1.remove(w2);

        System.out.println(ht1);

    }
}
