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

    int preIdxPointer = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // store inorder indices
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] preorder, int inorderStart, int inorderEnd) {

        if (inorderStart > inorderEnd) return null;

        int rootVal = preorder[preIdxPointer++];
        TreeNode root = new TreeNode(rootVal);

        int index = map.get(rootVal);

        root.left = build(preorder, inorderStart, index - 1);
        root.right = build(preorder, index + 1, inorderEnd);

        return root;
    }
}
