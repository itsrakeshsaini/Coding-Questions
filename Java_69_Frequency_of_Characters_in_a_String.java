/*

Task:
Find count of frequencies of characters (in sorted order) in a string of lower case alphabates...


 */


public class Java_69_Frequency_of_Characters_in_a_String {

    public static void freqCount(String str){

        int []count = new int[26];
        for(int i=0; i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }

        for(int i=0; i<26;i++){
            if(count[i]>0){
                System.out.println((char)(i+'a')+": "+count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        freqCount(str);

    }
}
