import java.util.HashMap;

public class FruitsIntoBasket {
    public int totalFruit(int[] tree) {
        if (tree == null || tree.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        int max = 1;
        while (j < tree.length) {
            if (map.size() <= 2) {
                map.put(tree[j], j++);
            }
            if (map.size() > 2) {
                int min = tree.length - 1;
                for (int val : map.values()) {
                    min = Math.min(val, min);
                }
                i = min + 1;
                map.remove(tree[min]);
            }
            max = Math.max(max, j - i);
        }
        return max;
    }
}
