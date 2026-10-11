
import java.util.Arrays;

class Solution {
    int[][] dp;

    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;

        if (n < d) {
            return -1;
        }

        dp = new int[n][d + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(jobDifficulty, d, 0, dp);
    }

    public int solve(int[] j, int d, int idx, int[][] dp) {
        int n = j.length;

        if (d == 1) {
            int max = 0;

            for (int i = idx; i < n; i++) {
                max = Math.max(max, j[i]);
            }

            return max;
        }

        if (dp[idx][d] != -1) {
            return dp[idx][d];
        }

        int max = 0;
        int ans = Integer.MAX_VALUE;

        for (int i = idx; i <= n - d; i++) {
            max = Math.max(max, j[i]);

            int remaining = solve(j, d - 1, i + 1, dp);

            ans = Math.min(ans, max + remaining);
        }

        return dp[idx][d] = ans;
    }
}
