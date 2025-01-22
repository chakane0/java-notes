/*      
 *      Given an array of integers, reorder the numbers so that the even numbers appear first. 
 *      Give O(n) time and O(1) space.      
 *      
 *      arr =    {4, 3, 2, 6, 5, 8, 9, 7}
 *      output = {4, 2, 6, 8, 3, 5, 9, 7}
 * 
 *      Approach #1: Knowing that we are able to operate on both ends of the array. 
 *                   We can partition it into 3 subarrays: Even, Unclassified, and Odd.
 *                   Well have two pointers at each end of the array and iterate through unclassified.
 * 
 *                   - If the ith number is even, we iterate to the next pointer.
 *                   - If the ith number is odd, we swap that number with the leftmost unsearched number, then we move the end pointer left. 
 *                   - This repeats and typically we will hold a odd number on the right until the left side finds an even number to replace it with. 
 *
 */

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6, 5, 8, 9, 7};
        int[] ans = evenOdd(arr);
        // for(int i = 0; i < ans.length; i++) {
        //     System.out.print(ans[i] + " ");
        // }
    }

    public static int[] evenOdd(int[] arr){
        int pointer1 = 0, pointer2 = arr.length-1;
        while(pointer1 < pointer2) {

            // if our ith number is even, keep going
            if(arr[pointer1] % 2 == 0) {
                pointer1++;

                // otherwise, swap the ith number and the last searched number
            } else {
                int temp = arr[pointer1];
                arr[pointer1] = arr[pointer2];
                arr[pointer2] = temp;
                pointer2--;
            }
            // for(int i = 0; i < arr.length; i++) {
            //     System.out.print(arr[i] + " ");
            // }
            // System.out.println('\n');

        }
        return arr;
    }
}
