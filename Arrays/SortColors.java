package Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int one = 0, zero = 0, two = nums.length - 1;
        while (one <= two) {
            if (nums[one] == 0) {
                int tmp = nums[one];
                nums[one] = nums[zero];
                nums[zero] = tmp;
                one++;
                zero++;
            } else if (nums[one] == 2) {
                int tmp = nums[one];
                nums[one] = nums[two];
                nums[two] = tmp;
                two--;
            } else {
                one++;
            }
        }
    }
}
