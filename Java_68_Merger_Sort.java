public class Java_68_Merger_Sort {

    public static void merge(int arr[], int left, int mid, int right){
//       intialize size of two half temporary arrays...
        int n1= mid-left+1;
        int n2= right-mid;

//        create temp array for left and right array..
        int []l= new int[n1];
        int []r= new int[n2];

//        copy data in both arrays...
        for(int i=0;i<n1;i++){
            l[i]= arr[left+i];
        }

        for(int j=0; j<n2;j++){
            r[j]= arr[mid+1+j];
        }

//        Merge temp arrays with sorting...
        int i=0, j=0;  // two subarrays intial index.
        int k = left ; // inital index of merged array.

        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                arr[k]=l[i];
                i++;
            }else{
                arr[k]=r[j];
                j++;
            }
            k++;
        }

//        copy remaining elements...
        while(i<n1){
            arr[k]=l[i];
            i++;
            k++;
        }

        while (j<n2){
            arr[k]= r[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int []arr, int left, int right){
        if(left<right){
            int mid= left+(right-left)/2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);


        }
    }

    public static void print(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }



    public static void main(String[] args) {
        int []arr= {5, 20, 10,30, 10, 40, 2};
        int left=0;
        int right= arr.length-1;

        mergeSort(arr, left, right);
        print(arr);

    }
}
