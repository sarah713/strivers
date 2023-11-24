import java.util.HashSet;
import java.util.Set;

public class LongestConsec {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longestStreak = 0;
        for (int i : nums) {
            set.add(i);
        }
        for (int i : nums) {
            while (!set.contains(i - 1)) {
                int curStreak = 1;
                int cur = i;
                while (set.contains(cur + 1)) {
                    curStreak++;
                    cur += 1;
                }
                longestStreak = Math.max(curStreak, longestStreak);
            }
        }
        return longestStreak;

    }
}
