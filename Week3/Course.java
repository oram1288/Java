public class Course {
    private String courseName;
    private Instructor inst;
    private TextBook tb;

    public Course(String cn, Instructor ins, TextBook tb)
    {
        this.courseName = cn;
        this.inst = ins;
        this.tb = tb;
    }
    public String getName() {
        return courseName;
    }
    public Instructor getInstructor() {
        return inst;
    }
    public TextBook getTextBook() {
        return tb;
    }
    public String toString()
    {
        return(this.courseName + ", TextBook:" + this.tb + " is taught by "+ this.inst);
    }
}
