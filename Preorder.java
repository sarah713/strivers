import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode current = root;
        List<Integer> list = new ArrayList<>();
        while (current != null) {
            if (current.left == null) {
                list.add(current.val);
                current = current.right;
            } else {
                TreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }
                if (predecessor.right == null) {
                    predecessor.right = current;
                    list.add(current.val);
                    current = current.left;
                } else {
                    predecessor.right = null;
                    current = current.right;
                }
            }
        }
        return list;
    }
}
