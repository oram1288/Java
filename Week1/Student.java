package Week1;

//1. Data Abstraction
//2. Data Encapsulation
public class Student {
    //Instant variable/atributes--fields--data members - -member fields
    private String FName; //-FName:String
    private String LName;
    private int age;
    private String RegNo;

    private static int count = 0; // static or class variable
    // private static final int agelimit = 21;

    //behaviour methods
    //contstructors
    // no arguement constructor
    Student() {
        this.FName = "";
        this.LName = "";
        this.age = 0;
        this.RegNo = "";
        count++;
    }

    // parameter constructor 
    Student(String fn, String ln, int age, String rg) {
        this.FName = fn;
        this.LName = ln;
        this.age = age;
        this.RegNo = rg;
        count++;
    }

    public static void displayCount() {
        System.out.println("number count" + count); // can only access static data
    }
    //getter and setter methods
    //other methods
    //+display()
    public void display() {
        System.out.println(this.FName + " " + this.LName + " has age = " + this.age + " registration number = " + this.RegNo + "number count" + count);
    }
}
