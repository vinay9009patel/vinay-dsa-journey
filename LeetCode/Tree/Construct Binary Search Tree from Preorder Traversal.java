/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int index = 0;

    public TreeNode bstFromPreorder(
            int[] preorder) {

        return bst(preorder,
                   Integer.MIN_VALUE,
                   Integer.MAX_VALUE);
    }

    TreeNode bst(int[] preorder,
                 int min,
                 int max) {

        // array finished
        if (index >= preorder.length)
            return null;

        int val = preorder[index];

        // invalid range
        if (val < min || val > max)
            return null;

        // create node
        TreeNode root =
                new TreeNode(val);

        index++;

        // left subtree
        root.left =
                bst(preorder,
                    min,
                    val);

        // right subtree
        root.right =
                bst(preorder,
                    val,
                    max);

        return root;
    }
}
