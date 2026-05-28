import java.util.*;

class BSTIterator {

    Deque<TreeNode> st = new ArrayDeque<>();

    public BSTIterator(TreeNode root) {

        pushLeft(root);
    }

    public int next() {

        TreeNode curr = st.pop();

        if (curr.right != null) {

            pushLeft(curr.right);
        }

        return curr.val;
    }

    public boolean hasNext() {

        return !st.isEmpty();
    }

    void pushLeft(TreeNode node) {

        while (node != null) {

            st.push(node);

            node = node.left;
        }
    }
}
