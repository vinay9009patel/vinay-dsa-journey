class Solution {

    TreeNode prev = null;

    public boolean isValidBST(
            TreeNode root) {

        return check(root);
    }

    boolean check(TreeNode root) {

        if (root == null)
            return true;

        // left
        if (!check(root.left))
            return false;

        // current node check
        if (prev != null &&
            prev.val >= root.val) {

            return false;
        }

        // update previous
        prev = root;

        // right
        if (!check(root.right))
            return false;

        return true;
    }
}
