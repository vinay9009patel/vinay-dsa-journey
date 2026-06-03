class Solution {

    class Trie {
        Trie[] child = new Trie[26];
        boolean end;
    }

    Trie root = new Trie();

    String s;
    Boolean[] dp;

    void insert(String word) {

        Trie curr = root;

        for (char ch : word.toCharArray()) {

            int idx = ch - 'a';

            if (curr.child[idx] == null) {
                curr.child[idx] = new Trie();
            }

            curr = curr.child[idx];
        }

        curr.end = true;
    }

    boolean dfs(int start) {

        if (start == s.length()) {
            return true;
        }

        if (dp[start] != null) {
            return dp[start];
        }

        Trie curr = root;

        for (int i = start; i < s.length(); i++) {

            int idx = s.charAt(i) - 'a';

            if (curr.child[idx] == null) {
                break;
            }

            curr = curr.child[idx];

            if (curr.end) {

                if (dfs(i + 1)) {

                    dp[start] = true;
                    return true;
                }
            }
        }

        dp[start] = false;
        return false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {

        this.s = s;

        for (String word : wordDict) {
            insert(word);
        }

        dp = new Boolean[s.length()];

        return dfs(0);
    }
}
