class Solution {
    public int longestValidParentheses(String s) {
        int open = 0;   // count '('
        int close = 0;  // count ')'
        int max = 0;    // max valid length
        // LEFT → RIGHT
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // current char
            if (ch == '(') {
                open++; // increase open
            } else {
                close++; // increase close
            }
            if (open == close) {
                max = Math.max(max, open + close); // valid substring
            }
            else if (close > open) {
                open = 0;   // reset
                close = 0;  // reset
            }
        }
        // reset for reverse traversal
        open = 0;
        close = 0;

        // RIGHT → LEFT
        for (int i = s.length() - 1; i >= 0; i--) {

            char ch = s.charAt(i); // current char
            if (ch == '(') {
                open++; // increase open
            } else {
                close++; // increase close
            }
            if (open == close) {
                max = Math.max(max, open + close); // valid substring
            }
            else if (open > close) {
                open = 0;   // reset
                close = 0;  // reset
            }
        }
       return max; // final answer
    }
}
