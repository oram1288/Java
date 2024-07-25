import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
         WriteDB();
         ReadDB();
        
        
    }
    public static void ReadDB()
    {
        ArrayList<Employee> EmpList = new ArrayList<>();

        String query = "Select * from employee";

        try{
            Connection con = DatabaseConnection.getcon();
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                Employee temp = new Employee();
                temp.setId(rs.getInt("id"));
                temp.setFirstName(rs.getString("first_name"));
                temp.setLastName(rs.getString("last_name"));
                temp.setSalary(rs.getDouble("salary"));
                EmpList.add(temp);
            }
            con.close();


        }
        catch(SQLException e)
        {
            e.printStackTrace();

        }
    
        System.out.println(EmpList.toString());

    }

    public static void WriteDB()
    {
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
