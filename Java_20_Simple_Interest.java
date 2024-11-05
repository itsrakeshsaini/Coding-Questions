/*
Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest.
 */

import java.util.Scanner;

public class Java_20_Simple_Interest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principle amount: ");
        int var1= in.nextInt();
        System.out.println("Enter the time period in years: ");
        int var2=in.nextInt();
        System.out.println("Enter the rate of interest in percentage: ");
        int var3= in.nextInt();
        Interest(var1, var2,var3);

    }
    static void Interest(int var1,int var2 , int var3)
    {
        int SimpleInt = var1*(1+(var2*var3));
        System.out.println("The simple interest is: "+SimpleInt);
    }

}