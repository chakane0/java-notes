import java.util.HashMap;
import java.util.Map;

public class TotalKOccurences {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 4, 4, 5};
        int result = totalOccurences(arr, 1);
        System.out.println(result);

    }


    /*
    Find the total occurneces of K in a sorted array

    ex [1, 1, 1, 2, 3, 4, 4, 5] k = 1


    appraoch 1: store items in a hashmap
                {1=3, 2=1, 3=1, 4=2, 5=1}

                one loop to throw all elements in a hashmap
                another loop to check the values in the hashmap

    appoach 2: just loop through the arr and check if k matches arr[i]

    approach 3: binary search it because we know it sorted


    */
    public static int totalOccurences(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        return hm.get(k);
    }

    public static int totalOccurneces(int[] arr, int k) {
        int result = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                result += 1;
            }
        }
        return result;
    }

    enum SearchType {
        FIRST,
        LAST
    }

    public static int getOccurencesOfK(int[] arr, int k) {
        int firstOccurence = binarySearch(arr, k, 0, arr.length-1, SearchType.FIRST);
        if(firstOccurence == -1) {
            return 0;
        }
        int lastOccurence = binarySearch(arr, k, 0, arr.length-1, SearchType.LAST);
        return lastOccurence - firstOccurence + 1;
    }

    public static int binarySearch(int[] arr, int k, int left, int right, SearchType searchType) {
        if(arr.length == 0 || left > right) {
            return -1;
        }

        int mid = left + (right-left)/2;
        if(arr[mid] == k) {
            if(searchType == SearchType.FIRST) {
                if(isInBounds(arr, mid-1) && arr[mid] == arr[mid-1]) {
                    // keep searching left
                    return binarySearch(arr, k, left, mid-1, searchType);
                }
            }

            if(searchType == SearchType.LAST) {
                // isInBounds asks if the element to the right is out of bounds
                if(isInBounds(arr, mid+1) && arr[mid] == arr[mid+1]) {

                    // keep searching right
                    return binarySearch(arr, k, mid+1, right, searchType);
                }
            }
        }
        else if(arr[mid] < k) {
            return binarySearch(arr, k, mid+1, right, searchType);
        } else {
            return binarySearch(arr, k, left, mid-1, searchType);
        }
    }
    
}
