
/*
Input a year and find whether it is a leap year or not.
 */

import java.util.Scanner;

public class Java_01_leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int var1= in.nextInt();
        Leap(var1);
    }
    static void Leap(int var1)
    {
        if (var1%4==0)
        {
            System.out.println("It is a leap year!!");
        }else {
            System.out.println("It is not a leap year.!!");
        }
    }
}