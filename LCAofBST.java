public class LCAofBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root) {
            return root;
        }
        if (root.val < p.val && root.val < q.val)
            lowestCommonAncestor(root.left, p, q);
        if (root.val > q.val && p.val > q.val) {
            lowestCommonAncestor(root.right, p, q);
        }

        return root;

    }
}
