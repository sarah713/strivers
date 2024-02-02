import java.util.HashMap;
import java.util.Map;

public class MaxSubarray {
    public static int maxZero(int[] arr, int n) {
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxLen = i + 1;
            } else if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
