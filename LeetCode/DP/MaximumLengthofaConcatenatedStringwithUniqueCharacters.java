
import java.util.*;

class Solution {
    public int maxLength(List<String> arr) {
        return solve(arr, 0, "");
    }

    public static int solve(List<String> arr, int index, String temp) {

        if (index == arr.size()) {
            return temp.length();
        }

        int include = 0;
        int exclude = 0;

        String curr = arr.get(index);

        if (!hasDup(temp, curr)) {
            include = solve(arr, index + 1, temp + curr);
        }

        exclude = solve(arr, index + 1, temp);

        return Math.max(include, exclude);
    }

    public static boolean hasDup(String s1, String s2) {
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            int idx = s1.charAt(i) - 'a';

            if (freq[idx] > 0) {
                return true;
            }

            freq[idx]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            int idx = s2.charAt(i) - 'a';

            if (freq[idx] > 0) {
                return true;
            }

            freq[idx]++;
        }

        return false;
    }
}
