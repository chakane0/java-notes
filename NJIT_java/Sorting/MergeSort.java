

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 4, 1};
        mergeSort(arr, 0, arr.length-1);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    // Try this out: T(n) = T(n/2) + T(n/2) + (n-1) for n=8
    private static void mergeSort(int[] arr, int startIndex, int endIndex) {
        // base case
        if(startIndex >= endIndex) {
            return;
        }

        // sort each half
        int middleIndex = (startIndex + endIndex) / 2;
        mergeSort(arr, startIndex, middleIndex);
        mergeSort(arr, middleIndex+1, endIndex);

        // merge each half
        merge(arr, startIndex, middleIndex, endIndex);
    }

    private static void merge(int[] arr, int startIndex, int middleIndex, int endIndex) {
        // declare seperate arrays for the first list and the second list
        int[] firstHalf = new int[middleIndex - startIndex + 1];
        int[] secondHalf = new int[endIndex - middleIndex];

        // populate the first half
        for(int i = startIndex; i < middleIndex + 1; i++) {
            firstHalf[i-startIndex] = arr[i];
        }

        // populate the second half
        for(int i = middleIndex + 1; i <= endIndex; i++) {
            secondHalf[i-middleIndex-1] = arr[i];
        }

        // setup pointers for each list
        int firstHalfPointer = 0;
        int secondHalfPointer = 0;

        // populate the original list with merged elements
        for(int i = startIndex; i <= endIndex; i++) {
            // check for out of bounds
            if(firstHalfPointer >= firstHalf.length) {
                arr[i] = secondHalf[secondHalfPointer];
                secondHalfPointer++;
                continue;
            }
            if(secondHalfPointer >= secondHalf.length) {
                arr[i] = firstHalf[firstHalfPointer];
                firstHalfPointer++;
                continue;
            }

            // populate with smaller of the 2 elements
            if(firstHalf[firstHalfPointer] <= secondHalf[secondHalfPointer]) {
                arr[i] = firstHalf[firstHalfPointer];
                firstHalfPointer++;
            } else {
                arr[i] = secondHalf[secondHalfPointer];
                secondHalfPointer++;
            }
        }
    }
}
