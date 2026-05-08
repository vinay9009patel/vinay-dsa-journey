class Solution {

    public boolean isMatch(String s, String p) {

        // start recursion from index 0
        return solve(0, 0, s, p);
    }

    boolean solve(int i, int j, String s, String p) {

        // both string and pattern finished
        if (i >= s.length() && j >= p.length()) {

            return true;
        }

        // pattern finished but string left
        if (j >= p.length()) {

            return false;
        }

        // current character match check
        boolean match = (i < s.length()) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        // check if next character is '*'
        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

            // OPTION 1:
            // skip current pattern and '*'
            boolean skip = solve(i, j + 2, s, p);

            // OPTION 2:
            // use current pattern again
            boolean take = match && solve(i + 1, j, s, p);

            // if any path true
            return skip || take;
        }

        // normal matching
        if (match) {

            return solve(i + 1, j + 1, s, p);
        }

        // no match found
        return false;
    }
}
