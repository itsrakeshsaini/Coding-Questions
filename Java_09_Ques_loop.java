import java.util.Scanner;

public class Java_09_Ques_loop {
    public static void main(String[] args) {
        //Q. find the maximum of any two or more than 2 integer.
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the 3 integers to compare: ");
        int a =in.nextInt();
        int b =in.nextInt();
        int c =in.nextInt();
        //Method 1:


//        int max= a;
//        if(b>max){
//            max=b;
//        }
//        if (c>max){
//            max=c;
//        }
//        System.out.println(max);

        //Method 2:


//        int max;
//        if(a>b){
//            max=a;
//        } else if (b>c) {
//            max=b;
//        }else {
//            max=c;
//        }
//        System.out.println(max);

        // NEW Method


//        int max=Math.max(a,b);    //for two numbers
        int max=Math.max(c,Math.max(a,b));  //for three numbers.
        System.out.println(max);
    }
}
