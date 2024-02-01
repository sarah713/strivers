import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntrvals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int[] row : intervals) {
            if (row[0] <= end) {
                end = Math.max(end, row[1]);
            } else {
                res.add(new int[] { start, end });
                start = row[0];
                end = row[1];
            }
        }
        res.add(new int[] { start, end });
        return res.toArray(new int[0][]);
    }
}
