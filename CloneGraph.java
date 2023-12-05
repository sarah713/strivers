
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return node;
        }

        Node[] visited = new Node[101];
        Arrays.fill(visited, null);
        Node copy = new Node(node.val);
        clone(node, visited, copy);
        return copy;
    }

    public void clone(Node node, Node[] visited, Node copy) {
        visited[copy.val] = copy;
        for (Node neigh : node.neighbors) {
            if (visited[neigh.val] == null) {
                Node newN = new Node(neigh.val);
                copy.neighbors.add(newN);
                clone(copy, visited, neigh);
            } else {
                copy.neighbors.add(visited[neigh.val]);
            }
        }
    }
}

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
