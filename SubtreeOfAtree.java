public class SubtreeOfAtree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isIdentical(TreeNode root, TreeNode sub) {
        if (root == null && sub == null) {
            return true;
        } else if (root == null || sub == null || root.val != sub.val) {
            return false;
        }
        if (!isIdentical(root.left, sub.left)) {
            return false;
        }
        if (!isIdentical(root.right, sub.right)) {
            return false;
        }
        return true;
    }
}
