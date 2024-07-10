package Week10_FileHandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DemoSerialization {
    public static void main(String[] args) {
       // WriteObject();

       ArrayList<Employee> Emplist = new ArrayList<>();

       try{
        FileInputStream fin = new FileInputStream("EmpObject.txt");
        ObjectInputStream in = new ObjectInputStream(fin);

        Object Temp = null;

        while(true)
        {
            try{
            Temp = in.readObject();
            }
            catch(EOFException e)
            {
                break;
            }
            Emplist.add((Employee)Temp);
        }

        fin.close();
        in.close();
       }
       catch(Exception e)
       {
          e.printStackTrace(); 
       }

System.out.println(Emplist.toString());
       
        
    }
    public static void WriteObject()
    {
        Employee E1 = new Employee(1, "Ainee", "Malik", 1000);
        Employee E2 = new Employee(2, "B", "Z", 2000);
        Employee E3 = new Employee(3, "C", "X", 3000);
        Employee E4 = new Employee(4, "D", "Y", 5000);

        try{
            FileOutputStream fout = new FileOutputStream("EmpObject.txt");
            ObjectOutputStream Out = new ObjectOutputStream(fout);
            Out.writeObject(E1);
            Out.writeObject(E2);
            Out.writeObject(E3);
            Out.writeObject(E4);
            fout.close();
            Out.close();

        }
        catch(Exception e)
        {
           e.printStackTrace(); 
        }
    }
}