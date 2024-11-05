
import java.util.Scanner;

public class Java_33_StringExample {

    //    static String greet(){
//        String greeting = "How are you. ";
//        return greeting;
//    }
    //we can also pass parameters in string also.
    static String myGreet(String name) {
        String message="Hello "+name;
        return message;
    }

    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name= in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }
}
