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

    class Pair {
        TreeNode node;
        int idx;

        Pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        int maxWidth = 0;

        while (!q.isEmpty()) {

            int size = q.size();
            int min = q.peek().idx;

            int first = 0, last = 0;

            for (int i = 0; i < size; i++) {

                Pair p = q.poll();
                int curr = p.idx - min;

                if (i == 0) first = curr;
                if (i == size - 1) last = curr;

                if (p.node.left != null) {
                    q.offer(new Pair(p.node.left, curr * 2 + 1));
                }

                if (p.node.right != null) {
                    q.offer(new Pair(p.node.right, curr * 2 + 2));
                }
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }
}
