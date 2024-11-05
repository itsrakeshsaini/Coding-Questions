/*
Take name as input and print a greeting message for that particular name.
 */
import java.util.Scanner;

public class Java_19_Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name= in.next();
        Greeting(name);
    }
    static void Greeting(String name)
    {
        System.out.println("Hello!! "+name);
    }
}