public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 16};
        moveZeros(nums);
        
    }

    public static void moveZeros(int[] nums) {
        int ptr1 = 0;
        int ptr2 = 0;
        while(ptr2 < nums.length-1) {
            System.out.println("ptr1: "+ ptr1);
            System.out.println("ptr2: " + ptr2);
            System.out.println();

            if(nums[ptr1] == nums[ptr2]) {
                ptr2++;
                
            }
            else if(nums[ptr1] == 0 && nums[ptr2] != 0) {
                
                //swap
                int temp = nums[ptr1];
                nums[ptr1] = nums[ptr2];
                nums[ptr2] = temp;
                ptr1++;
            } 
        }

        // swap in last operation
        int temp = nums[ptr1];
        nums[ptr1] = nums[ptr2];
        nums[ptr2] = temp;

        for(int i:nums) {
            System.out.print(i + " ");
        }


    }
}
