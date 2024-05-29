package Week4;

public class StringPrac {
    public static void main(String[] args) {
        // CHARACTER CLASS
        // char c[] = {};
        // char c1 = 'A';

        // @SuppressWarnings("removal")
        // Character C1 = new Character('b');
        
        // STRING
        String string1 = "welcome to java"; // 'A'
        // String s2 = new String();
        // String s3 = new String("welcome to java again");

        // EQUALS
        String s1 = new String("welcome");
        String s2 = "Welcome";

        System.out.println(s1.equals(s2)); // 
        System.out.println(s1==s2); // 

        // LENGTH
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));

        // CONCAT
        String s3 = s1.concat(s2);
        System.out.println(s3);

        // SUB-STRING
        String s4 = string1.substring(8, 10);
        System.out.println(s4);

        String s5 = string1.substring(8);
        System.out.println(s5);
    }

    
}
