package practice;

public class MaxPathSum {
    int maxsum = Integer.MIN_VALUE;

    public int maxPathSum(Node root) {
        if (root == null) {
            return 0;
        }
        helper(root);
        return maxsum;
    }

    public int helper(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = Math.max(helper(root.left), 0);
        int rightSum = Math.max(helper(root.right), 0);
        int sum = root.val + leftSum + rightSum;
        maxsum = Math.max(maxsum, sum);
        return root.val + Math.max(rightSum, leftSum);
    }
}
