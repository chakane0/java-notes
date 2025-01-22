
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 1, 2, 7, 6, 5};
        int[] newArr = selectionSort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }

    /*
        This sorting method works by finding the lowest number(j), 
        and then swap it with the beginning element (ith),
        the move the ith index up one
     */
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            // find the min index
            int currentMinIndex = i;

            // find the min number
            for(int j = i + 1; j < n-1; j ++) {
                if(arr[currentMinIndex] > arr[j]) {
                    currentMinIndex = j;
                }
            }

            // swap in place
            int temp = arr[i];
            arr[i] = arr[currentMinIndex];
            arr[currentMinIndex] = temp;
        }
        return arr;
    }
}
