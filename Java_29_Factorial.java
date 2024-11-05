import java.util.Scanner;

public class Java_29_Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= in.nextInt();
        int fact=1;
        for (int i=n;i>=1;i--){

            fact=fact*i;
            System.out.print(" "+i+"* ");
        }
        System.out.println(" ");
        System.out.println("The factorial of "+n+" is: "+fact);
    }
}