public class Demo {
    public static void main(String[] args) {

        Instructor Ainee = new Instructor("Malik", " Qurratulain", "CSD200");
        System.out.println(Ainee);
        TextBook java = new TextBook("Java Illuminated", "Anderson", "jones & barlett");
        System.out.println(java);

        Course AdvanceJava = new Course("Advance Programming using Java", Ainee, java);
        System.out.println(AdvanceJava);

    }
}
