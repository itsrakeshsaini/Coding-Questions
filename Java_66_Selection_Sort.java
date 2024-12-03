public class Java_66_Selection_Sort {
    public static void selectionSort(int []arr){
        int n= arr.length;
        for(int i=0; i<n-1;i++){
            int min_index= i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
//            Swap min_index element with current element...
            int temp= arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }

//        print ....
        for(int i=0; i<n ;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int []arr= {3,2,1,3,2,1,0};
        selectionSort(arr);
    }
}
