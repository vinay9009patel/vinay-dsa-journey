class Solution {

    class Trie {
        Trie[] child = new Trie[26];
        String word;
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

        curr.word = word;
    }

    void dfs(Trie curr, List<String> store) {

        if (curr == null || store.size() == 3) {
            return;
        }

        if (curr.word != null) {
            store.add(curr.word);
        }

        for (int i = 0; i < 26; i++) {
            dfs(curr.child[i], store);
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        Arrays.sort(products);

        for (String word : products) {
            insert(word);
        }

        List<List<String>> ans = new ArrayList<>();

        Trie curr = root;

        for (char ch : searchWord.toCharArray()) {

            int idx = ch - 'a';

            if (curr != null) {
                curr = curr.child[idx];
            }

            List<String> store = new ArrayList<>();

            dfs(curr, store);

            ans.add(store);
        }

        return ans;
    }
}
