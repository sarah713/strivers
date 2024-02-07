public class EggDropping {
    static int eggDrop(int N, int K) {
        int[][] dp = new int[N + 1][K + 1];

        for (int i = 1; i <= N; i++) {
            dp[i][1] = 1;
            dp[i][0] = 0;
        }
        for (int j = 1; j <= K; j++) {
            dp[1][j] = j;
        }
        for (int i = 2; i <= N; i++) {
            for (int j = 2; j <= K; j++) {
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = 1; k <= j; k++) {
                    int breaks = dp[i - 1][k - 1];
                    int doesNotBreak = dp[i][j - k];
                    int drops = Math.max(breaks, doesNotBreak) + 1;
                    dp[i][j] = Math.min(dp[i][j], drops);
                }
            }
        }
        return dp[N][K];
    }
}
