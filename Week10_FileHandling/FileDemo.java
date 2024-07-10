package Week10_FileHandling;

import java.io.*;
public class FileDemo{
    //File, Fileinput and output stream, reader and writer classes
    public static void main(String[] args) {

        // try{
        //     File file = new File("Javatest.txt");
        //     if(file.createNewFile())
        //     System.out.println("New File is created");
        //     else
        //     System.out.println("New File already exists");
        // }
        // catch(IOException e)
        // {
        //     e.printStackTrace();

        // }

        //to read and write text files we have FileReader and FileWriter classes

        try{
            FileWriter fw = new FileWriter("temp.txt");
            fw.write("This is file handling lecture");
            fw.close();

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Success");
        try{
            FileReader fin = new FileReader("temp.txt");
            int i;
            while((i=fin.read())!=-1)
            System.out.print((char)i);
            fin.close();
           
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("\nSuccess");


        //Fileinputstream and file outputstream to read and write binary files


 try{
    FileOutputStream fout = new FileOutputStream("Binary.txt");
    String s = " Canada is one of the biggest countries in the world";

    byte b[] = s.getBytes();
    fout.write(b);
    fout.close();
            
           
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("\nSuccess");

        try{
            FileInputStream fin = new FileInputStream("Binary.txt");
       
            int i;
            while((i=fin.read())!=-1)
            System.out.print((char)i);
            fin.close();
           
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("\nSuccess");
    }
}
