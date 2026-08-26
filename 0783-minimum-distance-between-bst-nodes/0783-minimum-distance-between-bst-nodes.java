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
     int prev = -1;
     int diff = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return diff;
    }
    void inorder(TreeNode root){
        if(root == null)
           return;
     inorder( root.left);
     if( prev != -1){
        diff = Math.min(diff , root.val -prev);
     }
     prev = root.val;
     inorder(root.right);
    }
}