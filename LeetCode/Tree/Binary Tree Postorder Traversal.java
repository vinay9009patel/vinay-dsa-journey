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
    public List<Integer> postorderTraversal(TreeNode root) {
List<Integer> result = new  ArrayList<>();
       
      pt(root , result) ;

        return result;
    }

    void pt(TreeNode node , List<Integer> result){
      
      if(node ==null) return ;
      pt(node.left ,result);
      pt(node.right ,result);
      result.add(node.val);
    }
}
