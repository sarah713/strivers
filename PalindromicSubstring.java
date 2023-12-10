public class PalindromicSubstring {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expandAroundCenter(s, i, i + 1);
            count += expandAroundCenter(s, i, i);
        }
        return count;
    }

    public int expandAroundCenter(String s, int i, int j) {
        int cnt = 0;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            cnt++;
            i++;
            j--;
        }
        return cnt;
    }
}
