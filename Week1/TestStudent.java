package Week1;

public class TestStudent {
    public static void main(String[]args) {

        
        Student S1 = new Student("Cody", "Oram", 25, "CS100");
        
        Student S2 = new Student("Jen", "Loveless", 23, "CS200");
        
        Student S3 = new Student("Logan", "Oram", 21, "CS300");
        

        S1.display();
        S2.display();
        S3.display();

        Student.displayCount();
    }
}
