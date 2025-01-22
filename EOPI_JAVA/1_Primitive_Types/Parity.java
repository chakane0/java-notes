
public class Parity {
    /*
        The "parity" of a word is 1 if the number of 1's in the word is odd, otherwise its 0. 
        Parity checks are used to detect single bit errors in data storage and communication.
        
        We could take a brute force approach where we iteratively test the value of 
        each bit while tracking the numbers of 1's so far.

        We could also improve our bruteforce solution. Since x &(x-1) = x with its lowest 
        bit erased we can improve the performance of the best and average cases. 
        This idea is based of erasing the lowest set bit in a word in a single operation.
     */
    public static void main(String[] args) {

    }

    // brute force
    public static short parity(long x) {
        short result = 0;
        while(x != 0) {
            result ^= (x & 1);
            x >>>= 1;
        }
        return result;
    }

    // erase lowest set bit
    public static short parity1(long x) {
        short result = 0;
        while(c != 0) {
            result ^= 1;
            x &= (x-1);  // drops the lowest set bit of x
        }
        return result;
    }
}
