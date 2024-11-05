public class Java_12_Ques_Repeating_digit {
    public static void main(String[] args) {
        /*
            n%10 gives the last value .
            n/10 removes the last value .
         */

        //Q. let n =13839, and then find how many times 3 is occuring in this?
        int n= 13839;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==3){
                count++;
            }
            n=n/10;
        }
        System.out.println("3 occurs " + count + " times in 13839");
    }
}