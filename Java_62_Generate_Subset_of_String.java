/*
Given a String need to find all subsets using recursion.

concept --
made 2 recursive calls - 1 is for not including the element and 2nd is including the element.

 */


import java.util.*;
public class Java_62_Generate_Subset_of_String {

    public static int subset(String s, String curr, int i){
        if(i== s.length()){
            System.out.println(curr);
            return 0;
        }

        subset(s, curr, i+1);
        subset(s, curr+s.charAt(i), i+1);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s= sc.nextLine();
        String curr=" ";
        int i=0;
        subset(s, curr, i);
    }
}
