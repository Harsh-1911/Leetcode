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
    static ArrayList<Integer> answer;
    static void recursion( TreeNode root)
    {
        if(root == null)
        {
            return ;

        }
        recursion(root.left);
        
        recursion(root.right);
        answer.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        answer = new ArrayList<>();
        recursion(root);
        return answer;
    }
}