package practice;

import java.util.PriorityQueue;

public class KthLargestEle {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for (int i : nums) {
            heap.offer(i);
        }
        while (k-- > 0) {
            heap.poll();
        }
        return heap.peek();
    }
}
