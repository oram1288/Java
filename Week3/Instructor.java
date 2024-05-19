public class Instructor {
    private String lastName;
    private String firstName;
    private String officeNumber;

    public Instructor(String lname, String fname, String OffNum)
    {
        this.lastName = lname;
        this.firstName= fname;
        this.officeNumber = OffNum;
    }
    public Instructor(Instructor ins)
    {
        this.lastName = ins.lastName;
        this.firstName= ins.firstName;
        this.officeNumber = ins.officeNumber;
        
    }
    public void set(String lname, String fname, String OffNum)
    {
        this.lastName = lname;
        this.firstName= fname;
        this.officeNumber = OffNum;
    }

public String toString()
{
    return(this.firstName + " " + this.lastName + "(" + this.officeNumber+")");
}
}
