public class SortColor {
    public void sortColors(int[] nums) {
        // reverse order - [2,2,1,1,1,0,0]
        int zero = nums.length - 1;
        int one = 0;
        int two = 0;

        while (one <= zero) {
            if (nums[one] == 2) {
                int tmp = nums[two];
                nums[one] = nums[two];
                nums[two] = tmp;
                one++;
                two++;
            } else if (nums[one] == 0) {
                int tmp = nums[zero];
                nums[one] = nums[zero];
                nums[zero] = tmp;
                zero--;
            } else {
                one++;
            }
        }
    }
}
