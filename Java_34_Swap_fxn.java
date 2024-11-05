import java.util.Scanner;

public class Java_34_Swap_fxn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a=12;
//        int b=45;
//        //Swap two numbers.
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println(a+" "+b);
        swap(23, 32);

    }
    static void swap(int a, int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The result is: "+a+" "+b);
    }
}