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
    ArrayList<Integer> answer;
    public void recur(TreeNode root){
        if(root==null){
            return;
        }
        answer.add(root.val);
        recur(root.left);
        recur(root.right);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        answer = new ArrayList<>();
        recur(root);
        return answer;
        
    }
}