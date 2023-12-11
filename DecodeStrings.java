public class DecodeStrings {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= s.length(); i++) {
            int oneLen = Integer.valueOf(s.substring(i - 1, i));
            int twoLen = Integer.valueOf(s.substring(i - 2, i));
            if (oneLen >= 1) {
                dp[i] += dp[i - 1];
            }
            if (twoLen >= 10 && twoLen <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}
