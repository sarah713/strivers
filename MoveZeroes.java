public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
            for (int i = insertPos; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
