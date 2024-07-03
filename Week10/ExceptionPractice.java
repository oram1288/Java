package Week10;

class ExceptionPractice
{
    public static void main(String args[])
    {
        try{
            System.out.println();
                System.out.println();
            int num1=30, num2=0;
            int output=num1/num2;
            System.out.println ("Result = " +output);
        }
        catch(ArithmeticException e){
            System.out.println (e.getMessage());
            e.printStackTrace();
            System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
        }
        System.out.println ("I am here now");
    }
}

// Multiple Catch Statements
class Example2{

    public static void main(String args[]){
        try{
            int a[]=new int[7];
            a[4]=30/0;  // try index of 6 instead of '4'
            System.out.println("First print statement in try block");
        }
        catch(ArithmeticException e){
            System.out.println("Warning: ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Warning: ArrayIndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Warning: Some Other exception");
        }
    System.out.println("Out of try-catch block..."); 
    }
}

// try block within another try block
class Nest{

    public static void main(String args[]){
        //Parent try block
    try{
        //Child try block1
        try{
            System.out.println("Inside block1");
            int b =45/0;
            System.out.println(b);
        }
        catch(ArithmeticException e1){
            System.out.println("Exception: e1");
        } 
        //Child try block2
        try{
            System.out.println("Inside block2");
            int b =45/0;
            System.out.println(b);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception: e2");
        }
        System.out.println("Just other statement");
    }
    catch(ArithmeticException e3){
            System.out.println("Arithmetic Exception");
        System.out.println("Inside parent try catch block");
    }
    catch(ArrayIndexOutOfBoundsException e4){
            System.out.println("ArrayIndexOutOfBoundsException");
        System.out.println("Inside parent try catch block");
    }
    catch(Exception e5){
            System.out.println("Exception");
        System.out.println("Inside parent try catch block");
    }
    System.out.println("Next statement..");
   }
}