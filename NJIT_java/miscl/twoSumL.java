
import java.util.HashMap;

public class twoSumL {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] result = twoSum(arr, 9);
        for(int i = 0; i < result.length; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++) {
            int res = target - nums[i];
            if(hm.containsKey(res)) {
                result[0] = i;
                result[1] = hm.get(res);
                return result;
            } 
            hm.put(nums[i], i);
        }
        return result;
    }
}
