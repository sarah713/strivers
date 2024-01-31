public class Kadaness {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int maxSum = Integer.MIN_VALUE;
        int maxTillNow = 0;
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
