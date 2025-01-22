package NJIT_java.miscl;

public class maxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr2 = {5, 4, -1, 7, 8};
        System.out.println(rtnMaxSubArray(arr));
    } 

   
    public static int rtnMaxSubArray(int[] arr) {
        // We assume that the best maximum sum we will see so far is the first element. 
        // We also assume that the best max sum ending at the first element is...the first element. 
        int maxSoFar = arr[0], maxEndingHere = arr[0];

        // we'll look at the rest of the elements in the array from index 1 onward
        for(int i = 1; i < arr.length; i++) {

            /*
                Were looking at the element at index i

                Keep in mind we want to answer: What is the Max Contiguous Subarray Sum we can get at index i?

                Theres 2 choices here:
                    1.) maxEndingHere + nums[i] (extend the best previous subarray)
                        Let the element we are sitting at contribute to this best max we achieved ending at index i - 1

                    2.) nums[i -> start and end at this index
                        Just take the item were looking at's value

                    The max of these 2 choices will be the best answer to the Max contoguous subarray 
                    sum we can get for subarrays ending at index i.

                Example:

                index     0  1   2  3   4  5  6   7  8
                Input: [ -2, 1, -3, 4, -1, 2, 1, -5, 4 ]
                        -2, 1, -2, 4,  3, 5, 6,  1, 5    'maxEndingHere' at each point
                
                The best subarrays we would take if we took them:
                ending at index 0: [ -2 ]                 (snippet from index 0 to index 0)
                ending at index 1: [ 1 ]                  (snippet from index 1 to index 1) [we just took the item at index 1]
                ending at index 2: [ 1, -3 ]              (snippet from index 1 to index 2)
                ending at index 3: [ 4 ]                  (snippet from index 3 to index 3) [we just took the item at index 3]
                ending at index 4: [ 4, -1 ]              (snippet from index 3 to index 4)
                ending at index 5: [ 4, -1, 2 ]           (snippet from index 3 to index 5)
                ending at index 6: [ 4, -1, 2, 1 ]        (snippet from index 3 to index 6)
                ending at index 7: [ 4, -1, 2, 1, -5 ]    (snippet from index 3 to index 7)
                ending at index 8: [ 4, -1, 2, 1, -5, 4 ] (snippet from index 3 to index 8)

                Notice how we are changing the end bound by 1 everytime.
        */

            maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);

            // this line asks: did we beat the maxSoFar with maxEndingHere?
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
