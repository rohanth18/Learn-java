public class LeetCode_1437{

    public static boolean kLengthApart(int[] nums, int k) {
        int j = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (j != -1 && i - j - 1 < k) {
                    return false;
                }
                j = i;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums = {
            1, 0, 0, 0, 0, 0, 1, 0, 0, 0,
            0, 0, 1, 0, 0, 0, 0, 0, 1, 0,
            0, 0, 0, 0, 0, 1, 0, 0, 0, 0,
            0, 0, 1, 0, 0, 0, 0, 0, 0, 1
        };

        int k = 5;

        boolean result = kLengthApart(nums, k);

        System.out.println("Array length: " + nums.length);
        System.out.println("k = " + k);
        System.out.println("Result: " + result);
    }
}