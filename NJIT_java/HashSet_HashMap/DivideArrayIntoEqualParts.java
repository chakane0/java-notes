package NJIT_java.HashSet_HashMap;
import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualParts {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3, 2, 2, 2};
        boolean checkEqualPairs = divideArray(arr);
        System.out.println(checkEqualPairs);

    }

    public static boolean divideArray(int[] nums) {
        Map<Integer, Integer> result = new HashMap<>();

        // throw the array into a hashmap
        for(int i = 0; i < nums.length; i++) {
            if(result.containsKey(nums[i])) {
                result.put(nums[i], result.get(nums[i]) + 1);
            } else {
                result.put(nums[i], 1);
            }
        }

        // check if we have an equal array
        for(int value : result.values()) {
            if(value % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
