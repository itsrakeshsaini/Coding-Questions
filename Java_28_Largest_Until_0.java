import java.util.Scanner;

public class Java_28_Largest_Until_0 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int ans=0;
        while (true){
            n= in.nextInt();
            if (n!=0){
                if (n>=ans){
                    ans=n;
                }
            }
            System.out.print(ans+" ");
        }
    }
}