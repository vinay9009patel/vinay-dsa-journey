class Solution {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        String word; // complete word store karenge
    }

    TrieNode root = new TrieNode();

    void insert(String word) {

        TrieNode curr = root;

        for (char ch : word.toCharArray()) {

            int idx = ch - 'a';

            if (curr.child[idx] == null) {
                curr.child[idx] = new TrieNode();
            }

            curr = curr.child[idx];
        }

        curr.word = word;
    }

    public List<String> findWords(char[][] board, String[] words) {

        List<String> ans = new ArrayList<>();

        // Trie Build
        for (String word : words) {
            insert(word);
        }

        // Board Traversal
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                dfs(board, i, j, root, ans);
            }
        }

        return ans;
    }

    void dfs(char[][] board,
             int row,
             int col,
             TrieNode curr,
             List<String> ans) {

        // Boundary
        if (row < 0 ||
            row >= board.length ||
            col < 0 ||
            col >= board[0].length) {

            return;
        }

        char ch = board[row][col];

        // Visited ya invalid
        if (ch == '#') {
            return;
        }

        int idx = ch - 'a';

        // Trie path exist nahi karta
        if (curr.child[idx] == null) {
            return;
        }

        curr = curr.child[idx];

        // Word mila
        if (curr.word != null) {

            ans.add(curr.word);

            // duplicate avoid
            curr.word = null;
        }

        // Mark Visited
        board[row][col] = '#';

        // 4 Directions
        dfs(board, row + 1, col, curr, ans);
        dfs(board, row - 1, col, curr, ans);
        dfs(board, row, col + 1, curr, ans);
        dfs(board, row, col - 1, curr, ans);

        // Backtrack
        board[row][col] = ch;
    }
}
