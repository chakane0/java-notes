// package NJIT_java.Array;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9};
        int[] result = plusOne(arr);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

    public static int[] plusOne(int[] arr) {
        for(int i = arr.length-1; i >= 0; i--) {

            // if the element is 9 set it to 0
            if(arr[i] == 9) {
                arr[i] = 0;
                continue;
            } 

            // if the element is not zero add one to it
            if(arr[i] != 9) {
                arr[i] += 1;
                return arr;
            }
        }

        // if our code gets here we need to create a new array and throw in a 1
        int[] newArr = new int[arr.length+1];
        newArr[0] =  1;
        for(int i = 1; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        /*
        Traverse the array backwards
        if we encounter a 9 set that element to zero and have a carry on 1
        keep checking if we have a 9, if so keep setting that element to zero and carry the one.
        If we get to the 0th index, and it is a 9, then we need a new array
        If we get to the 0th index and it isnt a nine just add the carry on 1
        */

        return newArr;
    }
    
}
