import java.util.Scanner;
public class Java_13_Ques_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the number: ");
        int n=sc.nextInt();
        int ans=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            ans = ans*10+rem;
        }
        System.out.println("The reverse of given number is "+ans+" ");
    }
}