import java.util.*;

import static java.util.Collections.swap;

public class Java_57_Reverse_array_subgroups {
    public static void reverse(int arr[],int n, int k){
        int i=0,a=0;
        while(i<n) {
            int[] temp = new int[k];
//            int []a1=new int[k];
            for (i = a; i < a + k; i++) {
                temp[i] = arr[i];
            }
            int a1 = 0;
            while (i < k) {
                a1 = temp[i];
                temp[i] = temp[k];
                temp[k] = a1;
                i++;
                k--;
            }
            a = a + k;
            System.out.println("Sub array reversed: ");
            for (i = 0; i < k; i++){
                System.out.println(temp[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int n= sc.nextInt();
        System.out.println("Enter Size of sub-array: ");
        int k= sc.nextInt();
        System.out.println("Enter the elements in array:  ");
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,n,k);
    }
}
