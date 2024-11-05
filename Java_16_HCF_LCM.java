/*
Take 2 numbers as inputs and find their HCF and LCM.
 */
import java.util.Scanner;

public class Java_16_HCF_LCM {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int a= in.nextInt();
        int b= in.nextInt();
        int HCF=HCF(a,b);
        System.out.println("HCf is: "+HCF);
        int LCM=LCM(a,b);
        System.out.println("LCM is: "+LCM);

    }
    //fxn for finding hcf
    static int HCF(int a, int b)
    {
        int i=1;
        int HCF=0;
        while(i<=a||i<=b)
        {
            if (a%i==0&&b%i==0)
            {
                HCF=i;
            }
            i++;
        }
        return HCF;


//        for(i=1;i<=a||i<=b;i++)
//        {
//            if (a%i==0&&b%i==0)
//            {
//                HCF=i;
//            }
//        }
//        System.out.println("THe hcf is: "+HCF);
    }
    //LCM using HCF
    static int LCM(int a,int b)
    {
        int LCM=(a*b)/HCF(a,b);
        return LCM;
    }

    //LCM using normal method:

}