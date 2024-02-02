import java.util.HashMap;
import java.util.PriorityQueue;

public class KMostFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        for (int i : map.keySet()) {
            heap.add(i);
        }

        int idx = 0;
        int[] res = new int[k];
        while (k > 0) {
            res[idx++] = heap.poll();
            k--;
        }
        return res;
    }

}
