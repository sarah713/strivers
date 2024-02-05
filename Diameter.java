public class Diameter {
    public int diameterOfBinaryTree(TreeNode root) {
        int diam = 0;

        helper(root, diam);
        return diam;
    }

    public int helper(TreeNode root, int diam) {
        if (root == null) {
            return 0;
        }

        int left = helper(root.left, diam);
        int right = helper(root.right, diam);

        diam = Math.max(diam, left + right);
        return 1 + Math.max(left, right);

    }
}
