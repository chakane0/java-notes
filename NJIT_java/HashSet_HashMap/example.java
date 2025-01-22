package NJIT_java.HashSet;

// import required java libraries for our hashset
import java.util.Set;
import java.util.HashSet;

public class example {
    public static void main(String[] args) {
        /*
            HashSets is a java collection of unique objects of the same type.
            Some methods we can use are: .add(), .contains(), .remove().
            These operations runs in constant time O(1) on average
        */

        // create empty hashset
        Set<Integer> myHashSet = new HashSet<Integer>();

        // add some elements to the set
        myHashSet.add(6);
        myHashSet.add(101);

        // check if a number is in our set
        boolean checkif6InSet = myHashSet.contains(6);
        boolean checkif66InSet = myHashSet.contains(66);
        System.out.println(checkif6InSet);
        System.out.println(checkif66InSet);

    }
    
}
