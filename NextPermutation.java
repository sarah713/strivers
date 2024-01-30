public class NextPermutation {
    public void nextPermutation(int[] nums) {
        // find the breakpoint
        int breakpt = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakpt = i;
                break;
            }
        }
        if (breakpt == -1) {
            rev(nums, 0);
        } else {
            int next = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[breakpt]) {
                    next = i;
                    break;
                }
            }
        }
    }

    public void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    public void rev(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}

// arr = [1,2,3]
// [1,3,2]