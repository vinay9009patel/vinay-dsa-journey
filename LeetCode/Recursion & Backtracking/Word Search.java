class Solution {

    boolean[][] visited;

    public boolean exist(char[][] board, String word) {

        visited = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {

                if (dfs(board, word, i, j, 0)) {

                    return true;
                }
            }
        }

        return false;
    }

    boolean dfs(char[][] board,
                String word,
                int row,
                int col,
                int idx) {

        // Base Case
        if (idx == word.length()) {

            return true;
        }

        // Boundary Check
        if (row < 0 ||
            row >= board.length ||
            col < 0 ||
            col >= board[0].length) {

            return false;
        }

        // Already Visited
        if (visited[row][col]) {

            return false;
        }

        // Character Mismatch
        if (board[row][col] != word.charAt(idx)) {

            return false;
        }

        // Mark Visited
        visited[row][col] = true;

        boolean found =
                dfs(board, word, row + 1, col, idx + 1) || // Down
                dfs(board, word, row - 1, col, idx + 1) || // Up
                dfs(board, word, row, col + 1, idx + 1) || // Right
                dfs(board, word, row, col - 1, idx + 1);   // Left

        // Backtrack
        visited[row][col] = false;

        return found;
    }
}
