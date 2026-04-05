class Solution {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack("", 0, 0, n, res);
        return res;
    }

    void backtrack(String str, int open, int close, int n, List<String> res) {
        if (str.length() == 2 * n) {
            res.add(str);
            return;
        }

        if (open < n) {
            backtrack(str + "(", open + 1, close, n, res);
        }
        if (close < open) {
            backtrack(str + ")", open, close + 1, n, res);
        }
    }
}
