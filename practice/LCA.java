package practice;

public class LCA {
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        // if (root == null || p == null || q == null) {
        // return root;
        // }
        // Node left = lowestCommonAncestor(root.left, p, q);
        // Node right = lowestCommonAncestor(root.right, p, q);

        // if (left != null && right != null) {
        // return root;
        // } else if (left != null) {
        // return left;
        // } else if (right != null) {
        // return right;
        // }
        // return null;
        // }
        if (root == null || p == null || q == null) {
            return root;
        }
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        } else if (left != null) {
            return left;
        } else if (right != null) {
            return right;
        }
        return null;
    }

}
