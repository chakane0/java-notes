package NJIT_java.DivideAndConquer;
import java.util.Scanner;

public class nthRootFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for the nth root: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println();

        System.out.print("Enter the number to take the nth root of: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println();

        System.out.print("Enter the presicion: ");
        int precision = Integer.parseInt(sc.nextLine());

        System.out.print("the "+ n + "nd root of " + num + " is: " +findNthRoot(n, num, precision));
        System.out.println();
    }

    private static String findNthRoot(int n, int num, int precision) {
        // we need an upper and lower bound on the input
        double lowerbound = 0.0;
        double upperbound = (double)num;

        // add an eplisilon to give a range of accepted error
        double epsilon = 1.0;
        for(int i = 0; i < 2*precision; i++) {
            epsilon += 0.1;
        }


        while(lowerbound <= upperbound) {
            double mid = (lowerbound + upperbound) / 2.0;
            System.out.println("mid: " + mid);
            System.out.println("power by " + n +": "+ powerByN(n, mid) + epsilon);
            double midToTheN = powerByN(n, mid);

            // if our guess ins within 2*presicion decimal places of our num, stop
            // otherwise update bounds
            if((midToTheN - num) < epsilon && (midToTheN - num) > (-1.0 * epsilon)) {
                return Double.toString(mid);
            }

            else if(midToTheN > num ) {
                upperbound = mid;
            }

            else if(midToTheN < num) {
                lowerbound = mid;
            }
        }
        return "";
    }

    private static int powerByN(int nthRoot, double mid) {
        int result = 1;
        for(int i = 0; i < nthRoot; i++) {
            result *= mid;
        }
        return result;
    }
}
// 2, 15, 2

