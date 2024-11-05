/*
Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions)
 */
import java.util.Scanner;

public class Java_21_Use_if_Cond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int var1= in.nextInt();
        System.out.println("Enter the num2: ");
        int var2= in.nextInt();
        System.out.println("Enter the operator(+,-,*,/): ");
        char operator= in.next().trim().charAt(0);
        calculate(var1,var2,operator);
    }
    static void calculate(int var1, int var2, char operator)
    {
        if (operator=='+'){
            System.out.println("The sum is: "+var1+var2);
        } else if (operator=='-') {
            System.out.println("The substraction is: "+(var1-var2));
        } else if (operator=='*') {
            System.out.println("The multiply is: "+var1*var2);
        }
        else if (operator=='/'){
            if (var2!=0){
                System.out.println("The division is: "+var1/var2);
            }
            else {
                System.out.println("this operation is not possible!! bcz var2=0");
            }
        }
        else {
            System.out.println("Enter the correct operator!!!: ");
        }
    }
}