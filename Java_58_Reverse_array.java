import java.util.*;
public class Java_58_Reverse_array {
    public static void reverseArray(int arr[], int start, int end, int n){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0; i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n= sc.nextInt();
        int []arr= new int[n];
        System.out.println("Enter elements in array:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end= n-1;
        reverseArray(arr, start, end, n);
    }
}