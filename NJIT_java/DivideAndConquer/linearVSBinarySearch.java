package NJIT_java.DivideAndConquer;
import java.util.Scanner;

public class linearVSBinarySearch {
    public static void main(String args[]) {
        // get input from the console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of numbers in acesnding order");

        // read in a list of numbers
        int[] numArr;
        String consoleInput = sc.nextLine();
        if(consoleInput.equals("")) {
            numArr = new int[0];
        } else {
            String[] numberStrings = consoleInput.split(" ");
            numArr = new int[numberStrings.length];
            for(int i = 0; i < numberStrings.length; i++) {
                numArr[i] = Integer.parseInt(numberStrings[i]);
            }
        }
        sc.close();

        // linearsearch check
        System.out.println(linearSearch(numArr, 5));

        // binarySearch check
        System.out.println(binarySearch(numArr, 1));
    }
    
    public static boolean binarySearch(int[] arr, int target) {
        // check to see if a number exists in our array via divide and conquer

        // bounds of array
        int left = 0;
        int right = arr.length-1;

        while(left <= right) {
            int mid = left + right / 2;
            System.out.println(mid);
            
            // if the midpoint is lower than the target, cutoff the right side
            if(arr[mid] < target) {
                left = mid + 1;
            }

            // if the midpoint is higher than the target, cutoff the left side
            else if(arr[mid] > target) {
                right = mid - 1;
            
            // if the midpoint == target return true
            } else if(arr[mid] == target) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearch(int[] arr, int target) {
        // check to see if a number exists in our array via iteration
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
