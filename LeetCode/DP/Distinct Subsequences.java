class Solution {
    // dp[i][j]
    // number of ways to form
    // t from j onward
    // using s from i onward
    Integer dp[][];

    public int numDistinct(String s, String t) {
        // memo table
        dp = new Integer[s.length() + 1][t.length() + 1];
        // start recursion
        return solve(0, 0, s, t);
    }

    int solve(int i, int j, String s, String t) {
        // target completed
        // one valid subsequence found
        if (j >= t.length())
            return 1;
        // source finished
        // target still left
        if (i >= s.length())
            return 0;
        // already computed state
        if (dp[i][j] != null)
            return dp[i][j];
        int take = 0;
        int skip = 0;
        // current character matched
        boolean match = s.charAt(i) == t.charAt(j);
        // take current character
        if (match) {
            take = solve(i + 1, j + 1, s, t);
        }
        // skip current character
        skip = solve(i + 1, j, s, t);
        // total ways
        return dp[i][j] = take + skip;
    }
}
