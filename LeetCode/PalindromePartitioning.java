import java.util.*;

class Solution {

    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        backtrack(s, 0, new ArrayList<>(), result);

        return result;
    }

    void backtrack(String s, int start, List<String> path, List<List<String>> result) {

        // BASE CASE
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }

        // TRY ALL SUBSTRINGS
        for (int end = start; end < s.length(); end++) {

            // check palindrome
            if (isPalindrome(s, start, end)) {

                // CHOOSE
                String part = s.substring(start, end + 1);
                path.add(part);

                // EXPLORE
                backtrack(s, end + 1, path, result);

                // UNDO
                path.remove(path.size() - 1);
            }
        }
    }

    // PALINDROME CHECK
    boolean isPalindrome(String s, int left, int right) {

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // MAIN METHOD (for testing)
    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "aab";

        List<List<String>> ans = obj.partition(s);

        System.out.println(ans);
    }
}
