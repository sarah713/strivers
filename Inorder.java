import java.util.ArrayList;
import java.util.List;

public class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        inorder(root, res);
        return res;

    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.right, res);
        res.add(root.val);
        inorder(root.left, res);
    }
}
