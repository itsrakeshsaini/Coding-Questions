import java.util.Scanner;

public class Java_05_type_casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num= input.nextFloat();   //here we can give integer as well as float bcz float is greater than int
//       float num= input.nextInt();       //here we can give integer but not float bcz we take integer as next.input,
        //and output is always in float bcz our variable as float.
//        int num= input.nextInt(); //we can't give input as float here.
//        System.out.println(num);
//        int num= input.nextFloat(); //it will give error bcz int is smaller than float

//        how to convert int into float?
//        using Type casting in compatible type.
//        int num= 67.56f;     // it will give error now we do type casting.

//        int num= (int)(67.56f);
//        System.out.println(num);

//        automatic type promotion in expression.

//        int a =257;
//        byte b= (byte)a;  // it gives 257% 256 =1; bcz byte can store maximum 256 .
//        System.out.println(b);

//        byte a=40;
//        byte b =50;
//        byte c= 100;
//        int d= a*b/c;  // here ques is a and b is in byte and after * these it becomes 2000 and
//        // it easily exceeds the byte limit to handle this type of situations
//        // java automatically promotes the byte result of intermediate expression into integer
//        System.out.println(d);

//        byte e=40;
//        e= e*2;  // this will give you an error bcz e*2 is an integer and then how it can assign into a byte e.
        // we cant do this without doing casting.
//
//        int number ='a';   //Automatic eskilan value
//        System.out.println(number);

//        CONCLUSION
//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i= 50000;
//        float f= 5.67f;
//        double d=0.1234;
//        double result = (f*b)+(i/c)-(d*s);
        //float + int -double = the larger one that is double so the final output must in double.
//        System.out.println((f*b)+" , "+(i/c)+" , "+(d*s));
//        System.out.println(result);

        //(f*b) float * byte converts into float.
        //(i/c) int / char converts into integer.
        //(d*s) double * short converts into double.
    }
}
