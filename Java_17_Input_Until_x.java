import java.util.Scanner;

/*
Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
 */
public class Java_17_Input_Until_x {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n;
        do {
            n = in.nextInt();
            sum = sum + n;
        }
        while (n != 'x');
        System.out.println(sum);
    }
}