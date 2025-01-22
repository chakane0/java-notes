

/*
 *      Here, we could be given an array with values that may fall into 3 categories. 
 *      We're able to use a quicksort method which addresses our 3 categories.
 *      
 *      Recall, quicksort will find a 'pivot' value in our array and then  break down our array 
 *      into 2 subarrays which will merge together via our parameters. When tackling this kind of
 *      problem, think about the partition step in quicksort. 
 * 
 *      What we want to accomplish is taking an array and rearrange the elements such that
 *      elements less than our pivot value appear first, then elements equal to the pivot value
 *      appear next and lastly, elements greater than the pivot value appear last. 
 * 
 *      Theres 3 general approaches to do this
 *      
 *          (1) Build 3 arrays, less, equal, greater. Then re-merge
 *          (2) Foreward, backwards passes. For each element do a scan for items < or > to the pivot
 *          (3) Similar to 2 but we utilize a 'placement index'
 * 
 * 
 */
import java.util.*;
public class DutchNationalFlag {
    public enum Color {RED, WHITE, BLUE};
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(0, 2, 1, 0, 2, 1);
        // System.out.println(dutchFlagPartition(2, arr));
        // System.out.println(dutchFlagPartition1(2, arr));
    }
    

    /*
     * This approach first does a foreward iteration in our array with 2 pointers, if we find an element 
     * less than out pivot element we swap those elements (via pointers)
     * 
     * Then we do a backwards iteration to find all elements larger than our pivot.
     * 
     * This algorithm is a time complexity of O(n^2) and space complexity of O(1)
     */
    public static List<Integer> dutchFlagPartition(int pivotIndex, List<Integer> A) {
        int pivot = A.get(pivotIndex);

        for(int i = 0; i < A.size(); ++i) {
            for(int j = i + 1; j < A.size(); ++j) {
                if(A.get(j) < pivot) {
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }

        for(int i = A.size() - 1; i >= 0; --i) {
            for(int j = i-1; j >= 0; --j) {
                if(A.get(j) > pivot) {
                    Collections.swap(A, i, j);
                    break;
                }
            }
        }

        return A;
    }


    public static List<Integer> dutchFlagPartition1(int pivotIndex, List<Integer> A) {
        int pivot = A.get(pivotIndex), smaller = 0, larger = A.size() - 1;

        for(int i = 0; i < A.size(); i++) {
            if(A.get(i) < pivot) {
                Collections.swap(A, smaller++, i);
            }
        }

        for(int i = A.size() - 1; i >= 0; i--) {
            if(A.get(i) > pivot) {
                Collections.swap(A, larger--, i);
            }
        }

        return A;
    }
}
