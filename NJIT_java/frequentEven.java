import java.util.Set;
import java.util.HashSet;


public class frequentEven {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,4,1};
        int mostFrequentEvenNumber = mostFrequent(arr);
    }

    public static int mostFrequent(int[] nums) {
        Set<Integer> evenNumberCount = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0) {
                if(!evenNumberCount.contains(nums[i])) {
                    evenNumberCount.add(nums[i]);
                }
            }
        }
        return -1;

    }
}
