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
    ArrayList<Integer>answer ;

    public void recur(TreeNode root){
        if(root== null){
            return;
        }
        recur(root.left);
        answer.add(root.val);
        recur(root.right);

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        answer = new ArrayList<>();
        recur(root);
        return answer;
        
    }
}