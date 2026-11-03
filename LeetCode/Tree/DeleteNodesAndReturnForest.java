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

    List<TreeNode> ans = new ArrayList<>();
    Set<Integer> set = new HashSet<>();

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

       
        for (int x : to_delete) {
            set.add(x);
        }

        
        dfs(root, true);

        
        return ans;
    }

    public TreeNode dfs(TreeNode node, boolean isRoot) {

      
        if (node == null) {
            return null;
        }

       
        boolean deleted = set.contains(node.val);

       
        if (isRoot && !deleted) {
            ans.add(node);
        }

        node.left = dfs(node.left, deleted);
        node.right = dfs(node.right, deleted);

        
        return deleted ? null : node;
    }
}
