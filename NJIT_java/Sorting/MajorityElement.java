import java.util.Hashtable;
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 3}; // return element that appears more than 1 time
        getMajorityElement(arr);
    }

    /*
     * Given and array of size n, return the element that appears more than [n/2] times
     * Assume the majority element always exists in the array
     */
    public static int getMajorityElement(int[] nums) {
        int majorityElement = nums.length/2;
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();

        for(int i : nums) {
            // if(!map.containsValue(i)) {
                table.put(i);
            // }
        }
        System.out.println(table);
        return 0;


    }

}
