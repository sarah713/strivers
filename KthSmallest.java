public class KthSmallest {
    int cnt;
    int res;

    public int kthSmallest(TreeNode root, int k) {
        cnt = 0;
        res = 0;
        inorder(root, k);
        return res;
    }

    public void inorder(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        inorder(node.left, k);

        if (cnt == k) {
            res = node.val;
            return;
        }
        inorder(node.right, k);
    }
}
