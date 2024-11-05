/*
 [Subtract the Product and Sum of Digits of an Integer]
 (https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/)
 */

public class Java_26_P_S {
    public static void main(String[] args) {
        int n=234;
        int sum=0, pro=1,result=0;
        while (n>0){
            int rem= n%10;
            n=n/10;
            sum=sum+rem;
            pro= pro*rem;
        }
        result=(pro-sum);
        System.out.println(result);
    }
}
