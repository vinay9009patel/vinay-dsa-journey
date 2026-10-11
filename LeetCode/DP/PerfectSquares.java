import java.util.Arrays;

class Solution {

    public int numSquares(int n) {

        int[] dp = new int[n + 1];

        Arrays.fill(dp, -1);

        return helper(dp, n);
    }

    public int helper(int[] dp, int n) {

        
        if (n == 0) {
            return 0;
        }

        
        if (dp[n] != -1) {
            return dp[n];
        }

        int minCount = Integer.MAX_VALUE;

        
        for (int i = 1; i * i <= n; i++) {

            int result = 1 + helper(dp, n - i * i);

            minCount = Math.min(minCount, result);
        }

       
        return dp[n] = minCount;
    }
}
