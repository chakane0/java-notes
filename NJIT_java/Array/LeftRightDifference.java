public class LeftRightDifference {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 3};
        int[] answer = leftRightDiff(arr);
        // for(int i = 0; i < answer.length-1; i++) {
        //     System.out.print(answer[i] + " ");
        // }
    }

    public static int[] leftRightDiff(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int leftSum = scanLeft(nums, i);
            // System.out.print(leftSum + " ");
            int rightSum = scanRight(nums, i);
            int difference = leftSum - rightSum;
            
            if(difference <= -1) {
                difference = difference * -1;
            }
            System.out.print(difference + " ");
            ans[i] = difference;
        }
        
        return ans;
    }

    public static int scanLeft(int[] arr, int index) {
        int sum = 0;
        if (index == 0) {
            // System.out.println("index was zero");
            return sum;
        } else {
            for(int i = index; i > 0; i--) {
                sum += arr[i-1];
                // System.out.print("hit " + " ");
            }
            // System.out.println("");
            return sum;
        }
    }

    public static int scanRight(int[] arr, int index) {
        int sum = 0;
        if (index == arr.length-1) {
            return sum;
        } else {
            for(int i = index; i < arr.length-1; i++) {
                sum += arr[i+1];
            }
            return sum;
        }
    }
    
}
