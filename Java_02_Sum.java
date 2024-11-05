/*
Take two numbers and print the sum of both.
 */

import java.util.*;
public class Java_02_Sum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int var1= in.nextInt();
        System.out.println("Enter the number 2: ");
        int var2= in.nextInt();
        System.out.println("The of "+var1+" and "+var2+" is "+(var1+var2));
    }
}