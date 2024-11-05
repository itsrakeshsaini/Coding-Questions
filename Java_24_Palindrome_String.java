/*
To find out whether the given String is Palindrome or not.
It is a number that remains same after getting reverse.
 */
import java.util.Scanner;

public class Java_24_Palindrome_String{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        System.out.println(Palindrome(str));

    }
    static boolean Palindrome(String str)
    { int left =0, right= str.length()-1;
        while(left<right){
            if (str.charAt(left)==str.charAt(right)){
                return true;
            }
            left++;
            right--;
        }
        return false;
    }
}