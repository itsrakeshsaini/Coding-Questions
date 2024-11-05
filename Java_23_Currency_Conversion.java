/*
Input currency in rupees and output in USD.
 */
import java.util.Scanner;

public class Java_23_Currency_Conversion {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter currency in rupees to convert in USD: ");
        int var1= in.nextInt();
        System.out.println("Rs"+var1+" = "+(var1*0.013)+"USD");
    }
}
