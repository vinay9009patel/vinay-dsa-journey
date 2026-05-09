class Solution {
    // dp[i][j] means: can s from index i match p from index j ?
    Boolean dp[][];

    public boolean isMatch(String s, String p) {

        // +1 because indices can go till length
        dp = new Boolean[s.length() + 1][p.length() + 1];

        // start recursion from 0,0
        return solve(0, 0, s, p);
    }

    boolean solve(int i, int j, String s, String p) {
        // already calculated state
        if (dp[i][j] != null)
            return dp[i][j];
        // both string and pattern finished
        // successful match
        if (i == s.length() && j == p.length()) {
            return dp[i][j] = true;
        }
        // pattern finished but string left
        // impossible match
        if (j == p.length()) {
            return dp[i][j] = false;
        }
        // current character matching check
        boolean match = i < s.length() && // string should exist
                (s.charAt(i) == p.charAt(j) // same char
                        ||
                        p.charAt(j) == '?' // '?' matches any one char
                );
        // '*' case
        if (p.charAt(j) == '*') {
            // skip '*'
            // '*' matches empty string
            boolean skip = solve(i, j + 1, s, p);
            // use '*'
            // '*' consumes current character
            boolean take = i < s.length() &&
                    solve(i + 1, j, s, p);
            // if any path true -> answer true
            return dp[i][j] = skip || take;
        }
        // normal character matched
        if (match) {
         // move both pointers
            return dp[i][j] = solve(i + 1, j + 1, s, p);
        }
        // no match found
        return dp[i][j] = false;
    }
}
