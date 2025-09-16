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
    int number =0;
    int sum =0;
    public void recur(TreeNode root){
        if(root == null){
            return ;
        }
        number =number *10 +root.val;
        recur(root.left);
        recur(root.right);
        if(root.left == null && root.right==null){
            sum = sum + number;
        }
        number=number /10;


    }
    public int sumNumbers(TreeNode root) {
        recur(root);
        return sum ;
        
    }
}