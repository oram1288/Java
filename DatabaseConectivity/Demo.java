import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        ArrayList<Employee> Emplist = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int option = 0;

        while(option!=-1)
        {
            System.out.println("Enter Employee ID:");
            int id = in.nextInt();
            in.nextLine();
            System.out.println("Enter Employee First Name:");
            String fn = in.nextLine();
            System.out.println("Enter Employee Last Name:");
            String ln = in.nextLine();
            System.out.println("Enter Employee Salary: ");
            double sal = Double.parseDouble(in.nextLine());
            Emplist.add(new Employee(id,fn,ln,sal));
            System.out.println("Press -1 to exit or any other number to enter new employee");
            option = in.nextInt();
            in.nextLine();

        }

        String query = " INSERT INTO employee (id, first_name, last_name, salary) " + "Values (?,?,?,?)";

        for(int i = 0; i <Emplist.size();i++)
        {
            try{
                Connection con = DatabaseConnection.getcon();
                PreparedStatement statement = con.prepareStatement(query);
                statement.setInt(1,Emplist.get(i).getID());
                statement.setString(2,Emplist.get(i).getFirstName());
                statement.setString(3,Emplist.get(i).getLastName());
                statement.setDouble(4,Emplist.get(i).getSalary());
                int updateRow = statement.executeUpdate();
               System.out.println(updateRow);
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println(Emplist.toString());




        
    }
}
