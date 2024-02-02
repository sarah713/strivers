import java.util.HashSet;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int longestStreak = 0;
        for (int i : nums) {
            while (!set.contains(i - 1)) {
                int cur = i;
                int streak = 1;
                while (set.contains(cur + 1)) {
                    cur += 1;
                    streak += 1;
                }
                longestStreak = Math.max(streak, longestStreak);
            }
        }
        return longestStreak;
    }
}
