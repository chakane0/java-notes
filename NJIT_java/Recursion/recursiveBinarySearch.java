package NJIT_java.Recursion;

public class recursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println(binarySearch(arr, 0));

    }
    
    // input the array we want to search and our target
    public static boolean binarySearch(int[] arr, int k) {
        return recursiveBinarySearch(arr, k, 0, arr.length-1);
    }

    // input the array in question: arr
    // the target: k
    // lower and upperbounds need to be updated for each recursive call
    private static boolean recursiveBinarySearch(int[] arr, int k, int lowerBound, int upperBound) {
        // base case
        if(lowerBound > upperBound) {
            return false;
        }

        // recursive step
        int guess = (lowerBound + upperBound) / 2;

        if(arr[guess] > k) {

            // change the lowerbound
            return recursiveBinarySearch(arr, k, lowerBound, guess-1);
        }
        else if(arr[guess] < k) {

            // change the upperbound
            return recursiveBinarySearch(arr, k, guess+1, upperBound);

        } else {
            return true;
        }
    }
}
