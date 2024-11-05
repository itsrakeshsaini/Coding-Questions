import java.util.Scanner;

public class Java_14_Calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //Take input from user till user does not press X or x
        float ans=0;
        while (true){
            //Take the operator as input.
            System.out.print("Enter the operator: ");
            char op = in.next().trim().charAt(0);

            if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                //input two numbers.
                System.out.print("Enter Two numbers: ");
                float num1= in.nextInt();
                float num2= in.nextInt();
                if (op=='+'){
                    ans=num1+num2;
                }
                if (op=='-'){
                    ans=num1-num2;
                }
                if (op=='*'){
                    ans=num1*num2;
                }
                if (op=='/'){
                    if(num2!=0){
                        ans= num1/num2;
                    }
                }
                if (op=='%'){
                    ans=num1%num2;
                }
            } else if (op=='X' || op=='x') {
                break;
            }else {
                System.out.println("Invalid operator!!");
            }
            System.out.println("The ans is: "+ans+" ");
        }
    }
}