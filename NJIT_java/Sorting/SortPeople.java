/*
 * 
 * 
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.

 

Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 


Constraints:

n == names.length == heights.length
1 <= n <= 103
1 <= names[i].length <= 20
1 <= heights[i] <= 105
names[i] consists of lower and upper case English letters.
All the values of heights are distinct.
 */

import java.util.Arrays;
import java.util.HashMap;
public class SortPeople {
    public static void main(String[] args) {
        String[] names = {"Chris", "Chakane", "Mike"};
        int[] heights = {44, 160, 240};
        String[] result = getSortPeople(names, heights);
        for(String i : result) {
            System.out.print(i + " ");
        }
    }

    public static String[] getSortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        String[] result = new String[names.length];
        // create mapping
        for(int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        // sort the heights
        Arrays.sort(heights); // sorts in ascending order
        // for(int i : heights) {
        //     System.out.print(i + " ");
        // }

        int idx = 0;
        for(int i = heights.length-1; i >= 0; i--) {
            result[idx++] = map.get(heights[i]);
        }


        
        // System.out.println(map.get(44));
        return result;
    }
    
}

