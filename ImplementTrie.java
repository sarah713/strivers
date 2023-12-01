public class ImplementTrie {
    Node root;

    public ImplementTrie() {
        root = new Node();
    }

    public void insert(String word) {
        root.insert(word, 0);
    }

    public boolean search(String word) {
        return root.search(word, 0);
    }

    class Node {
        Node[] nodes;
        boolean isEnd;

        Node() {
            nodes = new Node[26];
        }

        private void insert(String word, int i) {
            if (i >= word.length())
                return;
            if (nodes[i] == null) {
                nodes[i] = new Node();
            }
            if (i == word.length() - 1) {
                nodes[i].isEnd = true;

            }
            nodes[i].insert(word, i + 1);
        }

        private boolean search(String word, int idx) {
            if (idx >= word.length()) {
                return false;
            }
            Node node = nodes[word.charAt(idx) - 'a'];
            if (node == null)
                return false;
            if (idx == word.length() - 1 && node.isEnd)
                return true;

            return node.search(word, idx + 1);
        }
    }
}
