import java.util.Scanner;

public class Java_04_input_primitives {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter some input: ");
        int rollno = input.nextInt();
        System.out.println("Your roll no is " + rollno);
        // name
        System.out.print("Write your first name: ");
        String name =input.next();
        System.out.print("Your name is: " + name);


        //int a =10
        // basically 10 is a literal here.
        // a is identifier and Class name , main all are identifier.
        // if we write million than comma not to be put
        // int a= 234,000,000 it is wrong instead in place of comma out _ it is ignored there
        // int a = 234_000_000; it will run.
    }
}