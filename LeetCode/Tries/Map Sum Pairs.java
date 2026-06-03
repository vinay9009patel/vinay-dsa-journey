class MapSum {

    class Trie {
        Trie[] child = new Trie[26];
        boolean end;
        int val;
    }

    Trie root;

    public MapSum() {
        root = new Trie();
    }

    public void insert(String key, int val) {

        Trie curr = root;

        for (char ch : key.toCharArray()) {

            int idx = ch - 'a';

            if (curr.child[idx] == null) {
                curr.child[idx] = new Trie();
            }

            curr = curr.child[idx];
        }

        curr.end = true;
        curr.val = val;
    }

    int dfs(Trie curr) {

        if (curr == null) {
            return 0;
        }

        int sum = 0;

        if (curr.end) {
            sum += curr.val;
        }

        for (int i = 0; i < 26; i++) {
            sum += dfs(curr.child[i]);
        }

        return sum;
    }

    public int sum(String prefix) {

        Trie curr = root;

        for (char ch : prefix.toCharArray()) {

            int idx = ch - 'a';

            if (curr.child[idx] == null) {
                return 0;
            }

            curr = curr.child[idx];
        }

        return dfs(curr);
    }
}
