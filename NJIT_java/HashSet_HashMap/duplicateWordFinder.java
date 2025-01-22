package NJIT_java.HashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class duplicateWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many words are we entering: ");
        int aCount = Integer.parseInt(sc.nextLine());

        String[] strArray = new String[aCount];
        for(int i = 0; i < aCount; i++) {
            strArray[i] = sc.nextLine();
        }
        sc.close();

        if(checkDuplicates(strArray)) {
            System.out.println("Theres no duplicates in here");
        } else {
            System.out.println("A duplicate was found");
        }
    }

    public static boolean checkDuplicates(String[] arr) {
        // create an empty set
        Set<String> wordCollection = new HashSet<String>();
        for(int i = 0; i < arr.length; i++) {
            // check if arr[i] already exists in our collection
            // if so return false, otherwise add it in our collection
            if(wordCollection.contains(arr[i])) {
                return false;
            }
            wordCollection.add(arr[i]);
        }
        return true;
    }
}
