/*
Take 2 numbers as input and print the largest number.
 */
import java.util.Scanner;

public class Java_22_Largest_of_2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int var1= in.nextInt();
        System.out.println("Enter the num2: ");
        int var2=in.nextInt();
        Largest(var1, var2);
        /*
        //Method 2 using pre-defined library of java.
        int Max=Math.max(var1,var2);
        System.out.println(Max);
        */
    }

    //Method 1 to find geater number b/w two numbers using function.
    static void Largest(int var1, int var2)
    {
        if (var1>=var2){
            System.out.println(var1);
        }
        else{
            System.out.println(var2);
        }
    }
}
