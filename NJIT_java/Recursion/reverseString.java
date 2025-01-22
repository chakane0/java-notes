package NJIT_java.Recursion;
import java.util.List;
import java.util.ArrayList;
public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        List<Character> reversed = reverseStr(s);
        // System.out.println(reversed);

        char[] r = reverseStr2(s); 
        System.out.println(r);
        
        
    }

    // approach 1
    public static void reverse(char[] s, int idx, List<Character> output) {
        if(idx < 0) return;
        output.add(s[idx]);
        reverse(s, idx-1, output);
    }

    public static List<Character> reverseStr(char[] s) {
        List<Character> reversed = new ArrayList<>();
        reverse(s, s.length-1, reversed);
        return reversed;
    }

    // approach 2
    public static void reverse2(char[] s, int start, int end, char[] output) {
        if(end < 0) return;
        output[start] = s[end];
        reverse2(s, start+1, end-1, output);
    }

    public static char[] reverseStr2(char[] s) {
        char[] reversed = new char[s.length];
        reverse2(s, 0, s.length-1, reversed);
        return reversed;
    }

}
