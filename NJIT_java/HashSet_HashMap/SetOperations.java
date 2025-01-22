package NJIT_java.HashSet;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Set;

public class SetOperations {
    public static final int INTERSECTION_OPERATION = 0;
    public static final int UNION_OPERATION = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // have the user choose what operation they want
        System.out.println("Input 0 for Intersection, 1 for Union");
        int operation = Integer.parseInt(sc.nextLine());

        // variables for processing input
        String[] numberStrings;
        Integer[] numbers;
        String input;

        // parse our first set
        Set<Integer> set1;
        System.out.print("Enter numbers for set 1: ");
        input = sc.nextLine();
        if(input.equals("")) {
            set1 = new HashSet<Integer>();
        } else {
            numberStrings = input.split(" ");
            numbers = new Integer[numberStrings.length];
            for(int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
            set1 = new HashSet<Integer>(Arrays.asList(numbers));
        }

        // parse out second set
        Set<Integer> set2;
        System.out.print("Enter numbers for set 2: ");
        input = sc.nextLine();
        if(input.equals("")) {
            set2 = new HashSet<Integer>();
        } else {
            numberStrings = input.split(" ");
            numbers = new Integer[numberStrings.length];
            for(int i = 0; i < numberStrings.length; i++) {
                numbers[i] = Integer.parseInt(numberStrings[i]);
            }
            set2 = new HashSet<Integer>(Arrays.asList(numbers));
        }
        

        // for(int ele: set1) {
        //     System.out.print(ele + " ");
        // }

        if(operation == INTERSECTION_OPERATION) {
            HashSet<Integer> res = new HashSet<Integer>();
            res = intersectionSet(set1, set2);
            for(int ele : res) {
                System.out.print(ele + " ");
            }
        } else if(operation == UNION_OPERATION) {
            unionSet(set1, set2);
        } else {
            System.out.println("Operation selected not valid");
        }

    }

    public static HashSet<Integer> unionSet(Set<Integer> set1, Set<Integer> set2) {
        // we have to take 2 sets: A & B and the output is a 3rd set C where
        // C is a set of both A and B
        HashSet<Integer> resultSet = new HashSet<Integer>();
        for(int element : set1) {
            resultSet.add(element);
        }
        for(int element : set2) {
            resultSet.add(element);
        }
        return resultSet;
    }

    public static HashSet<Integer> intersectionSet(Set<Integer> set1, Set<Integer> set2) {
        // We have to take 2 sets: A & B and the output is a 3rd set C where
        // if x is a set of C, x is a set of A and B
        // think mutuals

        // because we arent assuming both sets are equal length we need to find the largest sized 
        // set to iterate
        HashSet<Integer> resultSet = new HashSet<Integer>();
        if(set1.size() > set2.size()) {
            for(int element : set1) {
                if(set2.contains(element)) {
                    resultSet.add(element);
                }
            }
        } else {
            for(int element : set2) {
                if(set1.contains(element)) {
                    resultSet.add(element);
                }
            }
        }
        return resultSet;
    }
    
}
