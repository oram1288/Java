package Week4.Array;

public class person {
    private String fname;
    private String lname;

    public person(String fn, String ln){
        this.fname = fn;
        this.lname = ln;
    }

    public String getFname(){
        return fname;
    }

    public String getLname(){
        return lname;
    }

    public void setFname(String fname){
        this.fname = fname;
    }

    public void setLname(String lname){
        this.lname = lname;
    }
    
    public String toString(){
        return (this.fname + " " + this.lname);
    }
}
