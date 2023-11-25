public class LongestRepeatingChar {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26];

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            charCount[c - 'A']++;

            int operationsNeeded = end - start + 1;
            while (operationsNeeded > k) {
                charCount[s.charAt(start) - 'A']--;
                start++;
                operationsNeeded = end - start + 1 - getMaxCount(charCount);

            }
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }

    private int getMaxCount(int[] charCount) {
        int maxcnt = 0;
        for (int i : charCount) {
            maxcnt = Math.max(maxcnt, i);
        }
        return maxcnt;
    }
}
