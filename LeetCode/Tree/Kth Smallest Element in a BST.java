class Solution {

    int count;

    int ans;

    public int kthSmallest(TreeNode root,
                           int k) {

        count = k;

        inorder(root);

        return ans;
    }

    void inorder(TreeNode root) {

        if (root == null)
            return;

        // left
        inorder(root.left);

        // visit current node
        count--;

        // kth smallest found
        if (count == 0) {

            ans = root.val;

            return;
        }

        // right
        inorder(root.right);
    }
}
