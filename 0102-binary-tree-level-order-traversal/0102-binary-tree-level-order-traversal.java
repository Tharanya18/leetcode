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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ls = new ArrayList<>();
        if(root == null){
            return ls;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(! q.isEmpty()){
           int n = q.size();
           List<Integer> lst = new ArrayList<>();
           for( int i = 0 ; i < n ; i++){
            TreeNode ele = q.poll();
            lst.add(ele.val);
            if(ele.left != null){
                q.add(ele.left);
            }
            if(ele.right != null){
                q.add(ele.right);
            }
           }
           ls.add(lst);
        }
        return ls;
    }
}