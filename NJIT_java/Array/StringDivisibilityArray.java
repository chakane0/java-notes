public class StringDivisibilityArray {
    public static void main(String[] args) {
        String word = "998244353";
        int [] ans = checkDivisibility(word, 3);
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        // System.out.println(9%3);
        
    }

    public static int[] checkDivisibility(String arr, int m) {
        int[] ans = new int[arr.length()];
        for(int i = 0 ; i < arr.length(); i++) {
            if (checkIfDivisible((arr.charAt(i) - '0'), m)) {
                ans[i] = 1;
            } else {
                ans[i] = 0;
            }
        }
        return ans;
    }

    public static boolean checkIfDivisible(int num, int m) {
        if(num%m == 0) {
            return true;
        }
        return false;
    }
    
}
