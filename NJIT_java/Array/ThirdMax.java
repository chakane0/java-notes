public class ThirdMax {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        System.out.println(findFirstMax(arr));
        System.out.println(findSecondMax(arr));
        System.out.println(findThirdMax(arr));

    }

    public static int findThirdMax(int[] nums) {
        int firstMax = findFirstMax(nums);
        int secondMax = findSecondMax(nums);
        int thirdMax = 0;
        for(int i : nums) {
            if(i != firstMax && i != secondMax && i > thirdMax) {
                thirdMax = i;
            }
        }
        return thirdMax;
    }

    public static int findSecondMax(int[] nums) {
        int firstMax = findFirstMax(nums);
        int secondMax = 0;
        for(int i : nums) {
            if(i != firstMax && i > secondMax) {
                secondMax = i;
            }
        }

        return secondMax;
    }

    public static int findFirstMax(int[] nums) {
        int firstMax = 0;
        for(int i : nums) {
            if(i > firstMax) {
                firstMax = i;
            }
        }
        return firstMax;
    }

}
