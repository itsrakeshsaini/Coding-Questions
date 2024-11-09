/*

In this Problem we need to --
Insert an element in array.
Deletion an element in array.


Where arr-- array, a is number to insert, b is number to delete, and n is size of an array.
 */

import java.util.*;
public class Java_61_Insertion_Deletion_Arr {

    public static void insetionAtIndex(int arr[], int a, int pos, int m){
        int capacity= arr.length;
        if(m==capacity){
            System.out.println("As Array is static in nature so we cannot increase size during runtime!!!");
        }

        int index=pos-1;
        for(int i=capacity-2;i>=index;i--){
            arr[i+1]=arr[i];
        }
        arr[index]=a;

        System.out.println("Array after insertion: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void deletion(int arr[], int b, int n){
        int index=0;
        for(int i=0; i<n;i++){
            if(arr[i]==b){
                index=i;
                break;
            }
        }

        for(int j= index;j<n-1;j++){
            arr[j]=arr[j+1];
        }

        System.out.println("Array after deletion: ");
        for (int i=0; i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int []arr = {3,2,1,3,4,8};
        int m=7;
        int n=6;
        int pos=3;
        int a= 9;
        int b =2;
        insetionAtIndex(arr,a,pos,m);
        deletion(arr,b,n);
    }
}
