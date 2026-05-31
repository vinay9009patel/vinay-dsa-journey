🚀 Day 30 of #100DaysOfLeetCode

Solved: LeetCode 208 – Implement Trie (Prefix Tree)

Today I learned the fundamentals of the Trie (Prefix Tree) data structure and implemented the three core operations:

✅ insert(word)
✅ search(word)
✅ startsWith(prefix)

Key Concepts:

* Trie stores words character by character.
* Each node contains 26 children (a-z) and an end flag.
* insert() creates missing nodes and marks the last character as a complete word.
* search() checks whether a complete word exists.
* startsWith() checks whether a prefix path exists.

Time Complexity:

* insert() → O(L)
* search() → O(L)
* startsWith() → O(L)

Where L = length of the word/prefix.

Java Solution:

```java
class Trie {

    Trie[] child;
    boolean end;

    Trie root;

    public Trie() {

        child = new Trie[26];
        end = false;

        if (root == null) {
            root = this;
        }
    }

    public void insert(String word) {

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

    public boolean search(String word) {

        Trie curr = root;

        for (char ch : word.toCharArray()) {

            int idx = ch - 'a';

            if (curr.child[idx] == null) {
                return false;
            }

            curr = curr.child[idx];
        }

        return curr.end;
    }

    public boolean startsWith(String prefix) {

        Trie curr = root;

        for (char ch : prefix.toCharArray()) {

            int idx = ch - 'a';

            if (curr.child[idx] == null) {
                return false;
            }

            curr = curr.child[idx];
        }

        return true;
    }
}
```

What I learned:

* Root node remains fixed throughout traversal.
* A temporary pointer (curr) is used to move through the Trie.
* search() requires both path existence and end = true.
* startsWith() only requires path existence.
* Multiple words can share the same prefix path, making Trie memory efficient for dictionary-based problems.

#100DaysOfLeetCode #LeetCode208 #Trie #PrefixTree #Java #DSA #CodingJourney #SoftwareEngineering #Programming
