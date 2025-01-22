public class ConcatenateArray {
    /*
     * Given an array of len (n). Create an array of length 2n where 
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] ans = getConcatenationImptl1(arr);
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }

    public static int[] getConcatenationImptl1(int[] nums) {
        int[] ans = new int[nums.length * 2]; 
        int midIdx = ans.length/2;  // 6/2 == 3

        // first half of array
        for(int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            ans[midIdx++] = nums[i];
        }
        return ans;
    }
    
}
