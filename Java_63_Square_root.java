public class Java_63_Square_root {

//    Naive approach...
//    public static int sqr(int k){
//        int i=1;
//        while(i*i<=k){
//            i++;
//        }
//        return i-1;
//    }

//    efficient approach...
//    use concept of binary search -- do check for k/2  and if that k/2*k/2>k then high = k/2-1;

    public static int sqr(int k){
        int low=0, high=k;
        while(low<=high){
            int mid= (low+high)/2;
            if(mid*mid>k){
                high= mid-1;
            } else if (mid*mid<k) {
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int k=25;
        System.out.println(sqr(k));
    }
}
