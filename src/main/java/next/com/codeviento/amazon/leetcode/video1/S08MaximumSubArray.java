package next.com.codeviento.amazon.leetcode.video1;

public class S08MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i], nums[i]);
            max = Math.max(max, currentSum);
        }

        return max;
    }
}
