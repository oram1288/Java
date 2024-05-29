package Week4.Array;

import java.util.*;

public class ArrayPractice{
    public static void main(String[] args) {

        //Declaration
        int size = 5;
        int array1[] = new int[size];
        int array2[] = {109,20,310,140,250,460,270,680,90,10};
        // String string1 = "Hello";
        // char array3[] = {'H','e','l','l','o'};
        // String b[] = new String[size];

        // Scanner input = new Scanner(System.in);

        Arrays.sort(array2);
        for(int i = 0; i<array2.length;i++)
        {
            System.out.println(array2[i]);
           
        }
     //   System.out.println(array1.length);
     //   System.out.println(array2.length);
        for(int i = 0; i<array1.length;i++)
        {
         //   System.out.println("Enter an integer for index: " + i );
        //    array1[i]=input.nextInt();
        }
        for(int i = 0; i<array1.length;i++)
        {
          //  System.out.println(array1[i]);
           
        }
        for(int i = 0; i<array1.length;i++)
        {
           // System.out.println(array3[i]);
        }

       // SumAvg(array2);
    //    int x = 0;
   //    x = Increment(array2, x);
        for(int i = 0; i<array2.length;i++)
        {
    //       System.out.println(array2[i]);
        }
      //  System.out.println("x in main = " + x);

SQCU(array2);
        
    }
    public static void SumAvg(int[] arr)
    {
        int sum = 0;
        double Avg = 0.0;
        for(int i = 0; i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        Avg = sum/arr.length;
        System.out.println("Sum = " + sum + " Average = " + Avg);
    }
//2.	Java Method to Increment Every Element of the Array by One & Print Incremented Array

    public static int Increment(int[] arr, int x)
    {
        for(int i = 0; i<arr.length; i++){
            arr[i] += 1;
            x++;
    }
    for(int i = 0; i<arr.length;i++)
    {
       System.out.println(arr[i]);
    }
    System.out.println("x in method = " + x);
    return x;
}
//3.	Java Method to receive an Array, Store the Squares and cubes of these elements in new Arrays & Print those.

public static void SQCU(int arr[])
{
int squares[] = new int[arr.length];
int cubes[] = new int[arr.length];
 
        for (int i = 0; i < arr.length; i++) {
            squares[i] = arr[i] * arr[i];
            cubes[i] = arr[i] * arr[i] * arr[i];
        }
        for (int i = 0; i < arr.length; i++)
        {
           System.out.println(arr[i] + "\t\t" + squares[i] + "\t\t" + cubes[i]);
        }


}
}