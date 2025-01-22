package NJIT_java.HashSet_HashMap;
import java.util.HashMap;
import java.util.Stack;
public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        singleNum(arr);
    }

    public static int singleNum(int[] arr) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result;
    }


    public static int singleNum(int[] arr) {
        HashMap<Integer, Integer> result = new HashMap<>();
        int singleNumStore = 0;
        for(int i = 0; i < arr.length; i++) {

            // if an element already exists inside the hashmap
            if(result.containsKey(arr[i])) {
                result.put(arr[i], result.get(arr[i]) + 1);

            // if the element does not exist inside the hashmap
            } else {
                result.put(arr[i], 1);
            }
        }
        System.out.println(result);
        return singleNumStore;
    }



}
