class Solution {

    TreeNode prev = null;

    TreeNode first = null;

    TreeNode second = null;

    public void recoverTree(TreeNode root) {

        inorder(root);

        // swap values
        int temp = first.val;

        first.val = second.val;

        second.val = temp;
    }

    void inorder(TreeNode root) {

        if (root == null)
            return;

        inorder(root.left);

        // violation
        if (prev != null &&
            prev.val > root.val) {

            // first wrong node
            if (first == null) {

                first = prev;
            }

            // second wrong node
            second = root;
        }

        // update prev
        prev = root;

        inorder(root.right);
    }
}
