class Solution {

    class Trie {
        Trie[] child = new Trie[26];
        boolean end;
    }

    Trie root = new Trie();

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

    boolean isValid(String word) {

        Trie curr = root;

        for (char ch : word.toCharArray()) {

            int idx = ch - 'a';

            curr = curr.child[idx];

            if (!curr.end) {
                return false;
            }
        }

        return true;
    }

    public String longestWord(String[] words) {

        for (String word : words) {
            insert(word);
        }

        String ans = "";

        for (String word : words) {

            if (isValid(word)) {

                if (word.length() > ans.length()) {

                    ans = word;

                } else if (word.length() == ans.length()
                        && word.compareTo(ans) < 0) {

                    ans = word;
                }
            }
        }

        return ans;
    }
}
