package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NexGreater {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer> map = new HashMap<>();

        int[] output = new int[nums1.length];
        Arrays.fill(output, -1);
        for (int i = 0; i < nums2.length; i++) {
            while (!st.isEmpty() && st.peek() < nums2[i]) {
                map.put(st.pop(), nums2[i]);
            }
            st.push(nums2[i]);
        }
        int idx = 0;
        for (int i : nums1) {
            if (map.containsKey(i)) {
                output[idx] = map.get(i);
            }
            idx++;
        }
        return output;
    }
}
