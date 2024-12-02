public class Java_64_Search_in_Infinite_SortedArray {

    public static int binary(int []arr, int k, int low, int high){
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>k){
                high= mid-1;
            } else if (arr[mid]<k) {
                low= mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int position(int []arr, int k){
        if(arr[0]==k){
            return 0;
        }
        int i=1;
        while(arr[i]<k){
            i=i*2;
        }
        if(arr[i]==k){
            return i;
        }else {
            return binary(arr, k, i/2+1, i-1);
        }
    }

    public static void main(String[] args) {
        int []arr= {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170,199,232,253,264, 345,564,765,865};
        int k= 90;
        System.out.println(position(arr,k));
    }
}
