package practice;

public class SingleElementinSorted {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length - 2;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            // check if we are in the left array i.e 1st num on even idx and 2nd num on odd
            // idx
            if (mid % 2 == 0) {
                if (nums[mid] != nums[mid + 1]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (nums[mid] == nums[mid + 1]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return nums[lo];
    }
}
