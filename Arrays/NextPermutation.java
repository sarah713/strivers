package Arrays;

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakpt = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                breakpt = i;
                break;
            }
        }
        if (breakpt == -1) {
            reverse(nums, 0);
        } else {
            int nextGreater = -1;
            for (int i = n - 1; i >= 0; i--) {
                if (nums[i] > nums[breakpt]) {
                    nextGreater = i;
                    break;
                }
            }
            swap(nums, breakpt, nextGreater);
            reverse(nums, breakpt + 1);
        }
    }

    public void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }

    public void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}