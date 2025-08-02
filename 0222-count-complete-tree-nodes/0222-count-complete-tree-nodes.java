class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0; // No nodes in an empty tree
        }

        // Count the root node + left subtree + right subtree
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return 1 + leftCount + rightCount;
    }
}