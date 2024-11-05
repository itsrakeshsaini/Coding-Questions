import java.util.Scanner;

public class Java_11_Ques_Fibonacci {
    public static void main(String[] args) {
        /*
            Fibonacci series is series of sum of two previous two number.
            0,1,1,2,3,5,8,13,....
         */
        // Q. let a=0; b=1 and n=7 then find the nth fibonacci number?

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=n){
            int temp = b;
            b = b+a;
            a= temp;
            count++;
        }
        System.out.println(b);
    }
}