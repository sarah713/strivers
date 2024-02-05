import java.util.ArrayList;

public class FindPath {
    static boolean getPath(Node root, ArrayList<Integer> arr, int x) {
        if (root == null) {
            return false;
        }

        arr.add(root.val);

        if (root.val == x) {
            return true;
        }

        if (getPath(root.left, arr, x) || getPath(root.right, arr, x)) {
            return true;
        }

        arr.remove(arr.size() - 1);
        return false;
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