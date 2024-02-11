package practice;

public class BalancedBT {
    public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        int heightDiff = Math.abs(lh - rh);
        if (heightDiff > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        return 1 + Math.max(lh, rh);

    }
}
