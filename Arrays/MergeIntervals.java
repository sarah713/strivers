package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> merged = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] row : intervals) {
            if (end >= row[1]) {
                end = Math.max(row[1], end);
            } else {
                merged.add(new int[] { start, end });
                start = row[0];
                end = row[1];
            }
        }
        merged.add(new int[] { start, end });
        return merged.toArray(new int[0][]);

    }

}
