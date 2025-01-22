package NJIT_java.miscl;

public class isPalindrome {
    public static void main(String[] args) {
        // System.out.println(checkIfPalindrome("A man, a plan, a canal: Panama"));
        int[] arr = {1, 3, 5, 6};
        System.out.println(searchInsert(arr, 5));

    }

    public static boolean checkIfPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int j = s.length()-1;
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

    public static int searchInsert(int[] nums, int target) {
        int upperBound = nums.length-1, lowerBound = 0;
        while(lowerBound <= upperBound) {
            int mid = lowerBound + (upperBound - lowerBound)/2;
            System.out.println(mid);
            
            
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] > target) {
                upperBound = mid-1;
            } else {
                lowerBound = mid+1;
            }   
        }
        return lowerBound;
    }
}
