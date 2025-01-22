package NJIT_java.miscl;

public class sqrt {
    public static void main(String[] args) {
        mySqrt(9);

    }

    /*
        Using a divide and conquer approach

    */
    public static int mySqrt(int x) {
        int lowerBound = 0;
        int upperBound = x;
        int aCount = 0;

        while(lowerBound <= upperBound) {
            if(aCount == 10) {
                break;
            }
            int guess = (lowerBound + upperBound) / 2;
            
            if(guess * guess == x) {
                return guess;
            }
            else if(guess*guess > guess) {
                upperBound = guess;
            }
            else if(guess*guess < guess) {
                lowerBound = guess;
            }
            System.out.println(guess + " -> " + guess*guess);
            aCount++;
        }
        return -1;
    }
    
}
