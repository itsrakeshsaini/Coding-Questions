import java.util.Scanner;

public class Java_07_for_loops {
    public static void main(String[] args) {

        /*
          Syntax of for loop:
          for(initialisation; condition; increment/decrement){
           //body;
          }

          Q. print no 1 to 5;
         */
//        for (int num = 1; num <= 5; num += 1) { //num++ = num+=1 and num+=2 means value increased by 2.
//            System.out.println(num);
//        }
        //taking input from user and print odd number upto n.
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        for (int num = 1; num <=n ; num+=2) {
            System.out.println(num + " ");
        }
    }
}
