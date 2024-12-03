public class Java_67_Insertion_Sort {
    public static void insertionSort(int []arr){
        int n= arr.length;
        for(int i=1; i<n;i++){
            int key= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }


//        print...
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int []arr={5,20,40,60,10,30};
        insertionSort(arr);
    }
}
