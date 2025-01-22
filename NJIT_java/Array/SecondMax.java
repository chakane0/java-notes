public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {-1, 10, 8, 9, 10, 9, -8, 11, 3, 5, 4, 1};
        int result = secondMax(arr);
        System.out.println(result);
    }

    public static int secondMax(int[] arr){
        int firstMax = arr[0];
        int secondMax = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > secondMax) {
                secondMax = arr[i];
                if(secondMax > firstMax) {
                    int temp = secondMax;
                    secondMax = firstMax;
                    firstMax = temp;
                }
            }
        }
        return secondMax;
    } 
    
}
