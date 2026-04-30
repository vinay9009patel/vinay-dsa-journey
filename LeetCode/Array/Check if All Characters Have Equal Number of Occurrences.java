class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        int freq = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                if (freq == 0) {
                    freq = arr[i];   
                } else if (arr[i] != freq) {
                    return false;
                }
            }
        }

        return true;
    }
}
