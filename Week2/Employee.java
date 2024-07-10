package Week2;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // no arguement
    public Employee() {
        this.id = 1;
        this.firstName = "John";
        this.lastName = "Smith";
        this.salary = 4500;
    }

    // para
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return (this.firstName + this.lastName);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public void raiseSalary(double percentage) {
        salary *= (1 + percentage / 100);
    }
    
    public String toString() {
        return (getName() + " has a salary " + this.salary );
    }
}
