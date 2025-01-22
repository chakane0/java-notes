package NJIT_java.Recursion;

public class sumToN {
    public static void main(String[] args) {
        System.out.println(sumOneToN(5));
    }

    public static int sumOneToN(int n) {
        // base case
        if(n == 1) {
            return 1;
        }

        // recursive step
        return n + sumOneToN(n-1);
    }
}
