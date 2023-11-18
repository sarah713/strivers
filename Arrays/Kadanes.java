package Arrays;

public class Kadanes {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, maxTillNow = 0;
        if (nums.length == 1) {
            return nums[0];
        }

        for (int i = 0; i < nums.length; i++) {
            maxTillNow += nums[i];

            if (maxTillNow > maxSum) {
                maxSum = maxTillNow;
            }
            if (maxTillNow < 0) {
                maxTillNow = 0;
            }
        }
        return maxSum;
    }
}
