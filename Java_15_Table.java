/*
Take a number as input and print the multiplication table for it.
 */
import java.util.Scanner;

public class Java_15_Table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for table: ");
        int var1= in.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(var1+" * "+i+" = "+(var1*i));
        }
    }
}