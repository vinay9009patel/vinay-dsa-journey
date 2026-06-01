class Solution {

    class TrieNode {

        TrieNode[] child = new TrieNode[26];
        boolean end;
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

        curr.end = true;
    }

    String findRoot(String word) {

        TrieNode curr = root;

        StringBuilder sb = new StringBuilder();

        for (char ch : word.toCharArray()) {

            int idx = ch - 'a';

            if (curr.child[idx] == null) {

                return word;
            }

            sb.append(ch);

            curr = curr.child[idx];

            if (curr.end) {

                return sb.toString();
            }
        }

        return word;
    }

    public String replaceWords(List<String> dictionary,
                               String sentence) {

        for (String word : dictionary) {

            insert(word);
        }

        String[] words = sentence.split(" ");

        StringBuilder ans = new StringBuilder();

        for (String word : words) {

            ans.append(findRoot(word));
            ans.append(" ");
        }

        ans.deleteCharAt(ans.length() - 1);

        return ans.toString();
    }
}
