package Week1;

//1. Data Abstraction
//2. Data Encapsulation
public class Student {
    //atributes--fields--data members - -member fields
    private String FName; //-FName:String
    private String LName;
    private int age;
    private String RegNo;

    //behaviour methods
    //contstructors
    Student() {
        this.FName = "First Name";
        this.LName = "Last Name";
        this.age = 25;
        this.RegNo = "Not Registered";
    }
    //getter and setter methods
    //other methods
    //+display()
    public void display() {
        System.out.println(this.FName + " " + this.LName + " has age = " + this.age + " registration number = " + this.RegNo);
    }
}
