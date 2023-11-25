public class FindMinInRotated {
    public static int findMin(int[] nums) {
        int lo = 0, hi = nums.length - 1;
        if (nums[lo] < nums[hi]) {
            return lo;
        }

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return nums[lo];
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(findMin(arr));
    }
}
