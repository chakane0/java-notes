package NJIT_java.miscl;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str = "Hello World";
        String[] strArr = str.split(" ");
        for(int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

    }

    /* 
        (1) Use the split() function to seperate each word by space into an array.
        (2) Return the last element in the array with its length
     */
    public static int lengthOfLastWord(String s) {
        String[] strArr = s.split(" ");
        return strArr[strArr.length-1].length();
    }
    
}
