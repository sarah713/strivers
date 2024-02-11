package practice;

import java.util.ArrayList;

public class LeftView {
    int maxLevel = 0;

    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> left = new ArrayList<>();
        if (root == null) {
            return left;
        }
        helper(root, 1, left);
        return left;
    }

    void helper(Node root, int level, ArrayList<Integer> left) {
        if (root == null) {
            return;
        }

        if (level > maxLevel) {
            left.add(root.val);
            maxLevel = level;
        }
        helper(root.left, level + 1, left);
        helper(root.right, level + 1, left);

    }

}

class Node {
    int val;
    Node left = null;
    Node right = null;

    public Node(int val) {
        this.val = val;
    }
}