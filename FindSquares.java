class FindSquares {
    public static int[] square(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] { -1 };
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int[] result = square(nums);
        for (int i : result) {
            System.out.println(i);
        }
    }
}