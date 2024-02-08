public class MaxProdSubarray {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];

        int maxSoFar = nums[0];
        for (int i = 1; i < n; i++) {
            int temp = maxEndingHere;
            maxEndingHere = Math.max(nums[i], Math.max(nums[i] * maxEndingHere, nums[i] * minEndingHere));
            minEndingHere = Math.min(nums[i], Math.min(nums[i] * temp, nums[i] * minEndingHere));

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
