/*
Write a program to print whether a number is even or odd, also take
input from the user.
 */
import java.util.Scanner;

public class Java_18_Even_Odd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int var1= in.nextInt();
        nature(var1);
    }
    static void nature(int var1)
    {
        if (var1/2==0)
        {
            System.out.println(var1+" is Even.!!");
        } else{
            System.out.println((var1+" is Odd.!!"));
        }
    }

}