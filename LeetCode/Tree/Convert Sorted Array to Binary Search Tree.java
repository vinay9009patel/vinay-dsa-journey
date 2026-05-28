class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {

        return bst(0, nums.length - 1, nums);
    }

    TreeNode bst(int start, int end, int[] nums) {

        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = bst(start, mid - 1, nums);

        root.right = bst(mid + 1, end, nums);

        return root;
    }
}
