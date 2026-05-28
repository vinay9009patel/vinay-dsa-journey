class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {

        if (root == null) {
            return null;
        }

        if (root.val < key) {

            root.right = deleteNode(root.right, key);
        }

        else if (root.val > key) {

            root.left = deleteNode(root.left, key);
        }

        else {

            // Leaf node

            if (root.left == null && root.right == null) {

                return null;
            }

            // One child

            if (root.left == null) {

                return root.right;
            }

            if (root.right == null) {

                return root.left;
            }

            // Two children

            TreeNode smallNode = helper(root.right);

            root.val = smallNode.val;

            root.right =
                deleteNode(root.right, smallNode.val);
        }

        return root;
    }

    TreeNode helper(TreeNode root) {

        while (root.left != null) {

            root = root.left;
        }

        return root;
    }
}
