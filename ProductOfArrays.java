public class ProductOfArrays {
    public static int[] productExceptSelf(int[] nums) {
        int leftProd = 1;
        int rightProd = 1;

        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = leftProd * rightProd;
            leftProd = leftProd * nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * rightProd;
            rightProd = rightProd * nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] res = productExceptSelf(nums);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
