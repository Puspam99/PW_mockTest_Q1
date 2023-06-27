import java.util.Arrays;

public class mockTest_Q1 {
    public static  void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;

        // Move all the non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    Solution solution = new Solution();
    solution.moveZeroes(nums);
    System.out.println(Arrays.toString(nums));
}
}
