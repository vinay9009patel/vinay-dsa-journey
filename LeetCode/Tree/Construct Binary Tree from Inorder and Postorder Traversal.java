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

    int postOrderIdx;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postOrderIdx = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(postorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] postorder, int inorderStart, int inorderEnd) {

        if (inorderStart > inorderEnd) return null;

        int rootVal = postorder[postOrderIdx--];

        TreeNode root = new TreeNode(rootVal);

        int indexInorder = map.get(rootVal);

        // right first
        root.right = build(postorder, indexInorder + 1, inorderEnd);
        //left second
        root.left = build(postorder, inorderStart, indexInorder - 1);

        return root;
    }
}
