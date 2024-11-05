
import java.util.Scanner;

public class Java_32_function {

    /*
        access modifier return type(){
            //body;
            return statement;
        }
     */

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1= in.nextInt();
        System.out.print("Enter the number 2: ");
        int num2= in.nextInt();
        int sum = num1 +num2;
        System.out.println("The sum is: "+sum);
    }

    //    Return type:
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int num1= in.nextInt();
        System.out.print("Enter the number 2: ");
        int num2= in.nextInt();
        int sum = num1 +num2;
//        System.out.println("The sum is: "+sum); // in return type instead of this we return the value
        return sum;
    }

    // pass the value of numbers when you are calling the method in main()

    static int sum3(int a , int b){
        int sum= a+b;
        return sum;
    }




    public static void main(String[] args) {
//        sum(); //Non- return type function calling
//        int ans = sum2(); // return sum is of integer type so we store this in int ans.
//        System.out.println(ans);

        int ans=sum3(23,45);
        System.out.println(ans);

    }
}
