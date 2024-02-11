package practice;

import java.util.ArrayList;
import java.util.List;

public class RootToNPath {
    public List<Integer> pathFromRoot(Node root, int target) {
        List<Integer> path = new ArrayList<>();
        if (root == null) {
            return path;
        }
        if (findPath(root, path, target)) {
            return path;
        }
        path.clear();
        return path;
    }

    public boolean findPath(Node root, List<Integer> path, int target) {
        if (root == null) {
            return false;
        }
        path.add(root.val);

        if (root.val == target) {
            return true;
        }
        if (findPath(root.left, path, target) || findPath(root.right, path, target)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }
}
